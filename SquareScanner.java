import java.util.Scanner;
class SquareScanner
{
	public static void main(String[] args) 
	{
		double a,ar,pr;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Sides of Square=");
		a=sc.nextDouble();
		ar=a*a;
		pr=4*a;
		System.out.println("Area="+ar);
		System.out.println("Perimeter="+pr);
	}
}