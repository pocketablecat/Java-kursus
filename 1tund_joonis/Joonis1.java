import javax.swing.*;
import java.awt.*;
public class Joonis1 extends JApplet{
	public void paint(Graphics g){
	g.drawRect(10, 10, 50, 30);
	// left, top, width, height
	g.setColor(Color.pink);
	g.fillOval(70, 10, 50, 30);
	g.drawLine(130, 10, 140, 50);
	//x1, y1, x2, y2
	g.drawString("Ahoi!", 50, 70);
	}
}