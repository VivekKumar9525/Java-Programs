import java.util.Scanner;
class LeapYear1
{
	public static void main(String[] args) 
	{
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Year: ");
		year=sc.nextInt();
		if(year%4==0 && year%100!=0)
		{
				System.out.println(year+" is Leap Year");
		}
		else if(year%4==0 && year%400==0)
			{
				System.out.println(year+" is Leap Year");	
			}
		else
		{
			System.out.println(year+" is Not Leap Year");
		}
	}
}