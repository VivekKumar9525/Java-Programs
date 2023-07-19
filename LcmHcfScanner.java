/** A java program calculate the LCM HCF
Input using Scanner class*/

import java.util.Scanner;
class LcmHcfScanner
{
	public static void main(String args[])
	{
		int a,b,i,lcm,hcf=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("A=");
		a=sc.nextInt();
		System.out.print("B=");
		b=sc.nextInt();
		for(i=1;(i<=a && i<=b);i++)
		{
			if(a%i==0 && b%i==0)
			hcf=i;
		} 
		lcm=a*b/hcf;
		System.out.println("LCM="+lcm);
		System.out.println("HCF="+hcf);
	}
}