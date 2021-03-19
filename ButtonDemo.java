import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="ButtonDemo" width=200  height=300></applet>*/
public class ButtonDemo extends Applet implements ActionListener
{
Button b1,b2,b3;
String msg="  ";
public void init()
{
b1= new Button("red");
b2= new Button("green");
b3= new Button("orange");
add(b1);b1.addActionListener(this);
add(b2);b2.addActionListener(this);
add(b3);b3.addActionListener(this);

}
public void actionPerformed(ActionEvent ae)
{
String s= ae.getActionCommand();
if(s.equals("red"))
{
setBackground(Color.red);
msg= "I pressed on red color";
}
else if(s.equals("green"))
{
setBackground(Color.green);
msg="i pressed on green color";
}
else if(s.equals("orange"));
{
setBackground(Color.orange);
msg="i pressed on orange color";
}
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg,0,100);

}
}