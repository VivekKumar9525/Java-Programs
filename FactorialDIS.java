import java.io.*;
class FactorialDIS
{
	public static void main(String args[])throws IOException
	{
		int n,i,f=1;
		DataInputStream dis=new DataInputStream(System.in);
		System.out.print("Enter Any Number=");
		n=Integer.parseInt(dis.readLine());
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial="+f);
	}
}