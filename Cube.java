import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;

class Cube extends Frame implements ActionListener
{
	TextField tf;
	Button b;
	Label n, l, r;
Cube()
	{  
		n = new Label("AWT Cube Program");
		l = new Label("Enter number");
		r = new Label();

		tf = new TextField();

		b = new Button("Result");  

		n.setBounds(30, 40, 200, 20);
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

		setSize(250,210);
		setLayout(null);
		setVisible(true);

		b.addActionListener(this);

		addWindowListener(new WindowAdapter()
		{  
            public void windowClosing(WindowEvent e)
            {  
                dispose();  
            }  
        });
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			  int num = Integer.parseInt(tf.getText());
        r.setText("Cube of " + num + " is " + (num*num*num));
		}
	}
	public static void main(String args[])
    {
        Cube t = new Cube();
    }		

}
