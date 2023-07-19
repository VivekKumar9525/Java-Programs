class Ractangle
{
	double l,b;
	Ractangle()
	{
		l=20;
		b=35;
	}
	void disp()
	{
		System.out.println("Length="+l);
		System.out.println("Breath="+b);
	}
	void area()
	{
		double ar;
		ar=l*b;
		System.out.println("Area="+ar);
	}
	void perimeter()
	{
		double pr;
		pr=2*(l+b);
		System.out.println("Perimeter="+pr);
	}
}
class Ractangle1
{
	public static void main(String[] args)
	{
		Ractangle r=new Ractangle();
		r.disp();
		r.area();
		r.perimeter();
	}
}