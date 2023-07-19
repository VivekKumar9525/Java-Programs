class Prime2
{
	public static void main(String args[])
	{
		int n,i,c=0;
		n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			c++;
		}
		if(c==2)
		System.out.println("\nPrime No."+n);
		else
		System.out.println("\nNot Prime No."+n);
	}
}