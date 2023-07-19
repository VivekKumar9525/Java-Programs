import java.util.Scanner;
class Swap2
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("A=");
		a=sc.nextInt();
		System.out.print("B=");
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("Swaping 1st No.  " +a+ "  2nd No.  "+b);
	}
}