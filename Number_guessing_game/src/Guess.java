import javax.swing.JOptionPane;

public class Guess {
    int computerNumber = (int) (Math.random() * 100 + 1);
    static int choice = 0;
    static int answer = 0;
    static int count = 1;
    static int flag;

    Guess() {
        String re = JOptionPane.showInputDialog(null,
                "<html>" + "Press 1 : Play" + "<br><br>" + "Press 2 : Rule" + "<html>", "Guessing Game", 3);
        choice = Integer.parseInt(re);

        while (re.equals("") || (choice != 1 && choice != 2)) {
            JOptionPane.showMessageDialog(null, "Invalid Choice ! choose again",
                    "Invalid", 2);
            re = JOptionPane.showInputDialog(null,
                    "<html>" + "Press 1 : Play" + "<br><br>" + "Press 2 : Rule" + "<html>",
                    "Guessing Game", 3);
            choice = Integer.parseInt(re);

        }
        if (choice == 1) {
            while (answer != computerNumber) {
                String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100", "Guessing Game",
                        3);
                answer = Integer.parseInt(response);
                JOptionPane.showMessageDialog(null, "" + test(answer, computerNumber, count),"Result",flag);
                count++;
            }
            loop();

        } else if (choice == 2) {
            JOptionPane.showMessageDialog(null, "<html>" + "1. You have to predict the number between 0 to 100." + "<br><br>" + "Press 2 : Rule" + "<html>", "Rule", 1);
            while (answer != computerNumber) {
                String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100", "Guessing Game",
                        3);
                answer = Integer.parseInt(response);
                JOptionPane.showMessageDialog(null, "" + test(answer, computerNumber, count),"Result",flag);
                count++;
            }
            loop();

        }

    }

    public static String test(int userAnswer, int computerNumber, int count) {
        if (userAnswer <= 0 || userAnswer > 100) {
            flag=2;
            return "Your guess is invalid";
        } else if (userAnswer == computerNumber) {
            flag=1;
            return "Correct!\nTotal Guesses: " + count;
        } else if (userAnswer > computerNumber) {
            flag=0;
            return "Your guess is high, try again.\nTry Number: " + count;
        } else if (userAnswer < computerNumber) {
            flag=0;
            return "Your guess is low, try again.\nTry Number: " + count;
        } else {
            flag=0;
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }

    public void loop(){
        new Guess();

    }

    public static void main(String[] args) {
        new Guess();
    }

}

