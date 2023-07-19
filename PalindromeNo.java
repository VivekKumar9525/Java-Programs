import java.util.Scanner;
class PalindromeNo
{
	public static void main(String[] args) 
	{
		int n,x,a,r=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any No: ");
		n=sc.nextInt();
		x=n;
		while(n!=0)
		{
			a=n%10;
			r=r*100+a;
			n=n/10;
		}
		if(r==x)
		{
			System.out.print("Palindrome No.");
		}
		else
		{
			System.out.print("Not Palindrome No.");
		}
	}
}