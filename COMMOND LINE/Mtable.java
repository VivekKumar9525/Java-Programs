import java.util.Scanner;
class Mtable
{
	public static void main(String []arg)
	{
		int n;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a no. :");
		n=obj.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
		}
	}
}		
