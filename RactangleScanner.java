import java.util.Scanner;
class RactangleScanner
{
	public static void main(String args[])
	{
		double l,b,ar,pr;
		Scanner sc=new Scanner(System.in);
		System.out.print("Length=");
		l=sc.nextDouble();
		System.out.print("Breath=");
		b=sc.nextDouble();
		ar=l*b;
		pr=2*(l+b);
		System.out.println("Area="+ar);
		System.out.println("Perimeter="+pr);
		
	}
}