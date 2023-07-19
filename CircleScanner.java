import java.util.Scanner;
class CircleScanner
{
	public static void main(String args[])
	{
		double r,ar,cr;
		Scanner sc=new Scanner(System.in);
		System.out.print("Radius=");
		r=sc.nextDouble();
		ar=3.14*r*r;
		cr=2*3.14*r;
		System.out.println("Area="+ar);
		System.out.println("Circumference="+cr);
	}
}