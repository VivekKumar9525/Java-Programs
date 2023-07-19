import java.applet.Applet;
import java.awt.*;
public class CodeApplet extends Applet
{
	Label lblRoll,lblName;
	TextField txtRoll,txtName;
	Button btnSave;
	Font f;
	public void init()
	{
		//setLayout(null);
		f=new Font("Cambria",Font.ITALIC,32);
		lblRoll=new Label("Roll No:");
		lblName=new Label("Name:");
		txtRoll=new TextField(5);
		txtName=new TextField(20);
		btnSave=new Button("OKAY");
		lblRoll.setBounds(10,50,60,15);
		txtRoll.setBounds(70,50,100,15);
		lblName.setBounds(10,80,60,15);
		txtName.setBounds(70,80,100,15);
		btnSave.setBounds(40,120,50,30);
	}
	public void paint(Graphics g)
	{
		g.setFont(f);
		g.drawString("Registration Form",10,30);
	}
}
//<applet code="CodeApplet.class" height="400" width="500"></Applet>