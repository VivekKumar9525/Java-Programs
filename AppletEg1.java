import java.applet.Applet;
import java.awt.*;
public class AppletEg1 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.green);
		g.fillRoundRect(170,180,150,160,30,30);
		Font f=new Font("Arial Black",40,35);
		g.setFont(f);
		g.setColor(Color.red);
		g.drawString("Welcome to DCC",150,160);
	}
}
//<applet code="AppletEg1.class" height="400" width="500"></Applet>