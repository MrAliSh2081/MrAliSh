package gui;

import Logic.SuperMario;
import gui.image.ImageAddress;
import gui.image.RegisterPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainPage extends JPanel {
    private JButton start;
    private JButton continueTheGame;
    private JButton seeTheScore;
    private JButton store;
    private JButton profile;

    SuperMario superMario = new SuperMario();
    GameStart gameStart = new GameStart();

    private JPanel panel = new JPanel() {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2D = (Graphics2D) g;
            Image image = new ImageIcon(ImageAddress.SUPERMARIO_FIRST_PAGE).getImage();
            g2D.drawImage(image, 120, 0, 900, 800, null);


        }
    };


//    private JPanel panel = new JPanel();

    public MainPage() {
        this.setSize(SuperMarioFrame.WIDTH, SuperMarioFrame.HEIGHT);
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        init();
        addListener();
        add();
//        panel2.setSize(1000, 800);
//        panel2.setLayout(null);

    }

    private void init() {
        panel.setSize(1000, 800);
        panel.setBackground(Color.PINK);
        panel.setLayout(null);

        start = new JButton();
        start.setText("Start");
        start.setBackground(Color.ORANGE);
        start.setForeground(Color.WHITE);
        start.setBounds(10, 100, 100, 40);
        start.setFocusable(false);

        continueTheGame = new JButton();
        continueTheGame.setText("Continue");
        continueTheGame.setBackground(Color.ORANGE);
        continueTheGame.setForeground(Color.WHITE);
        continueTheGame.setBounds(10, 160, 100, 40);
        continueTheGame.setFocusable(false);

        seeTheScore = new JButton();
        seeTheScore.setText("Scores");
        seeTheScore.setBackground(Color.ORANGE);
        seeTheScore.setForeground(Color.WHITE);
        seeTheScore.setBounds(10, 220, 100, 40);
        seeTheScore.setFocusable(false);

        store = new JButton();
        store.setText("Store");
        store.setBackground(Color.ORANGE);
        store.setForeground(Color.WHITE);
        store.setBounds(10, 280, 100, 40);
        store.setFocusable(false);

        profile = new JButton();
        profile.setText("Profile");
        profile.setBackground(Color.ORANGE);
        profile.setForeground(Color.WHITE);
        profile.setBounds(10, 340, 100, 40);
        profile.setFocusable(false);


    }

    private void add() {
        panel.add(start);
        panel.add(continueTheGame);
        panel.add(seeTheScore);
        panel.add(store);
        panel.add(profile);

        this.add(panel);

    }


    private void addListener() {;
        start.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SuperMarioFrame frame = (SuperMarioFrame) SwingUtilities.getWindowAncestor(MainPage.this);
                frame.getContentPane().removeAll();
                frame.setContentPane(new GameStart());
                frame.getContentPane().revalidate();
                frame.getContentPane().repaint();

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
        continueTheGame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SuperMarioFrame frame = (SuperMarioFrame) SwingUtilities.getWindowAncestor(MainPage.this);
                frame.getContentPane().removeAll();
                frame.setContentPane(new Continue());
                frame.getContentPane().revalidate();
                frame.getContentPane().repaint();

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
        seeTheScore.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SuperMarioFrame frame = (SuperMarioFrame) SwingUtilities.getWindowAncestor(MainPage.this);
                frame.getContentPane().removeAll();
                frame.setContentPane(new Scores());
                frame.getContentPane().revalidate();
                frame.getContentPane().repaint();

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
        store.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SuperMarioFrame frame = (SuperMarioFrame) SwingUtilities.getWindowAncestor(MainPage.this);
                frame.getContentPane().removeAll();
                frame.setContentPane(new Store());
                frame.getContentPane().revalidate();
                frame.getContentPane().repaint();

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
        profile.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SuperMarioFrame frame = (SuperMarioFrame) SwingUtilities.getWindowAncestor(MainPage.this);
                frame.getContentPane().removeAll();
                frame.setContentPane(new Profile());
                frame.getContentPane().revalidate();
                frame.getContentPane().repaint();

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
