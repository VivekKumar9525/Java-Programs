import java.util.Scanner;
class Student
{
	string name;
	int roll;
	double marks;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student Name: ");
		name=sc.nextLine();
		System.out.print("Enter Student Roll: ");
		roll=sc.nextInt();
		System.out.print("Enter Student Marks: ");
		marks=sc.nextDouble();
	}
	public void display()
	{
		System.out.println("Student Name="+name);
		System.out.println("Student Roll="+roll);
		System.out.println("Student Marks="+marks);
	}
}
class Fee extends Student
{
	int fee;
	string month;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student Month: ");
		month=sc.nextLine();
		System.out.print("Enter Student Fees: ");
		fee=sc.nextInt();
	}
	public void display()
	{
		super.display();
		System.out.println("Student Fee Month="+month);
		System.out.println("Student Fee="+fee);	
	}
}
class StudentInf
{
	public static void main(String args[])
	{
		Fee f=new Fee();
		f.input();
		f.display();
	}
}