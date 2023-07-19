import java.util.Scanner;
class MultiplyMatrix{
	public static void main(String[]args){
		int a[][]= new int[10][10];
		int b[][]= new int[10][10];
		int m[][]= new int[10][10];
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
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				m[i][j]=0;
				for(int k=0;k<c;k++){
					m[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		System.out.print("Multiplication of Matrixes:\n");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(m[i][j]+"\t");
			}
			System.out.print("\n\n");
		}
	}
}
