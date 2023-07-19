interface I1{
    void disp1();
}
interface I2{
    void disp2();
}
class A implements I1,I2{
    public void disp1(){
        System.out.println("Interface 1");
    }
    public void disp2(){
        System.out.println("Interface 2");
    }
    public void display(){
        System.out.println("Class A");
    }
}
class InterfaceExample{
    public static void main(String[] args) {
        A obj=new A();
        obj.disp1();
        obj.disp2();
        obj.display();
    }
}