package frame;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Main extends JFrame {
    
    private Color firstColor = new Color(20, 120, 255);
    private Color secondColor = new Color(255, 20, 255);
    private Color thirdColor = new Color(255, 150, 0);
    private Color fourthColor = new Color(0,150,0);
    private Color fifthColor = new Color(170, 30, 30);
    private Color sixthColor = new Color(100, 90, 60);
    private Color seventhColor = new Color(60, 90, 100);
    
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(20,20,20));
        new MyFrame(this, exit, minimize, maximize, drag);
        
        Button kick = new Button("kick.wav", kickButton);
        Button hihat = new Button("hihat.wav", hihatButton);
        Button snare = new Button("snare.wav", snareButton);
        Button _808 = new Button("808.wav", _808Button);
        Button melody = new Button("melody.wav", melodyButton);
        Button hihat1 = new Button("hihat1.wav", hihat1Button);
        Button hihat2 = new Button("hihat2.wav", hihat2Button);
        Button openHihat = new Button("openhihat.wav", openHihatButton);
        Button whoop = new Button("whoop.wav", whoopButton);
        Button hihatroll = new Button("hihatfill.wav", hihatrollButton);
        Button vocal = new Button("vocal1.wav", vocalButton);
        Button snareroll = new Button("snarefill.wav", snareRollButton);
        
        melody.setStopOnRelease(true);
        whoop.setStopOnRelease(true);
        hihatroll.setStopOnRelease(true);
        snareroll.setStopOnRelease(true);
        
        PanelListener pl = new PanelListener(panel);
        pl.addButton(kick, KeyEvent.VK_K);
        pl.addButton(hihat, KeyEvent.VK_O);
        pl.addButton(snare, KeyEvent.VK_P);
        pl.addButton(_808, KeyEvent.VK_J);
        pl.addButton(melody, KeyEvent.VK_F);
        pl.addButton(hihat1, KeyEvent.VK_I);
        pl.addButton(hihat2, KeyEvent.VK_U);
        pl.addButton(openHihat, KeyEvent.VK_L);
        pl.addButton(whoop, KeyEvent.VK_D);
        pl.addButton(hihatroll, KeyEvent.VK_C);
        pl.addButton(vocal, KeyEvent.VK_V);
        pl.addButton(snareroll, KeyEvent.VK_X);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        kickButton = new javax.swing.JLabel();
        hihatButton = new javax.swing.JLabel();
        _808Button = new javax.swing.JLabel();
        snareButton = new javax.swing.JLabel();
        melodyButton = new javax.swing.JLabel();
        hihat2Button = new javax.swing.JLabel();
        openHihatButton = new javax.swing.JLabel();
        hihat1Button = new javax.swing.JLabel();
        hihatrollButton = new javax.swing.JLabel();
        whoopButton = new javax.swing.JLabel();
        snareRollButton = new javax.swing.JLabel();
        vocalButton = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        drag = new javax.swing.JLabel();
        maximize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel.setBackground(new Color(40,40,40));
        panel.setFocusable(true);

        kickButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kickButton.setText("K");
        kickButton.setOpaque(true);
        kickButton.setBackground(firstColor);

        hihatButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hihatButton.setText("O");
        hihatButton.setOpaque(true);
        hihatButton.setBackground(firstColor);

        _808Button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _808Button.setText("J");
        _808Button.setOpaque(true);
        _808Button.setBackground(firstColor);

        snareButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        snareButton.setText("P");
        snareButton.setOpaque(true);
        snareButton.setBackground(firstColor);

        melodyButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        melodyButton.setText("F");
        melodyButton.setOpaque(true);
        melodyButton.setBackground(secondColor);

        hihat2Button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hihat2Button.setText("U");
        hihat2Button.setOpaque(true);
        hihat2Button.setBackground(thirdColor);

        openHihatButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        openHihatButton.setText("L");
        openHihatButton.setOpaque(true);
        openHihatButton.setBackground(thirdColor);

        hihat1Button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hihat1Button.setText("I");
        hihat1Button.setOpaque(true);
        hihat1Button.setBackground(thirdColor);

        hihatrollButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hihatrollButton.setText("C");
        hihatrollButton.setOpaque(true);
        hihatrollButton.setBackground(fifthColor);

        whoopButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whoopButton.setText("D");
        whoopButton.setOpaque(true);
        whoopButton.setBackground(fourthColor);

        snareRollButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        snareRollButton.setText("X");
        snareRollButton.setOpaque(true);
        snareRollButton.setBackground(seventhColor);

        vocalButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vocalButton.setText("V");
        vocalButton.setOpaque(true);
        vocalButton.setBackground(sixthColor);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(melodyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(whoopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hihatrollButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(snareRollButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_808Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hihat1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(hihat2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(openHihatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vocalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(kickButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hihatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(snareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(snareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hihatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_808Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kickButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(melodyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(whoopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hihatrollButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(snareRollButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hihat2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openHihatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hihat1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vocalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimize.png"))); // NOI18N

        drag.setText("Vur Patlasın 1.0");
        drag.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        drag.setFont(new Font("consolas", Font.PLAIN, 13));
        drag.setForeground(new Color(255,255,255));

        maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/maximize.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minimize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maximize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(drag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(logo)
                                    .addComponent(minimize, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(maximize, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(exit, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel _808Button;
    private javax.swing.JLabel drag;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel hihat1Button;
    private javax.swing.JLabel hihat2Button;
    private javax.swing.JLabel hihatButton;
    private javax.swing.JLabel hihatrollButton;
    private javax.swing.JLabel kickButton;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel maximize;
    private javax.swing.JLabel melodyButton;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel openHihatButton;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel snareButton;
    private javax.swing.JLabel snareRollButton;
    private javax.swing.JLabel vocalButton;
    private javax.swing.JLabel whoopButton;
    // End of variables declaration//GEN-END:variables

}
