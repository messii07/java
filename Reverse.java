import java.awt.*;
import java.awt.event.*;

public class Reverse extends Frame implements ActionListener {
    TextField tf;
    Button b;
    Label r;

    Reverse() {
        Label label = new Label("Enter a number:");
        tf = new TextField();
        b = new Button("Reverse Number");
        r = new Label();

        label.setBounds(30, 40, 120, 20);
        tf.setBounds(160, 40, 80, 20);
        b.setBounds(30, 80, 120, 30);
        r.setBounds(30, 120, 200, 20);

        add(label);
        add(tf);
        add(b);
        add(r);

        b.addActionListener(this);

        setSize(250, 180);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {

                int number = Integer.parseInt(tf.getText());
                int x = Reverse(number);// to store the reversed value
                r.setText("Reversed number: " + x);

            }
        }


  public int Reverse(int number) {
        int x = 0;
        while (number != 0) {
            int digit = number % 10;
            x = x * 10 + digit;
            number /= 10;
        }
        return x;
    }

    public static void main(String args[]) {
       Reverse m= new Reverse();
    }
}
