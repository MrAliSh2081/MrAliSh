package gui;

import gui.image.ImageAddress;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Scores extends JPanel {
    private JLabel score1;
    private JLabel score2;
    private JLabel score3;
    private JButton exit;

    private JPanel panel = new JPanel() {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2D = (Graphics2D) g;
            Image image = new ImageIcon(ImageAddress.SCORE).getImage();
            g2D.drawImage(image, 0, 40, 1000, 760, null);

        }

    };

    public Scores() {
        this.setSize(SuperMarioFrame.WIDTH, SuperMarioFrame.HEIGHT);
        this.setLayout(null);

        init();
        addListener();
        add();
    }

    private void init() {
        panel.setSize(1000, 800);
        panel.setBackground(Color.ORANGE);
        panel.setLayout(null);

        score1 = new JLabel("First rate: 0");
        score1.setFont(new Font(null, Font.BOLD, 15));
        score1.setBounds(50, 10, 200, 20);
        score1.setForeground(Color.WHITE);


        score2 = new JLabel("Second rate: 0");
        score2.setFont(new Font(null, Font.BOLD, 15));
        score2.setBounds(250, 10, 200, 20);
        score2.setForeground(Color.WHITE);


        score3 = new JLabel("Third rate: 0");
        score3.setFont(new Font(null, Font.BOLD, 15));
        score3.setBounds(450, 10, 200, 20);
        score3.setForeground(Color.WHITE);

        exit = new JButton();
        exit.setText("Exit");
        exit.setBackground(Color.BLACK);
        exit.setForeground(Color.WHITE);
        exit.setBounds(900, 10, 80, 20);
        exit.setFocusable(false);

    }

    private void add() {
        panel.add(score1);
        panel.add(score2);
        panel.add(score3);
        panel.add(exit);
        this.add(panel);
    }

    private void addListener() {
        exit.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ((SuperMarioFrame) SwingUtilities.getWindowAncestor
                        (Scores.this)).setContentPane
                        (new MainPage());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}