package gui;

import gui.image.ImageAddress;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameStart extends JPanel{
    private JButton exit;
    private JButton newFirst;
    private JButton newSecond;
    private JButton newThird;


    private JPanel panel = new JPanel() {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2D = (Graphics2D) g;
            Image image = new ImageIcon(ImageAddress.SUPERMARIO_FIRST_PAGE).getImage();
            g2D.drawImage(image, 120, 0, 900, 800, null);

        }

    };
    public GameStart(){
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

        exit = new JButton();
        exit.setText("Exit");
        exit.setBackground(Color.BLACK);
        exit.setForeground(Color.WHITE);
        exit.setBounds(10, 40, 100, 30);
        exit.setFocusable(false);

        newFirst = new JButton();
        newFirst.setText("Load1");
        newFirst.setBackground(Color.ORANGE);
        newFirst.setForeground(Color.WHITE);
        newFirst.setBounds(10, 100, 100, 40);
        newFirst.setFocusable(false);

        newSecond = new JButton();
        newSecond.setText("Load2");
        newSecond.setBackground(Color.ORANGE);
        newSecond.setForeground(Color.WHITE);
        newSecond.setBounds(10, 160, 100, 40);
        newSecond.setFocusable(false);

        newThird = new JButton();
        newThird.setText("Load3");
        newThird.setBackground(Color.ORANGE);
        newThird.setForeground(Color.WHITE);
        newThird.setBounds(10, 220, 100, 40);
        newThird.setFocusable(false);

    }
    private void add() {
        panel.add(exit);
        panel.add(newFirst);
        panel.add(newSecond);
        panel.add(newThird);

        this.add(panel);

    }

    private void addListener() {
        exit.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ((SuperMarioFrame) SwingUtilities.getWindowAncestor
                        (GameStart.this)).setContentPane
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
        newFirst.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        newSecond.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        newThird.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        newFirst.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ((SuperMarioFrame) SwingUtilities.getWindowAncestor
                        (GameStart.this)).setContentPane
                        (new Load1());

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
        newSecond.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ((SuperMarioFrame) SwingUtilities.getWindowAncestor
                        (GameStart.this)).setContentPane
                        (new Load2());

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
        newThird.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ((SuperMarioFrame) SwingUtilities.getWindowAncestor
                        (GameStart.this)).setContentPane
                        (new Load3());

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
