import java.awt.*;
import java.awt.event.*;

public class ArithmeticDemo extends Frame implements ItemListener {

    TextField tf, tf1, rf;
    Choice c;

    public ArithmeticDemo() {

        setLayout(new BorderLayout());

       
        tf = new TextField();
        tf1 = new TextField();
        rf = new TextField();

        
        c = new Choice();
        c.add("+");
        c.add("-");
        c.add("*");
        c.add("/");
        c.add("%");

        
        Panel p = new Panel();
        Panel rp = new Panel();

       
        p.setLayout(new GridLayout(3, 2));
        p.add(new Label("Number 1:"));
        p.add(tf);
        p.add(new Label("Number 2:"));
        p.add(tf1);
        p.add(new Label("Operation:"));
        p.add(c);

        rp.setLayout(new GridLayout(2, 1));
        rp.add(new Label("Result:"));
        rp.add(rf);

        
        add(p, BorderLayout.NORTH);
        add(rp, BorderLayout.CENTER);

        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        
        c.addItemListener(this);

       
        setSize(300, 200);
        setVisible(true);
    }

    private void performOperation() {
        try {
            int num1 = Integer.parseInt(tf.getText());
int num2 = Integer.parseInt(tf1.getText());
String selectedOperation = c.getSelectedItem();

            switch (selectedOperation) {
                case "+":
                    rf.setText(String.valueOf(num1 + num2));
                    break;
                case "-":
                    rf.setText(String.valueOf(num1 - num2));
                    break;
                case "*":
                    rf.setText(String.valueOf(num1 * num2));
                    break;
                case "/":
                    rf.setText(String.valueOf((double) num1 / num2));
                    break;
                case "%":
                    rf.setText(String.valueOf(num1 % num2));
                    break;
            }
        } catch (NumberFormatException ex) {
            rf.setText("Invalid input");
        }
    }

    public void itemStateChanged(ItemEvent e) {
        performOperation();
    }

    public static void main(String[] args) {
        new ArithmeticDemo();
    }
}
