import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code="Mouseevents" width=300 height=400></applet>*/
public class Mouseevents extends Applet implements MouseListener,MouseMotionListener
{
String msg=" ";
int x=0,y=0;
public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
}
public void mouseEntered(MouseEvent me)
{
x=0;y=10;
msg=" Mouse is Entered";
repaint();
}
public void mouseExited(MouseEvent me)
{
x=0;y=10;
msg="Mouse is Exited";
repaint();
}
public void mousePressed(MouseEvent me)
{
x=me.getX();
y=me.getY();
msg="Button Down";
repaint();
}
public void mouseReleased(MouseEvent me)
{
x=me.getX();
y=me.getY();
msg="Button up";
repaint();
}
public void mouseClicked(MouseEvent me)
{
x=0;y=10;
msg="Mouse is Clicked";
repaint();
}
public void mouseMoved(MouseEvent me)
{
showStatus("Mouse is moving at" +me.getX()+","+me.getY());
repaint();
}
public void mouseDragged(MouseEvent me)
{
x=me.getX();
y=me.getY();
msg=" ***";
showStatus("Mouse isDragged at" +me.getX()+","+me.getY());
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg,x,y);
}
}
