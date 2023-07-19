import java.io.*;
class CircleConsole
{
	public static void main(String args[])
	{
		double r,ar,cr;
		Console con=System.console();
		System.out.print("Radius=");
		r=Double.parseDouble(con.readLine());
		ar=3.14*r*r;
		cr=2*314*r;
		System.out.println("Area="+ar);
		System.out.println("Circumference="+cr);
	}
}