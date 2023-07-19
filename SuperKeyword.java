//______________________________________________Example of super keyword_______________________________
class A{
	int x;
	public void f1(){
		System.out.println("X="+x);
		System.out.println("Parent Class");
	}
}
class B extends A
{
	public void f1(){
		super.x=5;
		super.f1();
		System.out.println("Child Class");
	}
}
class SuperKeyword{
	public static void main(String[] args) {
		B b=new B();
		b.f1();
	}
}