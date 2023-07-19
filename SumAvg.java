import java.util.Scanner;
class SumAvg
{
	public static void main(String[] args) 
	{
		int a[]=new int[50];
		int sum=0,i,n;
		double avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Value Of N: ");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print("N"+(i+1)+": ");
			a[i]=sc.nextInt();
		}	
		for (i=0;i<n;i++) 
		{
			sum=sum+a[i];	
		}
		avg=sum/n;
		System.out.println("Sum="+sum);
		System.out.println("Average="+avg);
	}
}