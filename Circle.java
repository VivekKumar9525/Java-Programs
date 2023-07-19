class Circle1
{
	double r;
	Circle1()
	{
		r=2.5;
	}
	void disp()
	{
		System.out.println("Radius="+r);
	}
	void area()
	{
		double ar;
		ar=3.14*r*r;
		System.out.println("Area="+ar);
	}
	void circumference()
	{
		double cr;
		cr=2*3.14*r;
		System.out.println("Circumference="+cr);
	}
}
class Circle
{
	public static void main(String args[])
	{
		Circle1 c=new Circle1();
		c.disp();
		c.area();
		c.circumference();
	}
}