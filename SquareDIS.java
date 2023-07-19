import java.io.*;
class SquareDIS
{
	public static void main(String[] args)throws IOException
	{
		double a,ar,pr;
		DataInputStream dis=new DataInputStream(System.in);
		System.out.print("Sides=");
		a=Double.parseDouble(dis.readLine());
		ar=a*a;
		pr=4*a;
		System.out.println("Area="+ar);
		System.out.println("Perimeter="+pr);
	}
}