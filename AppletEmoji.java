import java.applet.Applet;
import java.awt.*;
public class AppletEmoji extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillOval(150,110,140,140);
		g.setColor(Color.black);
		g.drawOval(180,150,20,20);
		g.setColor(Color.black);
		g.fillOval(186,156,8,8);
		g.drawOval(235,150,20,20);
		g.setColor(Color.black);
		g.fillOval(241,156,8,8);
		g.drawArc(190,150,60,80,200,140);
	}
}
//<applet code="AppletEmoji.class" height="400" width="500"></Applet>