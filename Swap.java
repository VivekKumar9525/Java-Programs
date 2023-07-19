import java.util.Scanner;
class Swap
{
	public static void main(String[] args) 
	{
		int a,b,t;
		Scanner sc=new Scanner(System.in);
		System.out.print("A=");
		a=sc.nextInt();
		System.out.print("B=");
		b=sc.nextInt();
		t=a;
		a=b;
		b=t;
		System.out.print("Swaping 1st No.  " +a+ "  2nd No.  "+b);
	}
}

