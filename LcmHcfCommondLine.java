class LcmHcfCommondLine
{
	public static void main(String args[])
	{
		int a,b,i,lcm,hcf=1;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
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
