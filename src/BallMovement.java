import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BallMovement extends JPanel implements KeyListener {

    private int x = 250; // initial x position of the ball
    private int y = 250; // initial y position of the ball

    public BallMovement() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x, y, 50, 50); // draw the ball
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case 32:
                y -= 50;// move the ball up by 10 pixels
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

    public void keyTyped(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ball Movement");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BallMovement panel = new BallMovement();
        frame.add(panel);
        frame.setSize(600,600);
        frame.setVisible(true);
    }
}