class Square1
{
	double a;
	Square1()
	{
		a=5.2;
	}
	void disp()
	{
		System.out.println("Edges="+a);
	}
	void area()
	{
		double ar;
		ar=a*a;
		System.out.println("Area="+ar);
	}
	void peri()
	{
		double pr;
		pr=4*a;
		System.out.println("Perimeter="+pr);
	}
}
class Square
{
	public static void main(String[] args) 
	{
		Square1 s=new Square1();
		s.disp();
		s.area();
		s.peri();
	}
}