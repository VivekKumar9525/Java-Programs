class Ab
{
	int a,b;
	Ab()
	{
		a=10;
		b=20;
	}
	Ab(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void disp()
	{
		System.out.println("A="+a);
		System.out.println("B="+b);
	}
}
class Abc extends Ab
{
	int c;
	Abc()
	{
		c=30;
	}
	Abc(int a,int b,int c)
	{
		super(a,b);
		this.c=c;
	}
	void disp()
	{
		super.disp();
		System.out.println("C="+c);
	}
}
class SingleInh2
{
	public static void main(String[] args)
	{
		Ab p=new Ab();
		Ab q=new Ab(100,200);
		Abc r=new Abc();
		Abc s=new Abc(500,1000,1500);
		System.out.println("Members of Object P:");
		p.disp();
		System.out.println("Members of Object Q:");
		q.disp();
		System.out.println("Members of Object R:");
		r.disp();
		System.out.println("Members of Object S:");
		s.disp();
	}
}