import java.util.Scanner;
class ArrayAddition
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter number of dig");
		int n= sc.nextInt(); 
		int a[] =new int[n];
		for(int i=0; i<n; i++){
			System.out.print("Enter"+(i+1)+"number: ");
			a[i]= sc.nextInt();
		}
		System.out.println("***Your number*** ");
		for(int i=0; i<n; i++){
			System.out.println(a[i]);
		}


	}
}

