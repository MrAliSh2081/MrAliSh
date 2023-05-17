package gui;

import gui.image.ImageAddress;

import javax.swing.*;
import java.awt.*;

public class SuperMarioFrame extends JFrame {
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 800;

    public SuperMarioFrame() {
        this.setSize(new Dimension(WIDTH, HEIGHT));
        this.setTitle("SuperMario");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(new ImageIcon(ImageAddress.SUPERMARIO_ICON).getImage());
        this.setVisible(true);
        this.setContentPane(new LoginPanel());
        this.setResizable(false);


    }

//    public void setContentPane(GameStart gameStart) {
//
//    }
}
