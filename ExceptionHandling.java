//__________________________________________Our throw and our catch___________________________________
//_____________________________Division of Two Numbers Using Exception Handling______________________________
// import java.util.Scanner;
// class ExceptionHandling{
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		try{
// 			System.out.print("Enter First Value: ");
// 			float a=sc.nextInt();
// 			System.out.print("Enter Second Value: ");
// 			float b=sc.nextInt();
// 			if(b==0)
// 				throw new ArithmeticException("You Entered Second Value Zero");
// 			float s=a/b;
// 			System.out.println(a+" divide by "+b+" is= "+s);
// 		}
// 		catch(ArithmeticException e){
// 			System.out.println("Exception: "+e.getMessage());
// 		}
// 		System.out.println("Thank You");
// 	}
// }

//_____________________________Check Prime Number Using Exception Handling______________________________
// import java.util.Scanner;
// class ExceptionHandling{
// 	public static void main(String[] args) {
// 		int c=0;
// 		Scanner sc=new Scanner(System.in);
// 		try{
// 			System.out.print("Enter a Number: ");
// 			float a=sc.nextInt();
// 			if(a==0)
// 				throw new ArithmeticException("You Entered Value Zero");
// 			for(int i=1;i<=a;i++){
// 				if(a%i==0)
// 					c++;
// 			}
// 			if(c==2)
// 				System.out.println(a+" is a Prime Number");
// 			else
// 				System.out.println(a+" is a not Prime Number");
// 		}
// 		catch(ArithmeticException e){
// 			System.out.println("Exception: "+e.getMessage());
// 		}
// 		System.out.println("Thank You");
// 	}
// }

// import java.util.Scanner;
// class ExceptionHandling{
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		try{
// 			String name=" ";
// 			System.out.print("Enter Name: ");
// 			name=sc.nextLine();
// 			if(name==null)
// 				throw new IllegalArgumentException("Please Enter Name..");
// 			System.out.println("Name: "+name);
// 		}
// 		catch(IllegalArgumentException n){
// 			System.out.println("Exception: "+n.getMessage());
// 		}
// 		System.out.println("Hello");
// 	}
// }

//_____________________________Check Even Number Using Exception Handling______________________________
// import java.util.Scanner;
// class ExceptionHandling{
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		try{
// 			System.out.print("Enter a Number: ");
// 			int n=sc.nextInt();
// 			if(n==0)
// 				throw new ArithmeticException("You Entered Zero..");
// 			int a=n%10;
// 			if(a==0 || a==2 || a==4 || a==6 || a==8)
// 				System.out.println("Even Number");
// 			else
// 				System.out.println("Odd Number");
// 		}
// 		catch(ArithmeticException e){
			// System.out.println("Exception: "+e.getMessage());
// 		}
// 		System.out.println("Thanks");
// 	}
// }

// Q22. Write a program that creates a user interface to perform integer division. The user 
//      enters two numbers through command line arguments as Num1 and Num2, perform 
//      division and returns the remainder. If Num1 and Num2 are not integers, then Number 
//      Format Exception has to be generated. If Num2 is Zero, Arithmetic Exception has to 
//      be generated.
import java.util.*;
// import java.util.InputMismatchException;
// import java.util.Scanner;
class ExceptionHandling{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
			System.out.print("Enter First Number: ");
			int a=sc.nextInt();
			System.out.print("Enter Second Number: ");
			int b=sc.nextInt();
			if(b==0)
				throw new ArithmeticException("You Entered Zero..");
			double div=a/b;
			System.out.println("Division="+div);
		}
		catch(ArithmeticException e){
			System.out.println("Exception: You Entered Zero..");
		}
		catch(InputMismatchException n){
			System.out.println("Exception: Please input the number it is not a number..");
		}
		System.out.println("Thanks");
	}
}

// Q27  Write a program in Java to store the marks of 10 students. Define your own exception. 
//      Make use of your exception if entered marks are less than 0 or greater than 100.
// import java.util.Scanner;
// class ExceptionHandling{
// 	public static void main(String[] args) {
// 		int a[]=new int[10];
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("Enter 10 Student Marks: ");
// 		try{
// 			for(int i=0;i<10;i++){
// 				System.out.print("Student "+(i+1)+" Marks: ");
// 				a[i]=sc.nextInt();
// 				if(a[i]<0 || a[i]>100)
// 					throw new ArithmeticException("Marks not valid");
// 			}
// 			System.out.println("Given Marks:");
// 			for(int i=0;i<10;i++){
// 				System.out.print(a[i]+"\n");
// 			}
// 		}
// 		catch(ArithmeticException e){
// 			System.out.println("Exception: "+e.getMessage());
// 		}
// 		System.out.println("Thanks");
// 	}
// }


// import java.util.Scanner;
// class ExceptionHandling {
//     public static void main(String[] args) {
//         // int i;
//         Scanner sc=new Scanner(System.in);
//         try{
//             System.out.print("Enter the Number of Element: ");
//         int n=sc.nextInt();
//         int a[]=new int[n];
//         for(int i=0;i<n;i++){
//         System.out.print((i+1)+" No: ");
//             a[i]=sc.nextInt();
//         }
//         a[n+1]=n;
//             throw new ArrayIndexOutOfBoundsException("zzzz");
//         for(int i=0;i<n;i++){
//         System.out.println(a[i]);
//         }
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Hello"+e.getMessage());
//         }
//         System.out.println("Hii");
//     }
// }

/*7. Write a program in Java to store the marks of 10 students. Define your own exception. Make use of your exception 
     if entered marks are less than 0 or greater than 100.*/
import java.util.*;
class Stduent{
    public static void main(String args[]){
        int m[]=new int[10];
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter 10 Student Marks:");
            for(int i=0;i<10;i++){
                System.out.print("Student"+(i+1));
                m[i]=sc.nextInt();
                if(m[i]<0 || m[i]>100)
                    throw new ArithmeticException("You Entered Negative or, more than one Hundred");
            }
            System.out.println("10 Student Marks");
            for(int i=0;i<10;i++){
                System.out.println(m[i]);
            }
        }
        catch(ArithmeticException e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}