import java.util.Scanner;
import java.lang.Math;
class SwitchCase1{
	public static void main(String[] args) {
		int a,b,c,n,f=1,i,t=0;
		loop:while(true){
			Scanner sc=new Scanner(System.in);
			System.out.println("\n            _________________*******  Choice Menu  *******________________");
			System.out.println(" 1. Addition");
			System.out.println(" 2. Subtraction");
			System.out.println(" 3. Multiplication");
			System.out.println(" 4. Division");
			System.out.println(" 5. Modulus");
			System.out.println(" 6. Find Factorial of the Number");
			System.out.println(" 7. Find Power to the Number");
			System.out.println(" 8. Check Prime/Composite Number");
			System.out.println(" 9. Display Fibonacci Series");
			System.out.println("10. Find LCM & HCF");
			System.out.println("11. Sum of N Numbers");
			System.out.println("12. Sum of Digits");
			System.out.println("13. Reverse of Number");
			System.out.println("14. Calculate Simple Interest");
			System.out.println("15. Convert Decimal To Binary");
			System.out.println("16. Convert Binary To Decimal");
			System.out.println("17. Exit");
			System.out.print("Enter Your Choice: ");
			int ch=sc.nextInt();
			switch(ch){
			case 1:
					System.out.print("Enter First Number: ");
					a=sc.nextInt();
					System.out.print("Enter Second Number: ");
					b=sc.nextInt();
					c=a+b;
					System.out.print("Sum="+c);
					break;
			case 2:
					System.out.print("Enter First Number: ");
					a=sc.nextInt();
					System.out.print("Enter Second Number: ");
					b=sc.nextInt();
					c=a-b;
					System.out.print("Sub="+c);
					break;
			case 3:
				System.out.print("Enter First Number: ");
				a=sc.nextInt();
				System.out.print("Enter Second Number: ");
				b=sc.nextInt();
				c=a*b;
				System.out.print("Multi="+c);
				break;
			case 4:
				System.out.print("Enter First Number: ");
				a=sc.nextInt();
				System.out.print("Enter Second Number: ");
				b=sc.nextInt();
				c=a/b;
				System.out.print("Div="+c);
				break;
			case 5:
				System.out.print("Enter First Number: ");
				a=sc.nextInt();
				System.out.print("Enter Second Number: ");
				b=sc.nextInt();
				c=a%b;
				System.out.print("Mod="+c);
				break;
			case 6:
				System.out.print("Enter Any No: ");
				n=sc.nextInt();
				for (i=1;i<=n;i++)
				{
					f=f*i;		
				}
				System.out.print("Factorial="+f);
				break;
			case 7:
				double q;
				System.out.print("Enter Any No: ");
				a=sc.nextInt();
				System.out.print("Enter Power: ");
				b=sc.nextInt();
				q=Math.pow(a,b);
				System.out.print(a+" to the Power "+b+"="+q);
				break;
			case 8:
				System.out.print("Enter Any No: ");
				n=sc.nextInt();
				for(i=1;i<=n;i++)
				{
					if(n%i==0)
					t++;
				}
				if(t==2)
				System.out.print("Prime Number");
				else
				System.out.print("Composite Number");
				break;
			case 9:
				int x=0,y=1;
				System.out.print("Enter no. of terms: ");
				n=sc.nextInt();
				System.out.println("The Fibonacci series as follows: ");
				System.out.print(x+"  "+y);
				for(i=1;i<=n;i++)
				{
						c=x+y;
						System.out.print("  "+c);
						x=y;
						y=c;
				}
				break;
			case 10:
				int lcm,hcf=1;
				System.out.print("Enter First Value: ");
				a=sc.nextInt();
				System.out.print("Enter Second Value: ");
				b=sc.nextInt();
				for(i=1;(i<=a && i<=b);i++)
				{
					if(a%i==0 && b%i==0)
					hcf=i;
				} 
				lcm=a*b/hcf;
				System.out.println("LCM="+lcm);
				System.out.println("HCF="+hcf);
				break;
			case 11:
				int h=0;
				System.out.print("Enter The Number: ");
				n=sc.nextInt();
				for(i=1;i<=n;i++){
					h=h+i;
				}
				System.out.println("Sum of Numbers="+h);
				break;
			case 12:
				int m,v=0;
				System.out.print("Enter The Number: ");
				n=sc.nextInt();
				while(n!=0){
					m=n%10;
					v=v+m;
					n=n/10;
				}
				System.out.println("Sum of Digits="+v);
				break;
			case 13:
				int j=0;
				System.out.print("Enter The Number: ");
				n=sc.nextInt();
				while(n!=0){
					m=n%10;
					j=j*10+m;
					n=n/10;
				}
				System.out.println("Reverse of Numbers="+j);
				break;
			case 14:
				float p,r,k,si;
				System.out.print("Enter The Principle Amount: ");
				p=sc.nextFloat();
				System.out.print("Enter The Rate: ");
				r=sc.nextFloat();
				System.out.print("Enter The Time: ");
				k=sc.nextFloat();
				si=(p*r*k)/100;
				System.out.println("Simple Interest="+si);
				break;
			case 15:
				double s=0;
				int g=0;
				System.out.print("Enter The Decimal No: ");
				n=sc.nextInt();
				while(n!=0){
					m=n%2;
					s=s+m*(Math.pow(10,g));
					n=n/2;
					g++;
				}
				System.out.print("Binary Number="+s);
				break;
			case 16:
				double d=0;
				int w=0;
				System.out.print("Enter The Binary No: ");
				n=sc.nextInt();
				while(n!=0){
					m=n%10;
					d=d+m*(Math.pow(2,w));
					n=n/10;
					w++;
				}
				System.out.print("Decimal Number="+d);
				break;
			case 17:
				break loop;
			default:
				System.out.print("\nInvalid Input !!!!");
				System.out.print("\nPlease Enter Valid Input....");
			}
		}
	}
}