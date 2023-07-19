import java.util.Scanner;
class Array_LargestNo
{
	public static void main(String[] args) 
	{
		int a[]=new int[20];
		int b[]=new int[20];
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print("N"+(i+1)+": ");
			a[i]=sc.nextInt();
		}	
		for(i=0;i<n;i++)
		{
			a[i]<b[i];
			System.out.printf("%d",a[i]);
		}
	}
}