abstract class A{
	abstract void f1();
} 
class B extends A{
	public void f1(){
		System.out.println("Hello");
	}
	public void f2(){
		System.out.println("Good Morning");
	}
}
class AbstractExample{
	public static void main(String[] args) {
		B obj=new B();
		obj.f1();
		obj.f2();
		// A obj=new B();
		// obj.f1();
	}
}