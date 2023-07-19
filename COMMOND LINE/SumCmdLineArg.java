/** Input through command line argument*/
class SumCmdLineArg
{
	public static void main(String args[])
	{
		int a,b,sum;
		a=Integer.parseInt(args [0]);
		b=Integer.parseInt(args [1]);
		sum=a+b;
		System.out.println("A="+a);
		System.out.println("B="+b);
		System.out.println("Sum="+sum);
	}
}