import java.util.Scanner;
class Factorial
{
	public static void main(String[] args) 
	{
		int n,i,f=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any No.");
		n=sc.nextInt();
		for (i=1;i<=n;i++){
			f=f*i;		
		}
		System.out.println("Factorial="+f);	
	}
}

// import java.util.Scanner;
// class Factorial
// {
//     public static void main(String[] args) 
//     {
//         int a,b,sum;
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter First Value:");
//         a=sc.nextInt();
//         System.out.print("Enter Second Value:");
//         b=sc.nextInt();
//         sum=a+b;
//         System.out.println("Sum="+sum); 
//     }
// }