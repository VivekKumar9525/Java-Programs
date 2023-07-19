//Write a program in java to add two matrix using multi-dimensional arrays.
import java.util.Scanner;
class ArSumMatrix{
	public static void main(String[]args){
		int a[][]= new int[10][10];
		int b[][]= new int[10][10];
		int s[][]= new int[10][10];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number of Rows: ");
		int r=sc.nextInt();
		System.out.print("Enter The Number of Columns: ");
		int c=sc.nextInt();
		System.out.print("Enter Element for First Matrix: ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.print("Enter Element for Second Matrix: ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				b[i][j]=sc.nextInt();
			}
		}
		System.out.print("Sum of Matrix:\n");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				s[i][j]=a[i][j]+b[i][j];
				System.out.print(s[i][j]+"\t");
			}
			System.out.print("\n\n");
		}
	}
}
