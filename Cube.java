import java.util.Scanner;
class Cube
{
	public static void main(String[] args) 
	{
		double a,ar,vol;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Edge: ");
		a=sc.nextDouble();
		ar=6*a*a;
		vol=a*a*a;
		System.out.println("Area of Cube: "+ar);
		System.out.println("Volume of Cube: "+vol);	
	}
}