package frame;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;

public class PanelListener {
    private Map<Integer, Button> map = new HashMap<>();
    
    public void addButton(Button button, int keyCode) {
        map.put(keyCode, button);
    }
    
    private void someKeyPressed(Button button) {
        if (button == null) return;
        if (button.isPressed()) return;
        button.changePressed();
        button.play();
    }
    
    private void someKeyReleased(Button button) {
        if (button == null) return;
        button.changePressed();
        if (button.stopsOnRelease()) {
            button.getClip().stop();
        }
    }
     
    public PanelListener(JPanel panel) {
        panel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                someKeyPressed(map.get(evt.getKeyCode()));
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
               someKeyReleased(map.get(evt.getKeyCode()));
            }
        });
    }
}
