class Fact
{
	int n;
	Fact()
	{
		n=5;
	}
	void disp()
	{
		System.out.println("Number="+n);
	}
	void calc()
	{
		int i,f=1;
		for(i=1;i<=n;i++)
			f=f*i;
		System.out.println("Factorial="+f);
	}
}
class Factorial2
{
	public static void main(String[] args)
	{
		Fact f=new Fact();
		f.disp();
		f.calc();
	}
}