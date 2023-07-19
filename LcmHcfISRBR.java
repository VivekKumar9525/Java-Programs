import java.io.*;
class LcmHcfISRBR
{
	public static void main(String args[])throws IOException
	{
		int a,b,i,lcm,hcf=1;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("A=");
		a=Integer.parseInt(br.readLine());
		System.out.print("B=");
		b=Integer.parseInt(br.readLine());
		for(i=1;(i<=a && i<=b);i++)
		{
			if(a%i==0 && b%i==0)
			hcf=1;
		}
		lcm=a*b/hcf;
		System.out.println("LCM="+lcm);
		System.out.println("HCF="+hcf);
	}
}