import java.util.*;
import java.io.*;
public class plateform{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of trains: ");
		int c=0,nt=sc.nextInt();
		int arvt[]=new int[nt];
		int dept[]=new int[nt];
		System.out.println("Enter arrival time one by one: ");
		for(int i=0;i<nt;i++){
			System.out.print("T"+(i+1)+": ");
			arvt[i]=sc.nextInt();
		}
		System.out.println("Enter departure time one by one: ");
		for(int i=0;i<nt;i++){
			System.out.print("T"+(i+1)+": ");
			dept[i]=sc.nextInt();
		}
		for(int i=0;i<nt-1;i++){
			if(dept[i]>=arvt[i+1]){
				c++;
			}
		}
		System.out.println("Flateform: "+c);
	}
}