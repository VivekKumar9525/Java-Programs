import java.io.*;
class LcmHcfConsole
{
	public static void main(String args[])
	{
		int a,b,i,lcm,hcf=1;
		Console con=System.console();
		System.out.print("A=");
		a=Integer.parseInt(con.readLine());
		System.out.print("B=");
		b=Integer.parseInt(con.readLine());
		for(i=1;(i<=a && i<=b);i++)
		{
			if(a%i==0 && b%i==0)
			hcf=1;
		}
		lcm=a*b/hcf;
		System.out.println("LCM="+lcm);
		System.out.println("HCf="+hcf);
	}
}