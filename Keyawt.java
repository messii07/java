import java.awt.*;
import java.awt.event.*;
class Keyawt extends Frame implements KeyListener
{
Label l;
TextField t;

Keyawt()
{

l=new Label();
l.setBounds(30,70,100,20);

t=new TextField();
t.setBounds(70,100,100,30);
add(t);
add(l);
t.addKeyListener(this);
addWindowListener(new WindowAdapter(){
public void windowClosing (WindowEvent e){
dispose ();
}
});
setSize(300,300);
setLayout(null);
setVisible(true);
}
public void keyPressed  (KeyEvent e1)
{
l.setText("keypressed event generated");
}
public void keyTyped (KeyEvent e1)
{
l.setText("key typed event generated ");
}
public void keyReleased (KeyEvent e1)
{
 l.setText("key released event generated ");
 }
 public static void main (String args[]){
Keyawt al =new Keyawt();
 }
 }
