import java.io.*;
class SquareConsole
{
	public static void main(String[] args)
	{
		double a,ar,pr;
		Console con=System.console();
		System.out.print("Sides=");
		a=Double.parseDouble(con.readLine());
		ar=a*a;
		pr=4*a;
		System.out.println("Area="+ar);
		System.out.println("Perimeter="+pr);
	}
}