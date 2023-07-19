import java.io.*;
class RactangleConsole
{
	public static void main(String args[])
	{
		double l,b,ar,pr;
		Console con=System.console();
		System.out.print("Length=");
		l=Double.parseDouble(con.readLine());
		System.out.print("Breath=");
		b=Double.parseDouble(con.readLine());
		ar=l*b;
		pr=2*(l+b);
		System.out.println("Area="+ar);
		System.out.println("Perimeter="+pr);
	}
}