import java.awt.*;
import java.applet.*;
/* <applet code="DemoRect" width=300 height=400></applet> */
public class DemoRect extends Applet {
 public void paint(Graphics g) {
g.drawString("Types of Rectangles", 100, 300);
g.drawRect(20, 20, 70, 60);
g.fillRect(110, 20, 70, 60);
g.drawRoundRect(200, 20, 70, 60, 20, 20);
g.fillRoundRect(80, 90, 110, 100, 30, 40);
 }
}