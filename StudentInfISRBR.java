class Student
{
	string name;
	int roll;
	double marks;
	public void input()
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Enter Student Name:");
		name=Line.parseLine(br.readLine());
		System.out.print("Enter Student Roll:");
		roll=Integer.parseInt(br.readLine());
		System.out.print("Enter Student Marks:");
		marks=Double.parseDouble(br.readLine());
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
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Enter Student Fee Month:");
		month=Line.parseLine(br.readLine());	
		System.out.print("Enter Student Fee:");
		fee=Integer.parseInt(br.readLine());
	}
	public void display()
	{
		super.display();
		System.out.println("Student Fee Month="+month);
		System.out.println("Student Fee="+fee);
	}
}
class StudentInfISRBR
{
	public static void main(String[] args) 
	{
		Fee f=new Fee();
		f.input();
		f.display();		
	}
}