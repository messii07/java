import java.awt.*;
import java.awt.event.*;

class mouse extends Frame implements MouseListener {

    Label l;

    mouse() {
        l = new Label();
        l.setBounds(30, 70, 300, 20);
        add(l);
        setSize(400, 300); 
        setLayout(null);
        setVisible(true);

        addMouseListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse pressed event generated");
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse clicked event generated");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse released event generated");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse entered event generated");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse exited event generated");
    }

    public static void main(String args[]) {
        mouse al = new mouse();
    }
}
