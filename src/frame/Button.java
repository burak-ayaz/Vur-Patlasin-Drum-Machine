package frame;

import java.awt.Color;
import javax.sound.sampled.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Button {
    
    private AudioInputStream audioInputStream;
    private AudioFormat af;
    private int size;
    private byte[] audio;
    private DataLine.Info info;
    private Clip clip;
    private boolean isPressed;
    private JLabel button;
    private Color normalColor, brighterColor, currentColor;
    private static volatile boolean cleaning = false;
    private List<Clip> clips = new ArrayList<Clip>();
    private List<Clip> clipsToRemove = new ArrayList<Clip>();
    private boolean stopOnRelease = false;
    
    public void setStopOnRelease(boolean b) {
        stopOnRelease = b;
    }
    
    public boolean stopsOnRelease() {
        return stopOnRelease;
    }
    
    public Clip getClip() {
        return clip;
    }
    
    public Button(String soundname, JLabel button) {
        setup(soundname);
        this.button = button;
        normalColor = button.getBackground();
        brighterColor = button.getBackground().brighter().brighter().brighter().brighter().brighter();
        currentColor = normalColor;
    }
    
    public Button(String soundname) {
        setup(soundname);
    }
    
    public void changePressed() {
        isPressed = !isPressed;
        if (button != null) {
            currentColor = (currentColor == normalColor)? brighterColor : normalColor;
            button.setBackground(currentColor);
        }
    }
    
    public boolean isPressed() {
        return isPressed;
    }
    
    public void setup(String soundname) {
        try {
            audioInputStream = AudioSystem.getAudioInputStream(
                    new File("C:\\Users\\BURAK\\Documents\\NetBeansProjects\\Drumpad\\src\\sounds\\" + soundname));
            af = audioInputStream.getFormat();
            size = (int) (af.getFrameSize() * audioInputStream.getFrameLength());
            audio = new byte[size];
            info = new DataLine.Info(Clip.class, af, size);
            audioInputStream.read(audio, 0, size);
        } catch (IOException | UnsupportedAudioFileException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
    
    public void play() {
        try {
            if (clip != null && clip.isRunning()) clip.stop();
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(af, audio, 0, size);
            clip.start();
            
            clips.add(clip);
            if (clips.size() > 1) closeClips();
        } catch (LineUnavailableException e) {e.printStackTrace(); System.exit(1);}
    }
    
    private synchronized void closeClips() {
        if (cleaning) return;
        cleaning = true;
        new Thread(new Runnable() {
            public void run() {
                for (Clip c : clips) {
                    if (!c.isRunning()) {
                        c.close();
                        clipsToRemove.add(c);
                    }
                }
                clips.removeAll(clipsToRemove);
                clipsToRemove.clear();
                cleaning = false;
            }
        }).start();
    }
}