package gui.image;

import Logic.SuperMario;
import gui.SuperMarioFrame;
import gui.MainPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class RegisterPanel extends JPanel {
    private JLabel loginText;
    private JButton loginButton;
    private JLabel username;
    private JLabel userPassword;

    private JLabel emphasize_userPassword;

    private JLabel email;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPasswordField emphasize_PasswordField;
    private JTextField emailField;
    SuperMario superMario = new SuperMario();

    private JPanel panel = new JPanel() {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2D = (Graphics2D) g;
            Image image = new ImageIcon(ImageAddress.SUPERMARIO_PANEL_NEW).getImage();
            g2D.drawImage(image, 0, 50, 300, 300, null);


        }
    };

    public RegisterPanel() {
        this.setSize(SuperMarioFrame.WIDTH, SuperMarioFrame.HEIGHT);
        this.setLayout(null);
        this.setBackground(Color.GREEN);
        init();
        addListener();
        add();


    }

    private void init() {
        panel.setSize(600, 400);
        panel.setBounds(200, 150, 600, 400);
        panel.setBackground(Color.RED);
        panel.setLayout(null);

        loginText = new JLabel("Create An Account");
        loginText.setFont(new Font(null, Font.BOLD, 20));
        loginText.setBounds(375, 15, 200, 100);
        loginText.setForeground(Color.BLUE);

        username = new JLabel("username:");
        username.setBounds(325, 120, 75, 20);

        userPassword = new JLabel("password:");
        userPassword.setBounds(325, 170, 75, 20);

        emphasize_userPassword = new JLabel("e_Password:");
        emphasize_userPassword.setBounds(325, 220, 75, 20);

        email = new JLabel("email:");
        email.setBounds(325, 270, 75, 20);

        usernameField = new JTextField();
        usernameField.setBackground(Color.GREEN);
        usernameField.setBounds(400, 120, 125, 20);
        usernameField.setToolTipText("Enter your username");

        passwordField = new JPasswordField();
        passwordField.setBounds(400, 170, 125, 20);
        passwordField.setBackground(Color.GREEN);
        passwordField.setToolTipText("Enter your password");
        passwordField.setEchoChar('*');

        emphasize_PasswordField = new JPasswordField();
        emphasize_PasswordField.setBounds(400, 220, 125, 20);
        emphasize_PasswordField.setBackground(Color.GREEN);
        emphasize_PasswordField.setToolTipText("Enter your password again");
        emphasize_PasswordField.setEchoChar('*');

        emailField = new JTextField();
        emailField.setBackground(Color.GREEN);
        emailField.setBounds(400, 270, 125, 20);
        emailField.setToolTipText("Enter your email");

        loginButton = new JButton();
        loginButton.setText("login");
        loginButton.setBackground(Color.BLUE);
        loginButton.setForeground(Color.black);
        loginButton.setBounds(400, 320, 80, 30);
        loginButton.setFocusable(false);

    }

    private void add() {
        panel.add(loginText);
        panel.add(username);
        panel.add(userPassword);
        panel.add(emphasize_userPassword);
        panel.add(email);
        panel.add(usernameField);
        panel.add(passwordField);
        panel.add(emphasize_PasswordField);
        panel.add(emailField);
        panel.add(loginButton);

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
                    emphasize_PasswordField.requestFocus();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        emphasize_PasswordField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    superMario.setPassword(passwordField.getText());
                    emailField.requestFocus();
                }


            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        emailField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    superMario.setEmail(emailField.getText());
                    // loginButton.doClick();
                }


            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        loginButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SuperMarioFrame frame = (SuperMarioFrame) SwingUtilities.getWindowAncestor(RegisterPanel.this);
                frame.getContentPane().removeAll();
                frame.setContentPane(new MainPage());

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



