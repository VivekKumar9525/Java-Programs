class Sum2
{
	public static void main(String args[])
	{
		int n,i,s=0;
		n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			s=s+i;
		}
		System.out.println("Sum="+s);
	}
}