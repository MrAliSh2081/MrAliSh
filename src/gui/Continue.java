package gui;

import gui.image.ImageAddress;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;

public class Continue extends JPanel implements KeyListener {
    private Image image2;
    private JLabel score;
    private JLabel coins;
    private JLabel world;
    private JLabel time;
    private JLabel lives;
    private JButton exit;


    private int x = 140;
    private int y = 665;


    private JPanel panel = new JPanel() {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2D = (Graphics2D) g;
            Image image = new ImageIcon(ImageAddress.PLAYING).getImage();
            image2 = new ImageIcon(ImageAddress.CHARACTER).getImage();
            g2D.drawImage(image, 0, 40, 1000, 760, null);
//            g.drawImage(image2, x, y, null);
            g.setColor(Color.RED); // set color of the ball to red
            g.fillOval(140, 665, 50, 50); // draw the ball at (x,y) with a diameter of 50 pixels
        }

    };
//    public void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        g.setColor(Color.RED); // set color of the ball to red
//        g.fillOval(140, 665, 50, 50); // draw the ball at (x,y) with a diameter of 50 pixels
//
//    }


    public Continue() {
        this.setSize(SuperMarioFrame.WIDTH, SuperMarioFrame.HEIGHT);
        this.setLayout(null);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        init();
        addListener();
        add();


    }


    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                y -= 10; // move the ball up by 10 pixels
                break;
            case KeyEvent.VK_DOWN:
                y += 10; // move the ball down by 10 pixels
                break;
            case KeyEvent.VK_LEFT:
                x -= 10; // move the ball left by 10 pixels
                break;
            case KeyEvent.VK_RIGHT:
                x += 10; // move the ball right by 10 pixels
                break;
        }
        repaint(); // redraw the panel with updated position of the ball
    }

    public void keyReleased(KeyEvent e) {}

    public void init() {
        panel.setSize(1000, 800);
        panel.setBackground(Color.BLUE);
        panel.setLayout(null);

        score = new JLabel("SCORE:0");
        score.setFont(new Font(null, Font.BOLD, 15));
        score.setBounds(50, 5, 100, 20);
        score.setForeground(Color.WHITE);


        coins = new JLabel("COINS:0");
        coins.setFont(new Font(null, Font.BOLD, 15));
        coins.setBounds(250, 5, 100, 20);
        coins.setForeground(Color.WHITE);


        world = new JLabel("WORLD:0");
        world.setFont(new Font(null, Font.BOLD, 15));
        world.setBounds(450, 5, 100, 20);
        world.setForeground(Color.WHITE);


        time = new JLabel("TIMES:0");
        time.setFont(new Font(null, Font.BOLD, 15));
        time.setBounds(650, 5, 100, 20);
        time.setForeground(Color.WHITE);


        lives = new JLabel("LIVES:5");
        lives.setFont(new Font(null, Font.BOLD, 15));
        lives.setBounds(800, 5, 90, 20);
        lives.setForeground(Color.WHITE);

        exit = new JButton();
        exit.setText("Exit");
        exit.setBackground(Color.BLACK);
        exit.setForeground(Color.WHITE);
        exit.setBounds(900, 5, 80, 20);
        exit.setFocusable(false);
    }

    public void add() {
        panel.add(score);
        panel.add(coins);
        panel.add(world);
        panel.add(time);
        panel.add(lives);
        panel.add(exit);
        this.add(panel);
    }

    private void addListener() {

        exit.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ((SuperMarioFrame) SwingUtilities.getWindowAncestor
                        (Continue.this)).setContentPane
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
