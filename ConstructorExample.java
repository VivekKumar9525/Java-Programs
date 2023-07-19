//______________________________________________Constructor Example_______________________________
class ConstructorExample{
    public int l,b,h;
    public HelloWorld(){
        l=10;
        b=20;
        h=30;
    }
    public HelloWorld(int L,int B,int H){
        l=L;
        b=B;
        h=H;
    }
    public void display(){
        System.out.println("L="+l);
        System.out.println("B="+b);
        System.out.println("H="+h);
    }
    public static void main(String[] args) {
        HelloWorld h1=new HelloWorld();
        HelloWorld h2=new HelloWorld(40,50,60);
        h1.display();
        h2.display();
    }
}

//______________________________________________Parameterised Constructor Example_______________________________
// import java.util.Scanner;
// class Sum{
//     int z;
//     Sum(int x,int y){   //Parameterised Constructor
//         z=x+y;
//     }
//     void disp(){
//         System.out.print("Sum="+z);
//     }
// }
// class HelloWorld{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter Two Number: ");
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         Sum s=new Sum(a,b);
//         s.disp();
//     }
// }

//__________________________________________Example of Constructor___________________________________
// import java.util.Scanner;
// class Test{
// 	Test(){
// 		System.out.print("Hello World\n");
// 	}
// 	Test(int a,int b){
// 		int c;
// 		c=a+b;
// 		System.out.print("Sum="+c);
// 	}
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter First Number: ");
// 		int a=sc.nextInt();
// 		System.out.print("Enter Second Number: ");
// 		int b=sc.nextInt();
// 		Test t1=new Test();
// 		Test t2=new Test(a,b);
// 	}
// }