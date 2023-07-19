// import java.util.Scanner;
// class PrimeR
// {
// 	public static void main(String[] args) 
// 	{
// 		int n,n1,n2,i,c,cnt=0;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter the first range No.");
// 		n1=sc.nextInt();
// 		System.out.print("Enter the second range No.");
// 		n2=sc.nextInt();
// 		System.out.println("All Prime no. from " +n1+ "to" +n2+ "are:");
// 		for(n=n1;n<=n2;n++)
// 		{
// 			c=0;
// 			for(i=1;i<=n;i++)
// 			{
// 				if(n%i==0)
// 				c++;
// 			}
// 			if(c==2)
// 			{
// 				cnt++;
// 				System.out.printf("%d\t",n);
// 			}
// 		}
// 		System.out.println("\nAll Prime No."+cnt);
// 	}
// }

import java.util.Scanner;
class PrimeR
{
    public static void main(String[] args)
    {
        int n,n1,i,n2,c,cnt=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The First Range Value: ");
        n1=sc.nextInt();
        System.out.print("Enter The Second Range Value: ");
        n2=sc.nextInt();
        for(n=n1;n<=n2;n++)
		{
			c=0;
			for(i=1;i<=n;i++)
			{
				if(n%i==0)
					c++;
			}
			if(c==2)
			{
				cnt++;
				System.out.printf("%d\t",n);
			}
		}
		System.out.print("Total Prime No.s="+cnt);
    }
}