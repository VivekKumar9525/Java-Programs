//______________________________________________Example of Method Overriding_______________________________
class A{
    void display(){
        System.out.println("This is Parent Class");
    }
}
class B extends A{
    void display(){
        super.display();
        System.out.println("This is Child Class");
    }
}
class MethodOverriding{
    public static void main(String[] args) {
        B b=new B();
        b.display();
    }
}

//______________________________________________Example of Reference Variable_______________________________
class A{
	public void f1(){
		System.out.println("This is Parent Class");
	}
}
class B extends A
{
	public void f1(){
		// super.f1();
		System.out.println("This is Child Class");
	}
}
class Test{
	public static void main(String[] args) {
		A b=new B();
		b.f1();
	}
}