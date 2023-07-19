import java.util.Scanner;
class Sphere
{
	public static void main(String[] args) 
	{
		double r,ar,vol;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Radius: ");
		r=sc.nextDouble();
		ar=4*3.14*r*r;
		vol=(4/3)*3.14*r*r*r;
		System.out.println("Area of Sphere: "+ar);
		System.out.println("Volume of Sphere: "+vol);	
	}
}