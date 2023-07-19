import java.io.*;
class SquareISRBR
{
	public static void main(String[] args)throws IOException
	{
		double a,ar,pr;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Sides=");
		a=Double.parseDouble(br.readLine());
		ar=a*a;
		pr=4*a;
		System.out.println("Area="+ar);
		System.out.println("Perimeter="+pr);
	}
}