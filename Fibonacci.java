import java.util.*;
public class Fibonacci
{
	public static void main(String[] args) 
	{
			int a=0,b=1,c=0,n;
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter no. of terms:");
			n=sc.nextInt();
			System.out.println("The Fibonacci series as follows:");
			System.out.print(a+"  "+b);
			for(int i=1;i<=n;i++)
			{
				
					c=a+b;
					System.out.print("  "+c);
					a=b;
					b=c;
			}
	}
}