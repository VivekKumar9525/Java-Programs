import java.util.Scanner;
class ArrayOpera{
	public static void main(String[] args) {
		int a[]=new int[10];
		int n,i,j,s1=0,s2=0,s3=0,MAX,MIN,temp,round,found=0;
		loop:while(true){
			Scanner sc=new Scanner(System.in);
			System.out.println("\n                           *******  Choice Menu  *******");
			System.out.println("\n1. Sum of Numbers in this Array");
			System.out.println("\n2. Sum of Even Numbers in this Array");
			System.out.println("\n3. Sum of Odd Numbers in this Array");
			System.out.println("\n4. Greatest Number in this Array");
			System.out.println("\n5. Smallest Number in this Array");
			System.out.println("\n6. Reverse Numbers in this Array");
			System.out.println("\n7. Sorting Numbers in this Array");
			System.out.println("\n8. Search Numbers in this Array");
			System.out.println("\n9. Insert an Element in this Array");
			System.out.println("\n10.Delete an Element in this Array");
			System.out.println("\n11. Exit");
			System.out.print("\nEnter Your Choice: ");
			int ch=sc.nextInt();
			switch(ch){
				case 1:
					System.out.print("Enter The Number of Element: ");
					n=sc.nextInt();
					for(i=0;i<n;i++){
						a[i]=sc.nextInt();
						s1=s1+a[i];
					}
					System.out.println("\nSum of Numbers= "+s1);
					break;
				case 2:
					System.out.print("Enter The Number of Element: ");
					n=sc.nextInt();
					for(i=0;i<n;i++){
						a[i]=sc.nextInt();
						if(a[i]%2==0)
							s2=s2+a[i];
					}
					System.out.println("\nSum of Even Numbers= "+s2);
					break;
				case 3:
					System.out.print("Enter The Number of Element: ");
					n=sc.nextInt();
					for(i=0;i<n;i++){
						a[i]=sc.nextInt();
						if(a[i]%2!=0)
							s3=s3+a[i];
					}
					System.out.println("\nSum of Odd Numbers= "+s3);
					break;
				case 4:
					System.out.print("Enter The Number of Element:\n");
					n=sc.nextInt();
					for(i=0;i<n;i++){
						a[i]=sc.nextInt();
					}
					MAX=a[0];
					for(i=0;i<n;i++){
						if(MAX<a[i])
							MAX=a[i];
					}
					System.out.println("\nGreatest Number= "+MAX);
					break;
				case 5:
					System.out.print("Enter The Number of Element:\n");
					n=sc.nextInt();
					for(i=0;i<n;i++){
						a[i]=sc.nextInt();
					}
					MIN=a[0];
					for(i=0;i<n;i++){
						if(MIN>a[i])
							MIN=a[i];
					}
					System.out.println("\nSmallest Number= "+MIN);
					break;
				case 6:
					System.out.print("Enter The Number of Element: ");
					n=sc.nextInt();
					for(i=0;i<n;i++){
						a[i]=sc.nextInt();
					}
					for(i=0;i<n/2;i++){
						temp=a[i];
						a[i]=a[n-i-1];
						a[n-i-1]=temp;
					}
					System.out.println("Reverse Numbers");
					for(i=0;i<n;i++){
						System.out.print(+a[i]+" ");
					}
					break;
				case 7:
					System.out.print("Enter The Number of Element: ");
					n=sc.nextInt();
					for(i=0;i<n;i++){
						a[i]=sc.nextInt();
					}
					for(round=1;round<=n-1;round++){
						for(i=0;i<=n-1-round;i++){
							if(a[i]>a[i+1]){
								temp=a[i];
								a[i]=a[i+1];
								a[i+1]=temp;
							}
						}
					}
					System.out.println("Sorting Numbers");
					for(i=0;i<n;i++){
						System.out.print(+a[i]+" ");
					}
					break;
				case 8:
					System.out.print("Enter The Number of Element:");
					n=sc.nextInt();
					for(i=0;i<n;i++){
						a[i]=sc.nextInt();
					}
					System.out.print("Which Number do you want to Search: ");
					int ele=sc.nextInt();
					for(i=0;i<n;i++){
						if(a[i]==ele){
							found++;
							break;
						}
					}
					if(found==1){
						System.out.println(ele+" is Available at Position "+(i+1));
					}
					else{
						System.out.println(ele+"is not Available");
					}
					break;
				case 9:
					System.out.print("Enter The Number of Element: ");
					n=sc.nextInt();
					for(i=0;i<n-1;i++){
						System.out.print((i+1)+"No is: ");
						a[i]=sc.nextInt();
					}
					System.out.print("Enter an Element to Insert in the Array: ");
					int element=sc.nextInt();
					System.out.print("Enter Index Number to Insert Element in the Array: ");
					int index=sc.nextInt();
					for(i=n-2;i>=index;i--){
						a[i+1]=a[i];
					}
					a[index]=element;
					System.out.print("After Inserted an Element in the Array:\n");
					for(i=0;i<n;i++){
						System.out.print(a[i]+" ");
					}
					break;
				case 10:
					System.out.print("Enter The Number of Element: ");
					n=sc.nextInt();
					for(i=0;i<n;i++){
						System.out.print((i+1)+"No is: ");
						a[i]=sc.nextInt();
					}
					System.out.print("Which Number Do You Want to Delete: ");
					element=sc.nextInt();
					index=n-1;
					for(i=0;i<=index;i++){
						if(a[i]==element){
							for(j=i+1;j<=index;j++){
								a[j-1]=a[j];
							}
							i--;
							index--;
						}
					}
					System.out.print("After Delete an Element from the Array:\n");
					for(i=0;i<=index;i++){
						System.out.print(a[i]+" ");
					}
				case 11:
					break loop;
				default:
					System.out.println("\nInvalid Input!!!!");
			}
		}
		
	}
}