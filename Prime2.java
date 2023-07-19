class Prime
{
	int n;
	Prime()
	{
		n=5;
	}
	void disp()
	{
		System.out.println("Number="+n);
	}
	void calc()
	{
		int i,c=0;
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
class Prime2
{
	public static void main(String[] args)
	{
		Prime p=new Prime();
		p.disp();
		p.calc();
	}
}