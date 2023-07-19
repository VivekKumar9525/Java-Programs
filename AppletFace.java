import java.applet.Applet;
import java.awt.*;
public class AppletFace extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.fillOval(98,98,274,274);
		g.fillOval(63,198,54,84);
		g.fillOval(353,198,54,84);
		g.setColor(new Color(255,214,151));
		g.fillOval(100,100,270,270);
		g.fillOval(65,200,50,80);
		g.fillOval(355,200,50,80);
		g.setColor(Color.black);
		g.fillOval(158,178,52,52);
		g.fillOval(263,178,52,52);
		g.setColor(Color.white);
		g.fillOval(160,180,50,50);
		g.fillOval(265,180,50,50);

		Font f = new Font("Arial",0,50);
		g.setFont(f);
		g.setColor(Color.yellow);
		g.drawString("U",220,165);
		f = new Font("Arial",0,54);
		g.setFont(f);
		g.setColor(Color.yellow);
		g.drawString("U",218,163);
		f = new Font("Arial",0,35);
		g.setColor(Color.red);
		g.setFont(f);
		g.drawString("I",235,155);
		g.setColor(Color.black);
		g.fillOval(165,190,30,30);
		g.setColor(Color.black);
		g.fillOval(270,190,30,30);
		g.setColor(Color.red);
		g.fillArc(170,225,130,100,180,180);
		g.setColor(new Color(255,214,151));
		g.fillArc(165,200,140,100,180,180);
		g.setColor(Color.black);
		g.drawArc(370,260,30,50,110,290); 
		g.drawArc(371,260,30,50,110,290); 
		g.drawArc(372,260,30,50,110,290);
		g.drawArc(70,260,30,50,95,283);
		g.drawArc(71,260,30,50,95,283);
		g.drawArc(72,260,30,50,95,283);
		g.setColor(Color.red);
		g.fillOval(75,300,20,20);
		g.fillOval(375,300,20,20);
		g.setColor(Color.black);
		g.drawArc(215,230,40,30,180,180);
		g.drawArc(215,229,40,30,180,180);
		g.drawArc(215,231,40,30,180,180);

		g.drawArc(160,164,50,30,360,180);
		g.drawArc(160,165,50,30,360,180);
		g.drawArc(160,166,50,30,360,180);
		g.drawArc(160,167,50,30,360,180);

		g.drawArc(265,164,50,30,360,180);
		g.drawArc(265,165,50,30,360,180);
		g.drawArc(265,166,50,30,360,180);
		g.drawArc(265,167,50,30,360,180);

		g.drawArc(239,59,50,80,180,-100);
		g.drawArc(240,59,50,80,180,-100);
		g.drawArc(241,59,50,80,180,-100);
		g.drawArc(242,59,50,80,180,-100);
		g.drawArc(243,59,50,80,180,-100);


		f = new Font("Unispace",0,35);
		g.setColor(Color.BLUE);
		g.drawString("PANDA",100,450);
		
	}
	
}
//<applet code="AppletFace.class" height="500" width="500"></applet>
