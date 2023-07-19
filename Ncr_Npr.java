import java.util.Scanner;
class NcrNpr
{
	int n,r,a,b,c,nc,np;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("N=");
		n=sc.nextInt();
		System.out.print("R=");
		r=sc.nextInt();
	}	
	public int fact(int n)
	{
		int f=1,i;
		for(i=1;i<=n;i++)
			f=f*i;
		return f;
	}
	public void ncr()
	{
		a=fact(n);
		b=fact(r);
		c=fact(n-r);
		nc=a/b*c;
		System.out.println("NCR="+nc);
	}
	public void npr()
	{
		a=fact(n);
		b=fact(n-r);
		np=a/b;
		System.out.println("NPR="+np);
	}
}
class Ncr_Npr
{
	public static void main(String[] args)
	{
		NcrNpr obj=new NcrNpr();
		obj.input();
		//n.fact();
	obj.ncr();
		obj.npr();
	}
}