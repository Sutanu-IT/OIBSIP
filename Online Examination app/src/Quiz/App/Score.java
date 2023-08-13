package Quiz.App;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    String name;
    int score;
    JLabel heading;
    JButton re,back;

    Score(String n, int s) {
        super("Online Examination Portal ");
        this.name = n;
        this.score = s*10;

        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(200, 150, 1000, 500);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(60, 120, 300, 250);
        add(img);

        JLabel heading = new JLabel("Thankyou " + name + " for attempting Online Exam");
        heading.setBounds(200, 30, 600, 25);
        heading.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        add(heading);

        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(580, 200, 300, 25);
        lblscore.setFont(new Font("Dialog", Font.PLAIN, 22));
        add(lblscore);

        re = new JButton("Re-Attempt Quiz");
        re.setBounds(750, 350, 140, 25);
        re.setBackground(Color.blue);
        re.setForeground(Color.WHITE);
        re.addActionListener(this);
        add(re);

        back = new JButton("Back");
        back.setBounds(450, 350, 120, 25);
        back.setBackground(Color.blue);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == re) {
            setVisible(false);
            new Login();
        } else if (ae.getSource() == back) {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}