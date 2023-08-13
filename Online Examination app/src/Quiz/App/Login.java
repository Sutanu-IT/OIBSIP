package Quiz.App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JButton back, login;
    JTextField tfname;

    Login() {
        super("Online Examination Portal ");

        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Icon/login.jpeg"));
        JLabel image = new JLabel(img);
        image.setBounds(0, 0, 500, 500);
        add(image);

        JLabel heading = new JLabel("Examination Portal");
        heading.setBounds(600, 50, 300, 40);
        heading.setFont(new Font("Arial", Font.BOLD, 30));
        heading.setForeground(Color.blue);
        add(heading);

        JLabel name = new JLabel("Enter your name :");
        name.setBounds(680, 150, 300, 25);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(Color.blue);
        add(name);

        tfname = new JTextField();
        tfname.setBounds(575, 200, 350, 25);
        name.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        add(tfname);

        login = new JButton("LogIn");
        login.setBounds(800, 250, 120, 25);
        login.setBackground(Color.blue);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        back = new JButton("Back");
        back.setBounds(590, 250, 120, 25);
        back.setBackground(Color.blue);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        setSize(1000, 500);
        setLocation(200, 150);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            if (!tfname.getText().equals("")) {
                String n = tfname.getText();
                setVisible(false);
                new Rules(n);
            }

        } else if (ae.getSource() == back) {
            setVisible(false);

        }

    };

    public static void main(String[] args) {
        new Login();

    }
}
