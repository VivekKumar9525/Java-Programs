//A Hello world applet program

// import java.applet.Applet;
// import java.awt.Graphics;
// public class HelloWorld extends Applet
// {
//  @Override
//  public void paint(Graphics g)
//  {
//  g.drawString("Welcome To My World",100,50);
//  }
// } 
// <applet code="HelloWorld.class" height="400" width="500"></applet>

//______________________________________________Print String from cmd prompt_______________________________
// class HelloWorld
// {
//     public static void main(String[] args) {
//         for(int i =0;i<args.length;i++)
//             System.out.println(args[i]);
//     }
// }

//______________________________________________Add Number from cmd prompt__________________________________
// class HelloWorld
// {
//     public static void main(String[] args) {
//         int s=0;
//         for(int i =0;i<args.length;i++)
//             s=s+Integer.parseInt(args[i]);
//             System.out.println("Sum="+s);
//     }
// }

//______________________________________________Add Two Number from cmd prompt_______________________________
// class HelloWorld
// {
//     public static void main(String[] args) {
//         int a,b,c;
//         a=Integer.parseInt(args[0]);
//         b=Integer.parseInt(args[1]);
//         c=a+b;
//         System.out.println("Sum="+c);
//     }
// }

//______________________________________________Check Even/Odd from cmd prompt_______________________________
// class HelloWorld
// {
//     public static void main(String[] args) {
//         int n;
//         n=Integer.parseInt(args[0]);
//         if(n%2==0)
//             System.out.println("Even No. is "+n);
//         else
//             System.out.println("Odd No. is "+n);
//     }
// }

//______________________________________________Package Program______________________________________________
// package World;
// import java.util.Scanner;
// class HelloWorld
// {
//     public static void main(String[] args) {
//         System.out.println("Hello World");
//     }
// }
// class Sum
// {
//     public static void main(String[] args) {
//         int a,b,c;
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter First Number: ");
//         a=sc.nextInt();
//         System.out.print("Enter Second Number: ");
//         b=sc.nextInt();
//         c=a+b;
//         System.out.println("Sum="+c);
//     }
// }
// class Sub
// {
//     public static void main(String[] args) {
//         int a,b,c;
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter First Number: ");
//         a=sc.nextInt();
//         System.out.print("Enter Second Number: ");
//         b=sc.nextInt();
//         c=a-b;
//         System.out.println("Sub="+c);
//     }
// }
// class Multi
// {
//     public static void main(String[] args) {
//         int a,b,c;
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter First Number: ");
//         a=sc.nextInt();
//         System.out.print("Enter Second Number: ");
//         b=sc.nextInt();
//         c=a*b;
//         System.out.println("Multi="+c);
//     }
// }
// class Div
// {
//     public static void main(String[] args) {
//         int a,b,c;
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter First Number: ");
//         a=sc.nextInt();
//         System.out.print("Enter Second Number: ");
//         b=sc.nextInt();
//         c=a/b;
//         System.out.println("Div="+c);
//     }
// }

//______________________________________________Class & Object Example_______________________________
// class First{
//     public int length,breadth,height;
//     public void input(int l,int b,int h){
//         length=l;
//         breadth=b;
//         height=h;
//     }
//     public void display(){
//         System.out.println("L="+length);
//         System.out.println("B="+breadth);
//         System.out.println("H="+height);
//     }
// }
// class HelloWorld{
//     public static void main(String[] args) {
//         First f=new First();
//         f.input(10,20,30);
//         f.display();
//     }
// }


//______________________________________________Class Function Example_______________________________
// import java.util.*;
// class HelloWorld{
//      String name;
//      int acno;
//      float bal;
//       void input(int a,String n,float b){
//         acno=a;
//         name=n;
//         bal=b;
//     }
//       void display(){
//         System.out.println("Account Holder Name: "+name);
//         System.out.println("Account Number: "+acno);
//         System.out.println("Account Balance: "+bal);
//     }
//     public static void main(String[] args) {
        // String name="Vivek Kumar";
        // int acno=12345;
        // float bal=110000;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Account Number: ");
        // acno=sc.nextInt();
        // System.out.println("Account Holder Name: ");
        // name=sc.nextLine();
        // System.out.println("Account Balance: ");
        // bal=sc.nextFloat();
        // HelloWorld h=new HelloWorld();
        // h.input(acno,name,bal);
//         h.input(12345,"vivek",110000);
//         h.display();
//     }
// }



// 9.  WAP to implement getter and setter methods.
// class Student{
//     String name;
//     int roll;
//     String course;
//     int section;
//     public void setDetails(String name,int roll,String course,int section){
//         this.name=name;
//         this.roll=roll;
//         this.course=course;
//         this.section=section;
//     }
//     public void getDetails(){
//         System.out.println("Name: "+this.name);
//         System.out.println("Roll No: "+this.roll);
//         System.out.println("Course: "+this.course);
//         System.out.println("Section: "+this.section);
//     }
// }
// class HelloWorld{
//     public static void main(String[] args) {
//         Student s=new Student();
//         s.setDetails("VIVEK KUMAR",70,"MCA",10);
//         s.getDetails();
//     }
// }

