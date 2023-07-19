/**Single Inheritance*/
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
		System.out.print("A="+a);
		System.out.print(",B="+b);
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
		System.out.print(",C="+c);
	}
}
class SingleInh3
{
	public static void main(String[] args) 
	{
		Ab p=new Ab();
		Ab q=new Ab(100,200);
		Abc r=new Abc();
		Abc s=new Abc(500,1000,1500);
		System.out.println("Members of Object P:");
		p.disp();
		System.out.println("\nMembers of Object Q:");
		q.disp();		
		System.out.println("\nMembers of Object R:");
		r.disp();
		System.out.println("\nMembers of Object S:");
		s.disp();
	}
}