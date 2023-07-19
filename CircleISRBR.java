import java.io.*;
class CircleISRBR
{
	public static void main(String args[])throws IOException
	{
		double r,ar,cr;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Radius=");
		r=Double.parseDouble(br.readLine());
		ar=3.14*r*r;
		cr=2*3.14*r;
		System.out.println("Area="+ar);
		System.out.println("Circumference="+cr);
	}
}