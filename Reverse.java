import java.util.Scanner;
class Reverse
{
	public static void main(String[] args)
	{
		int n,a,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any No: ");
		n=sc.nextInt();
		int x=n;
		while(n!=0)
		{
			a=n%10;
			rev=rev*10+a;
			n=n/10;
		}
		System.out.println("Reverse of "+x+" is: "+rev);
	}
}