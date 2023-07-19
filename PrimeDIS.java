import java.io.*;
class PrimeDIS
{
	public static void main(String args[])throws IOException
	{
		int n,i,c=0;
		DataInputStream dis=new DataInputStream(System.in);
		System.out.print("Enter Any Number=");
		n=Integer.parseInt(dis.readLine());
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			c++;
		}
		if(c==2)
		System.out.println("Prime No.");
		else
		System.out.println("Composite No.");
	}
}