// 11. WAP to create a class Student with data ‘name, city and age’ along with method printData 
// to display the data. Create two objects s1, s2 to declare and access the values. 
// class Student{
//     String name;
//     String city;
//     int age;
//     public void printData(String name,String city,int age){
//         this.name=name;
//         this.city=city;
//         this.age=age;
//         System.out.println("Name: "+this.name);
//         System.out.println("City: "+this.city);
//         System.out.println("Age: "+this.age);
//     }
// }
// class HelloWorld{
//     public static void main(String[] args) {
//         Student s1=new Student();
//         Student s2=new Student();
//         s1.printData("KRISHNA KUMAR","MADHEPURA",25);
//         s2.printData("VIVEK KUMAR","MADHEPURA",23);
//     }
// }

// 12. WAP to implement the concept of method overloading and constructor overloading.
// class A{
//     String name;
//     int id;
//     A(){
//         System.out.println("Default Constructor");
//     }
//     A(String name,int id){
//         this.name=name;
//         this.id=id;
//         System.out.println("Name: "+name);
//         System.out.println("ID: "+id);
//     }
//     void input(int a,int b){
//         int s=a+b;
//         System.out.print("Sum="+s);
//     }
//     void input(int a,int b,int c){
//         int s=a+b+c;
//         System.out.print("\nSum="+s);
//     }
// }
// class HelloWorld{
//     public static void main(String[] args) {
//         A a=new A();
//         A a2=new A("Parameterised Constructor",2);
//         a.input(5,5);
//         a.input(2,4,6);
//     }
// }

// 13. WAP to create a class Shape and override area () method to
 // calculate area of rectangle, square and circle.
// import java.util.Scanner;
// class Rectangle{
//     float l,b;
//     public void area(){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter The Length: ");
//         l=sc.nextFloat();
//         System.out.print("Enter The Breadth: ");
//         b=sc.nextFloat();
//         float ar=l*b;
//         System.out.println("Area of Rectangle="+ar);
//     }
// }
// class Square extends Rectangle
// {
//     float a;
//     public void area(){
//         super.area();
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter The Sides: ");
//         a=sc.nextFloat();
//         float ar=a*a;
//         System.out.println("Area of Square="+ar);
//     }
// }
// class Circle extends Square
// {
//     float r;
//     public void area(){
//         super.area();
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter The Radius: ");
//         r=sc.nextFloat();
//         double ar=3.14*r*r;
//         System.out.println("Area of Circle="+ar);
//     }
// }
// class HelloWorld{
//     public static void main(String[] args) {
//         Circle c=new Circle();
//         c.area();
//     }
// }

// 14. WAP to demonstrate simple inheritance and multilevel inheritance.
// class A{
//     public void f1(){
//         System.out.println("Parent Class");
//     }
// }
// class B extends A{
//     public void f2(){
//         System.out.println("Intermediate Class");
//     }
// }
// class C extends B{
//     public void f3(){
//         System.out.println("Child Class");
//     }
// }
// class HelloWorld{
//     public static void main(String[] args) {
//         B b=new B();
//         b.f1();
//         C c=new C();
//         c.f1();
//         c.f2();
//         c.f3();
//     }
// }

/*15. Write a java program to create an abstract class named Shape that contains two integers and an empty 
method named print Area (). Provide three classes named Rectangle, Triangle and Circle such that each 
one of the classes extends the class Shape. Each one of the classes contains only the method 
print Area () that prints the area of the given shape.*/
// import java.util.Scanner;
// abstract class Shape{
//     int l,b;
//     abstract void area();
// }
// class Rectangle extends Shape{
//     public void area(){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Now, Calculate Area of Rectangle..");
//         System.out.print("Enter The Length: ");
//         int l=sc.nextInt();
//         System.out.print("Enter The Width: ");
//         int b=sc.nextInt();
//         int ar=l*b;
//         System.out.println("Area of Rectangle: "+ar);
//     }
// }
// class Triangle extends Shape{
//     public void area(){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Now, Calculate Area of Triangle..");
//         System.out.print("Enter The Base: ");
//         int l=sc.nextInt();
//         System.out.print("Enter The Hight: ");
//         int b=sc.nextInt();
//         int ar=(l*b)/2;
//         System.out.println("Area of Triangle: "+ar);
//     }
// }
// class Circle extends Shape{
//     public void area(){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Now, Calculate Area of Circle..");
//         System.out.print("Enter The Radius: ");
//         int l=sc.nextInt();
//         double ar=3.14*l*l;
//         System.out.println("Area of Circle: "+ar);
//     }
// }
// class HelloWorld{
//     public static void main(String[] args) {
//         Rectangle r=new Rectangle();
//         Triangle t=new Triangle();
//         Circle c=new Circle();
//         r.area();
//         t.area();
//         c.area();
//     }
// }

// 16. WAP to implement multiple inheritance using interfaces.
// interface I1{
//     void disp1();
// }
// interface I2{
//     void disp2();
// }
// class A implements I1,I2{
//     public void disp1(){
//         System.out.println("Interface 1");
//     }
//     public void disp2(){
//         System.out.println("Interface 2");
//     }
//     public void display(){
//         System.out.println("Class A");
//     }
// }
// class HelloWorld{
//     public static void main(String[] args) {
//         A obj=new A();
//         obj.disp1();
//         obj.disp2();
//         obj.display();
//     }
// }


// 17. WAP to implement the concept of importing classes from user defined package and created packages.
// package addition;
// import pkg.*;
// import java.util.Scanner;
// public class HelloWorld{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter First Value: ");
//         int a=sc.nextInt();
//         System.out.print("Enter Second Value: ");
//         int b=sc.nextInt();
//         PackageExample p=new PackageExample();
//         p.sum(a,b);
//     }
// }