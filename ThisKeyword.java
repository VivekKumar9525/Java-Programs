//______________________________________________Example of this keyword_______________________________
import java.util.Scanner;
class Box{
	private int a,b,s;
	public void setValue(int a,int b)      //input function
	{
		this.a=a;
		this.b=b;
		s=this.a + this.b;
	}
	public void getValue()                 //output function
	{
		System.out.println("Sum="+s);
	}
}
class ThisKeyword{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Value: ");
		int a=sc.nextInt();
		System.out.print("Enter Sccond Value: ");
		int b=sc.nextInt();
		Box b1=new Box();
		b1.setValue(a,b);
		b1.getValue();
	}
}