//This is a applet program to add two number

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class FirstApplet extends Applet
{
Label lb1,lb2,lb3;
TextField tf1,tf2;
Button button;
public void init()
{
lb1=new Label("First Number:");
lb2=new Label("Second Number:"); 
lb3=new Label();
tf1=new TextField();
tf2=new TextField();
button =new Button("Add");
setLayout(null);
lb1.setBounds(20,50,100,20);
lb2.setBounds(20,80,100,20);
tf1.setBounds(130,50,100,20);
tf2.setBounds(130,80,100,20);
button.setBounds(95,110,100,20);
lb3.setBounds(70,180,100,20);
add(lb1);
add(lb2);
add(lb3);
add(tf1);
add(tf2); 
add(button);
button.addActionListener(new MyHandler());
}
public class MyHandler implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
int a=Integer.parseInt(tf1.getText());
int b=Integer.parseInt(tf2.getText());
int c=a+b;
lb3.setText("Sum is:"+c);
}
}
}
//<applet code="FirstApplet.class" height="400" width="500"></applet>