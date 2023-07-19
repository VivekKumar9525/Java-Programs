import java.util.Scanner;
class Cylinder
{
	public static void main(String[] args) 
	{
		double r,h,ar,vol;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Radius: ");
		r=sc.nextDouble();
		System.out.print("Enter the Hight: ");
		h=sc.nextDouble();
		ar=2*3.14*r*h+2*3.14*r*r;
		vol=3.14*r*r*h;
		System.out.println("Area of Cube: "+ar);
		System.out.println("Volume of Cube: "+vol);	
	}
}