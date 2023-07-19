import java.io.*;
class RactangleDIS
{
	public static void main(String args[])throws IOException
	{
		double l,b,ar,pr;
		DataInputStream dis=new DataInputStream(System.in);
		System.out.print("Enter Length=");
		l=Double.parseDouble(dis.readLine());
		System.out.print("Enter Breath=");
		b=Double.parseDouble(dis.readLine());
		ar=l*b;
		pr=2*(l+b);
		System.out.println("Area="+ar);
		System.out.print("Perimeter="+pr);
	}
}