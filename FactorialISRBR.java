import java.io.*;
class FactorialISRBR
{
	public static void main(String args[])throws IOException
	{
		int n,i,f=1;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Any Number=");
		n=Integer.parseInt(br.readLine());
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial="+f);
	}
}