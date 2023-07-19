import java.io.*;
class FactorialConsole
{
	public static void main(String args[])
	{
		int n,i,f=1;
		Console con=System.console();
		System.out.print("Any Number=");
		n=Integer.parseInt(con.readLine());
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial="+f);
	}
}