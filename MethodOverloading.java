//______________________________________________Example of Method Overloading_______________________________
class A{
    void input(int a,int b){
        int s=a+b;
        System.out.print("Sum="+s);
    }
    void input(int a,int b,int c){
        int s=a+b+c;
        System.out.print("\nSum="+s);
    }
}
class MethodOverloading{
    public static void main(String[] args) {
        A a=new A();
        a.input(5,5);
        a.input(2,4,6);
    }
}