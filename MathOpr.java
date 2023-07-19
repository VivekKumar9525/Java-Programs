class MathO
{
	int a,b;
	MathO()
	{
		a=5;
		b=6;
	}
	MathO(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void disp()
	{
		System.out.println("A="+a+"B="+b);
	}
	void add()
	{
		int s;
		s=a+b;
		System.out.println("Sum="+s);
	}
	void sub()
	{
		int s;
		s=a-b;
		System.out.println("Subtraction="+s);
	}
	void multi()
	{
		int m;
		m=a*b;
		System.out.println("Multiplecation="+m);
	}
	void div()
	{
		int d;
		d=a/b;
		System.out.println("Division="+d);
	}
}
class MathOpr
{
	public static void main(String[] args) 
	{
		MathO m=new MathO();
		MathO a=new MathO(10,20);
		m.disp();
		m.add();
		a.disp();
		a.add();
		m.sub();
		a.sub();
		m.multi();
		a.multi();
		m.div();
		a.div();
	}
}