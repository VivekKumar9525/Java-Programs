import java.util.Scanner;
class Array_Sum_Avg2
{
	public static void main(String[] args) 
	{
		double avg=0;
		int n,i,sum=0;
		int a[]=new int[50];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		n=sc.nextInt();
		for (i=0;i<n;i++) 
		{
			System.out.print("N"+(i+1)+": ");
			a[i]=sc.nextInt();	
		}
		for(i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/n;
		System.out.println("Sum="+sum);
		System.out.println("Average="+avg);
	}
}