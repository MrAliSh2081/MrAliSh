package gui;

import gui.image.ImageAddress;

import javax.swing.*;
import java.awt.*;

public class Profile extends JPanel {
    private JPanel panel = new JPanel() {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2D = (Graphics2D) g;
            Image image = new ImageIcon(ImageAddress.ERROR).getImage();
            g2D.drawImage(image, 0, 0, 1000, 800, null);

        }

    };

    public Profile() {
        this.setSize(SuperMarioFrame.WIDTH, SuperMarioFrame.HEIGHT);
        this.setLayout(null);

        init();
        add();

    }

    private void init() {
        panel.setSize(1000, 800);
        panel.setLayout(null);
    }

    private void add() {
        this.add(panel);
    }
}
