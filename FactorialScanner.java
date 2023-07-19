/** A java program calculate the Factorial.Input using Scannerclass*/
import java.util.Scanner;
class FactorialScanner
{
	public static void main(String args[])
	{
		int n,i,f=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Any Number=");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial="+f);
	}
}