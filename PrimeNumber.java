import java.awt.*;
import java.awt.event.*;

class PrimeNumber extends Frame implements ActionListener {
    TextField tf;
    Button b;
    Label n, l, r;

    PrimeNumber() {
        n = new Label("AWT Prime Number Program");
        l = new Label("Enter number");
        r = new Label();

        tf = new TextField();

        b = new Button("Check Prime");

        n.setBounds(30, 40, 200,20);
        l.setBounds(30, 70, 150, 20);
        r.setBounds(30, 170, 200, 20);
        tf.setBounds(30, 90, 190, 30);
        b.setBounds(30, 130, 190, 30);

        b.setBackground(Color.BLUE);
        b.setForeground(Color.WHITE);

        add(n);
        add(l);
        add(r);
        add(tf);
        add(b);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);

        b.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            int num = Integer.parseInt(tf.getText());
            if (isPrime(num)) {
                r.setText(num + " is a Prime Number.");
            } else {
                r.setText(num + " is not a Prime Number.");
            }
        }
    }

    public boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        PrimeNumber primeNumber = new PrimeNumber();
    }
}
