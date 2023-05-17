package gui;

import Logic.SuperMario;
import gui.image.ImageAddress;
import gui.image.RegisterPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPanel extends JPanel {
    private JLabel loginText;
    private JButton loginButton;
    private JLabel username;
    private JLabel userPassword;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel registerLabel;
    private JLabel register;

    SuperMario superMario = new SuperMario();

    private JPanel panel = new JPanel() {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2D = (Graphics2D) g;
            Image image = new ImageIcon(ImageAddress.SUPERMARIO_PANEL).getImage();
            g2D.drawImage(image, 0, 50, 340, 300, null);


        }
    };
    private Color color;
    private Color color2;

    public LoginPanel() {
        this.setSize(SuperMarioFrame.WIDTH, SuperMarioFrame.HEIGHT);
        color = new Color(24, 110, 100);
        color2 = new Color(24, 100, 15);
        this.setBackground(Color.ORANGE);
        this.setLayout(null);
        init();
        addListener();
        add();

    }

    private void init() {
        panel.setSize(600, 400);
        panel.setBounds(200, 150, 600, 400);
        panel.setBackground(Color.RED);
        panel.setLayout(null);

        loginText = new JLabel("Login");
        loginText.setFont(new Font(null, Font.BOLD, 50));
        loginText.setBounds(375, 15, 200, 100);
        loginText.setForeground(Color.BLUE);

        username = new JLabel("username:");
        username.setBounds(325, 120, 75, 20);

        userPassword = new JLabel("password:");
        userPassword.setBounds(325, 170, 75, 20);

        usernameField = new JTextField();
        usernameField.setBackground(Color.GREEN);
        usernameField.setBounds(400, 120, 125, 20);
        usernameField.setToolTipText("Enter your username");

        passwordField = new JPasswordField();
        passwordField.setBounds(400, 170, 125, 20);
        passwordField.setBackground(Color.GREEN);
        passwordField.setToolTipText("Enter your password");
        passwordField.setEchoChar('*');

        loginButton = new JButton();
        loginButton.setText("login");
        loginButton.setBackground(Color.BLUE);
        loginButton.setForeground(Color.black);
        loginButton.setBounds(400, 220, 80, 30);
        loginButton.setFocusable(false);

        registerLabel = new JLabel("Create an account");
        registerLabel.setForeground(Color.WHITE);
        registerLabel.setFont(new Font(null, Font.BOLD, 15));
        registerLabel.setBounds(330, 290, 240, 50);
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        registerLabel.setToolTipText("Create  a new account if you can't login");


    }

    private void add() {
        panel.add(loginText);
        panel.add(username);
        panel.add(userPassword);
        panel.add(usernameField);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(registerLabel);

        this.add(panel);

    }

    private void addListener() {
        usernameField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    superMario.setUsername(usernameField.getText());
                    passwordField.requestFocus();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        passwordField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    superMario.setPassword(passwordField.getText());
                    // loginButton.doClick();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        loginButton.addKeyListener(new KeyListener() {
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
        loginButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ((SuperMarioFrame) SwingUtilities.getWindowAncestor
                        (LoginPanel.this)).setContentPane
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
        registerLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ((SuperMarioFrame) SwingUtilities.getWindowAncestor
                        (LoginPanel.this)).setContentPane
                        (new RegisterPanel());

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
