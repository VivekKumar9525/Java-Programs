import java.io.*;
class CircleDIS
{
	public static void main(String args[])throws IOException
	{
		double r,ar,cr;
		DataInputStream dis=new DataInputStream(System.in);
		System.out.print("Enter Radius=");
		r=Double.parseDouble(dis.readLine());
		ar=3.14*r*r;
		cr=2*3.14*r;
		System.out.println("Area="+ar);
		System.out.println("Circumference="+cr);
	}
}