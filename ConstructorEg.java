import java.util.Scanner;
class Ab
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
	Ab(Ab p)//Copy Constructor
	{
		a=p.a;
		b=p.b;
	}
	void disp()
	{
		System.out.println("A="+a+",B="+b);
	}
}
class ConstructorEg
{
	public static void main(String[] args) 
	{
		Ab p=new Ab();
		Ab q=new Ab(30,40);
		Ab r=new Ab(p);
		p.disp();
		q.disp();
		r.disp();	
	}
}