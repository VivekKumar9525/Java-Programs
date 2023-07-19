import java.io.*;
import java.util.*;
public class subarray{
	public static void main(String arg[]){
		int arr[] = new int[5];
		int sum,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("***Enter 5 elements one by one*** ");
		for(int i=0;i<5;i++){
			System.out.print("N"+(i+1)+"= ");
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter value of k: ");
		int k=sc.nextInt();
		int start=0,end=2;
		while(end!=5){
			sum=0;
			for(int i=start;i<=end;i++){
				sum=sum+arr[i];
			}
			if(sum%k==0){
				flag=1;
			}
			start++;
			end++;
		}
		if(flag==1){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}
}