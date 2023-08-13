package Quiz.App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start, back;

    Rules(String n) {
        super("Online Examination Portal ");
        this.name = n;
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel heading1 = new JLabel("Welcome " + name + " To Examination Portal");
        heading1.setBounds(10, 10, 800, 25);
        heading1.setFont(new Font("Mongolian Baiti", Font.ITALIC, 25));
        heading1.setForeground(Color.BLUE);
        add(heading1);

        JLabel rules = new JLabel();
        rules.setBounds(25, 15, 800, 400);
        rules.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        rules.setForeground(Color.BLACK);
        rules.setText
        ("<html>"+
        "1. There is total 10 questions.      "+"<br><br>"+
        "2. 15 sec time is alloted for each question.      "+"<br><br>"+
        "3. Once Time is finished or next button is pressed , You can not move to  previous question.     "+"<br><br>"+
        "4. If time is over for a question the next question automatically will be appeared.     "+"<br><br>"+
        "5. After attempting last question if user not submit the question it will be auto submitted after 15 sec is over.  "+"<br><br>"+
        "6. Good Luck !       "+"<br><br>"+
        "<html>");
        add(rules);

        start = new JButton("Start");
        start.setBounds(600, 400, 100, 25);
        start.setBackground(Color.blue);
        start.setForeground(Color.white);
        start.addActionListener(this);
        add(start);

        back = new JButton("Back");
        back.setBounds(300, 400, 100, 25);
        back.setBackground(Color.blue);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        setSize(1000, 500);
        setLocation(200, 150);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            setVisible(false);
            new Quiz(name);

        } else if (e.getSource() == back) {
            setVisible(false);
            new Login();

        }

    }

    public static void main(String[] args) {
        new Rules("User");
    }
}