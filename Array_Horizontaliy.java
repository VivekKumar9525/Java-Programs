import java.util.Scanner;
class Array_Horizontaliy
{
	public static void main(String[] args) 
	{
		int a[]=new int[20];
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print("N"+(i+1)+": ");
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			System.out.printf("\t%d",a[i]);
		}
	}
}