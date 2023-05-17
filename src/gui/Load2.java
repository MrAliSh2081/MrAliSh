package gui;

import gui.image.ImageAddress;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Load2 extends JPanel {
    private JLabel score;
    private JLabel coins;
    private JLabel world;
    private JLabel time;
    private JLabel lives;
    private JButton exit;


    private int x = 0;
    private int y = 0;
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


    public Load2() {
        this.setSize(SuperMarioFrame.WIDTH, SuperMarioFrame.HEIGHT);
        this.setLayout(null);

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
                        (Load2.this)).setContentPane
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
