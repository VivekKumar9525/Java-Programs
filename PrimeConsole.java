import java.io.*;
class PrimeConsole
{
	public static void main(String args[])
	{
		int n,i,c=0;
		Console con=System.console();
		System.out.print("Any Number=");
		n=Integer.parseInt(con.readLine());
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			c++;
		}
		if(c==2)
		System.out.print("Prime No.");
		else
		System.out.print("Composite");
	}
}