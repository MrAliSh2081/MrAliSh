package gui;

import gui.image.ImageAddress;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Load1 extends JPanel {
    private JButton exit;
    private JLabel score;
    private JLabel coins;
    private JLabel world;
    private JLabel time;
    private JLabel lives;

//    private JButton start;
    private int x = 0;
    private int y = 700;
    private int dx = 0;
    private int dy = 0;


    private JPanel panel = new JPanel() {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2D = (Graphics2D) g;
            Image image = new ImageIcon(ImageAddress.PLAYING).getImage();
            g2D.drawImage(image, 0, 40, 1000, 760, null);

        }

    };


    public Load1() {
        this.setSize(SuperMarioFrame.WIDTH, SuperMarioFrame.HEIGHT);
        this.setLayout(null);
//        addKeyListener((KeyListener) this);
//        x = getHeight() / 2 - 10;
//        y = getWidth() - 50;

        init();
        addListener();
        add();


    }

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

//        start = new JButton();
//        start.setText("Push to start");
//        start.setBackground(Color.ORANGE);
//        start.setForeground(Color.WHITE);
//        start.setBounds(940, 5, 30, 20);
//        start.setFocusable(false);
    }
//    MKeyListener k = new MKeyListener();

    public void add() {
        panel.add(score);
        panel.add(coins);
        panel.add(world);
        panel.add(time);
        panel.add(lives);
        panel.add(exit);
//        panel.add(start);
//        panel.addKeyListener(k);

        this.add(panel);
    }

//    public void paint(Graphics g) {
//        super.paint(g);
//        g.setColor(Color.RED); // set color of the ball to red
//        g.fillOval(x, y, 30, 30); // draw the ball at (x,y) with a diameter of 50 pixels
//
//        repaint();
//    }


    private void addListener() {
        exit.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ((SuperMarioFrame) SwingUtilities.getWindowAncestor
                        (Load1.this)).setContentPane
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
//        start.addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//                if (e.getKeyCode() == KeyEvent.VK_UP) { // if up arrow is pressed
//                    dy = -10; // move the ball up by changing its y position by -10 pixels
//                    dx = 0;
//                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) { // if down arrow is pressed
//                    dy = 10; // move the ball down by changing its y position by +10 pixels
//                    dx = 0;
//                } else if (e.getKeyCode() == KeyEvent.VK_LEFT) { // if left arrow is pressed
//                    dx = -10; // move the ball left by changing its x position by -10 pixels
//                    dy = 0;
//                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) { // if right arrow is pressed
//                    dx = 10; // move the ball right by changing its x position by +10 pixels
//                    dy = 0;
//                } else if (e.getKeyCode() == KeyEvent.VK_SPACE) { // if space bar is pressed
//                    dy = -20; // make the ball jump by changing its y position by -20 pixels
//                    dx = 0;
//                }
//                x += dx; // update the x position of the ball
//                y += dy; // update the y position of the ball
//                repaint(); // repaint the panel to show the updated position of the ball
//
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//
//            }
//        });
//
//        start.addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//
//
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//
//            }
//        });
    }
}
//class MKeyListener extends KeyAdapter {
//    private int x = 0;
//    private int y = 700;
//    private int dx = 0;
//    private int dy = 0;
//    public void keyPressed(KeyEvent e) {
//        if (e.getKeyCode() == KeyEvent.VK_UP) { // if up arrow is pressed
//            dy = -10; // move the ball up by changing its y position by -10 pixels
//            dx = 0;
//        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) { // if down arrow is pressed
//            dy = 10; // move the ball down by changing its y position by +10 pixels
//            dx = 0;
//        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) { // if left arrow is pressed
//            dx = -10; // move the ball left by changing its x position by -10 pixels
//            dy = 0;
//        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) { // if right arrow is pressed
//            dx = 10; // move the ball right by changing its x position by +10 pixels
//            dy = 0;
//        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) { // if space bar is pressed
//            dy = -20; // make the ball jump by changing its y position by -20 pixels
//            dx = 0;
//        }
//        x += dx; // update the x position of the ball
//        y += dy; // update the y position of the ball
//
//    }
//}