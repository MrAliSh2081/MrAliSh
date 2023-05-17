package gui;

import gui.image.ImageAddress;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Store extends JPanel {
    private JLabel character;
    private JButton c1;
    private JButton c2;
    private JButton c3;
    private JButton c4;

    private JButton exit;

    private JPanel panel = new JPanel() {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2D = (Graphics2D) g;
            Image image = new ImageIcon(ImageAddress.STORE).getImage();
            g2D.drawImage(image, 120, 0, 900, 800, null);

        }

    };

    public Store() {
        this.setSize(SuperMarioFrame.WIDTH, SuperMarioFrame.HEIGHT);
        this.setLayout(null);

        init();
        addListener();
        add();

    }

    private void init() {
        panel.setSize(1000, 800);
        panel.setBackground(Color.PINK);
        panel.setLayout(null);


        character = new JLabel("CHARACTERS");
        character.setFont(new Font(null, Font.BOLD, 15));
        character.setBounds(10, 30, 200, 60);
        character.setForeground(Color.WHITE);


        c1 = new JButton();
        c1.setText("Mario");
        c1.setBackground(Color.ORANGE);
        c1.setForeground(Color.WHITE);
        c1.setBounds(10, 100, 100, 40);
        c1.setFocusable(false);

        c2 = new JButton();
        c2.setText("Luigi");
        c2.setBackground(Color.ORANGE);
        c2.setForeground(Color.WHITE);
        c2.setBounds(10, 160, 100, 40);
        c2.setFocusable(false);

        c3 = new JButton();
        c3.setText("Tud");
        c3.setBackground(Color.ORANGE);
        c3.setForeground(Color.WHITE);
        c3.setBounds(10, 220, 100, 40);
        c3.setFocusable(false);

        c4 = new JButton();
        c4.setText("Prances");
        c4.setBackground(Color.ORANGE);
        c4.setForeground(Color.WHITE);
        c4.setBounds(10, 280, 100, 40);
        c4.setFocusable(false);

        exit = new JButton();
        exit.setText("Exit");
        exit.setBackground(Color.BLACK);
        exit.setForeground(Color.WHITE);
        exit.setBounds(10, 400, 80, 20);
        exit.setFocusable(false);

    }

    private void add() {
        panel.add(character);
        panel.add(c1);
        panel.add(c2);
        panel.add(c3);
        panel.add(c4);
        panel.add(exit);

        this.add(panel);
    }

    private void addListener() {
        exit.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ((SuperMarioFrame) SwingUtilities.getWindowAncestor
                        (Store.this)).setContentPane
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
