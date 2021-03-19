import java.awt.*;
import java.applet.*;
/* <applet code="DemoOval" width=300 height=400></applet> */
public class DemoOval extends Applet {
 public void paint(Graphics g) {
g.drawOval(10, 10, 50, 50);
g.fillOval(10, 110, 50, 50);
g.drawOval(110, 10, 50, 75);
g.fillOval(110, 110, 80, 20);
 }
}
