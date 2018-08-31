package frame;

/*
>gives functionality to the three buttons
on title bar - exit, minimize, maximize

>takes jlabel "drag" as argument and gives
it the ability to move frame by dragging
*/

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame {
    
    private void setupTitleBar() {
        drag.addMouseMotionListener(new MouseMotionAdapter() {            
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen();
                int y = e.getYOnScreen();
                if (frame.getExtendedState() == 0) frame.setLocation(x - xMouse - 30, y - yMouse);
            }
        });
        drag.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                xMouse = e.getX();
                yMouse = e.getY();
                
                if (e.getClickCount() == 2) {
                    if (frame.getExtendedState() == 0) {
                        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    }
                }
            }
        });
    }
    
    private void setupButtons() {
        exit.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                System.exit(0);
            }
            public void mouseEntered(MouseEvent e) {
               exit.setIcon(new javax.swing.ImageIcon(getClass().getResource(imgdir + "closebright.png")));

            }
            public void mouseExited(MouseEvent e) {
                exit.setIcon(new javax.swing.ImageIcon(getClass().getResource(imgdir + "close.png")));
            }
        });
        minimize.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                frame.setState(Frame.ICONIFIED);
            }
            public void mouseEntered(MouseEvent e) {
                minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource(imgdir + "minimizebright.png")));
            }
            public void mouseExited(MouseEvent e) {
                minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource(imgdir + "minimize.png")));
            }
        });
        maximize.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int currentState = (frame.getExtendedState() == 0)? JFrame.MAXIMIZED_BOTH : JFrame.NORMAL;
                frame.setExtendedState(currentState);
            }
            public void mouseEntered(MouseEvent e) {
               maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource(imgdir + "maximizebright.png")));

            }
            public void mouseExited(MouseEvent e) {
                maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource(imgdir + "maximize.png")));
            }
        });
    }
    
    private final JFrame frame;
    private final JLabel exit, minimize, maximize, drag;
    private final String imgdir = "/images/";
    private int xMouse, yMouse;
    
    public MyFrame(JFrame frame, JLabel exit, JLabel minimize, JLabel maximize, JLabel drag) {
        this.frame = frame;
        this.exit = exit;
        this.minimize = minimize;
        this.maximize = maximize;
        this.drag = drag;
        
        setupButtons();
        setupTitleBar();
    }
}
