import java.io.*;
class PrimeISRBR
{
	public static void main(String args[])throws IOException
	{
		int n,i,c=0;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Any Number=");
		n=Integer.parseInt(br.readLine());
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