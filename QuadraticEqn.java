import java.util.Scanner;
class QuadraticEqn
{
	public static void main(String[] args) 
	{
		int a,b,c,d;
		double x,y;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Cofficients A: ");
		a=sc.nextInt();
		System.out.print("Enter the Cofficients B: ");
		b=sc.nextInt();	
		System.out.print("Enter the Cofficients C: ");
		c=sc.nextInt();
		d=b*b-4*a*c;
		if(d>0)
		{
			System.out.println("Roots are Real and Distinct.");
			x=(-b+Math.sqrt(d))/(2*a);
			y=(-b-Math.sqrt(d))/(2*a);
			System.out.println("Alpha="+x+"Beta="+y);
		}
		else if(d==0)
		{
			System.out.println("Roots are Real and Equal.");
			x=(-b+Math.sqrt(d))/(2*a);
			y=(-b-Math.sqrt(d))/(2*a);
			System.out.println("Alpha="+x+"Beta="+y);
		}
		else
		{
			System.out.println("Roots are Imaginary and Distinct.");
		}
	}
}