//______________________________________________Inheritance Example_______________________________
class A{
    int a=10,b=10,c;
    public void sum(){
        c=a+b;
        System.out.println("Sum="+c);
    }
}
class B extends A{
	int roll=70;
	String name="Vivek Kumar";
    void disp(){
        System.out.println("Roll No: "+roll);
        System.out.println("Name="+name);
    }
}
class InheritanceExample{
    public static void main(String[] args) {
        B ob1=new B();
        ob1.sum();
        ob1.disp();
    }
}