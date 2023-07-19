/** Single Inheritance */
class Ab//Base Class
{
	int a,b;
	Ab()//Default Constructor
	{
		a=10;
		b=20;
	}
	Ab(int a,int b)//Parameterised Constructor
	{
		this.a=a;
		this.b=b;	
	}
	void disp()//Base Class Method
	{
		System.out.print("A="+a);
		System.out.print(",B="+b);
	}
}
class Abc extends Ab//Single Inheritance
{
	int c;
	Abc()//Derived class Default Constructor
	{
		c=30;
	}
	Abc(int a,int b,int c)//Derived class Parameterised Constructor
	{
		super(a,b);
		this.c=c;
	}
	void disp()//Method Overloading
	{
		super.disp();
		System.out.println(",C="+c);
	}

}
class SingleInh
{
	public static void main(String[] args)
	{
		Ab p=new Ab();
		Ab q=new Ab(100,200);
		Abc r=new Abc();
		Abc s=new Abc(500,1000,1500);
		System.out.println("\nMembers of Object P:");
		p.disp();
		System.out.println("\nMembers of Object Q:");
		q.disp();
		System.out.println("Members of Object R:");
		r.disp();
		System.out.println("Members of Object S:");
		s.disp();
	}
}