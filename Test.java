//__________________________________________Add Two Number Using Function___________________________________
// import java.util.Scanner;
// class Test
// {
// 	static int a,b;
// 	public static int Sum()
// 	{
// 		int c;
// 		c=a+b;
// 		return c;
// 	}
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter First No: ");
// 		a=sc.nextInt();
// 		System.out.print("Enter Second No: ");
// 		b=sc.nextInt();
// 		int s=Sum();
// 		System.out.println("Sum="+s);
// 	}
// }

//______________________________________________Find Area & Circumfrence of Circle__________________________
// import java.io.*;
// import java.util.Scanner;
// class Test 
// {
// 	public static void main(String[] args) {
// 		double r,ar,cr;
// 		Scanner sc=new Scanner(System.in);
// //		Console con=System.Console();
// //		InputStreamReader isr=new InputStreamReader(System.in);
// // 		BufferedReader br=new BufferedReader(isr);
// //		DataInputStream dis=new DataInputStream(System.in);
// 		System.out.print("Enter The Radius: ");
// 		r=sc.nextDouble();
// //		r=Double.parseDouble(con.readLine());
// // 		r=Double.parseDouble(br.readLine());
// //		r=Double.parseDouble(dis.readLine());
// 		ar=3.14*r*r;
// 		cr=2*3.14*r;
// 		System.out.println("Area of Circle="+ar);
// 		System.out.println("Area of Circumfrence="+cr);
// 	}
// }

//______________________________________________Find Simple Interest_______________________________
// import java.util.Scanner;
// class Test{
// 	public static void main(String[] args) {
		// float p,r,t,si;
		// Scanner sc=new Scanner(System.in);
		// System.out.print("Enter The Principle Amount: ");
		// p=sc.nextFloat();
		// System.out.print("Enter The Rate: ");
		// r=sc.nextFloat();
		// System.out.print("Enter The Time: ");
		// t=sc.nextFloat();
		// si=(p*r*t)/100;
		// System.out.println("Simple Interest="+si);
// 	}
// }

//______________________________________________Reverse Number_______________________________
// import java.util.Scanner;
// class Test{
// 	public static void main(String[] args) {
// 		int n,a,r=0;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter The Number: ");
// 		n=sc.nextInt();
// 		while(n!=0){
// 			a=n%10;
// 			r=r*10+a;
// 			n=n/10;
// 		}
// 		System.out.print("Reverse No="+r);
// 	}
// }

//______________________________________________Check Prime Number_______________________________
// import java.util.Scanner;
// class Test{
// 	public static void main(String[] args) {
// 		int n,c=0;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter The Number: ");
// 		n=sc.nextInt();
// 		for(int i=1;i<=n;i++){
// 			if(n%i==0)
// 			c++;
// 		}
// 		if(c==2)
// 			System.out.print("Prime No.");
// 		else
// 			System.out.print("Not a Prime No.");
// 	}
// }

//______________________________________________Negation of a Number_______________________________
// class Test{
// 	public static void main(String[] args) {
// 		int a=5;
// 		System.out.println(~(a));
// 	}
// }

//______________________________________________Check Greater Number_______________________________
// import java.util.Scanner;
// class Test{
// 	public static void main(String[] args) {
// 		int a,b;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter First Number: ");
// 		a=sc.nextInt();
// 		System.out.print("Enter Second Number: ");
// 		b=sc.nextInt();
// 		if(a>b)
// 			System.out.println(a+" is Big");
// 		else
// 		System.out.println(b+" is Big");
// 	}
// }

//______________________________________________if else ladder Condition_______________________________
// import java.util.Scanner;
// class Test{
// 	public static void main(String[] args) {
// 		int a;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter The Number: ");
// 		a=sc.nextInt();
// 		if(a>=80)
// 			System.out.println("Grade A+");
// 		else if(a<80 && a>=60)
// 			System.out.println("Grade A");
// 		else if(a<60 && a>=40)
// 			System.out.println("Grade B");
// 		else
// 			System.out.println("Grade C");
// 	}
// }

//______________________________________________Print HelloWorld_______________________________
// class Test{
// 	public static void main(String[] args) {
// 		System.out.println("Hello Java");
// 	}
// }

//______________________________________________Arithematic Operation_______________________________
// import java.util.Scanner;
// class Test{
// 	public static void main(String[] args) {
// 		int x,y,a,s,m,d,r;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter First Number: ");
// 		x=sc.nextInt();
// 		System.out.print("Enter Second Number: ");
// 		y=sc.nextInt();
// 		a=x+y;
// 		s=x-y;
// 		m=x*y;
// 		d=x/y;
// 		r=x%y;
// 		System.out.println("Add="+a);
// 		System.out.println("Sub="+s);
// 		System.out.println("Multi="+m);
// 		System.out.println("Div="+d);
// 		System.out.println("Mod="+r);
// 	}
// }

//______________________________________________Increment Operator_______________________________
// import java.util.Scanner;
// class Test{
// 	public static void main(String[] args) {
// 		int a;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter The Number: ");
// 		a=sc.nextInt();
// 		// ++a;
// 		// System.out.println("A="+a);
// 		// a++;
// 		// System.out.println("A="+a);
// 		System.out.println(a++ + ++a);
// 	}
// }
//___________________________________________Find Factorial of a Number using function_______________________
// import java.util.Scanner;
// class Test{
// 	// static int n;
// 	public static int fact(int n)
// 	{
// 		int f=1;
// 		for(int i=1;i<=n;i++)
// 			f=f*i;
// 		return f;
// 	}
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter The Number: ");
// 		int n=sc.nextInt();
// 		int f=fact(n);
// 		System.out.print("Factorial="+f);
// 	}
// }

//______________________________________________Sum of all Even & Odd No. given Range_______________________
// import java.util.Scanner;
// class Test{
// 	public static void main(String[] args) {
// 		int n,i,a=0,s=0;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter The Number up to Add: ");
// 		n=sc.nextInt();
// 		for(i=1;i<n;i++){
// 			if(i%2==0){
// 				a=a+i;
// 			}
// 		}
// 		System.out.print("Sum of Even No="+a);
// 		for(i=1;i<n;i++){
// 			if(i%2!=0){
// 				s=s+i;
// 			}
// 		}
// 		System.out.print("\nSum of Odd No="+s);
// 	}
// }

//______________________________________________Find Factorial of a Number_______________________
// import java.util.Scanner;
// class Test{
// 		public static int fact(int n){
// 			int f=1;
// 			for(int i=1;i<=n;i++){
// 			f=f*i;
// 		}
// 		return f;
// 		}
// 	public static void main(String[] args) {
// 		int n,f;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter a Number: ");
// 		n=sc.nextInt();
// 		f=fact(n);
// 		System.out.print("Factorial="+f);
// 	}
// }

//________________________________________Find Factorial of a Number Using Recursion_______________________
// import java.util.Scanner;
// class Test{
// 	public static int fact(int n){
// 		if(n==0)
// 			return 1;
// 		else
// 			return(n*fact(n-1));
// 	}
// 	public static void main(String[] args) {
// 		int n,f;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter a Number: ");
// 		n=sc.nextInt();
// 		f=fact(n);
// 		System.out.print("Factorial="+f);
// 	}
// }

//______________________________________________Find all Prime No. given Range___________________________
// import java.util.Scanner;
// class Test{
// 	public static void main(String[] args) {
// 		int n1,n2,n,i,c,cnt=0;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter The First Range: ");
// 		n1=sc.nextInt();
// 		System.out.print("Enter The Second Range: ");
// 		n2=sc.nextInt();
// 		for(n=n1;n<=n2;n++)
// 		{
// 			c=0;
// 			for(i=1;i<=n;i++)
// 			{
// 				if(n%i==0)
// 					c++;
// 			}
// 			if(c==2)
// 			{
// 				cnt++;
// 				System.out.printf("%d\t",n);
// 			}
// 		}
// 		System.out.print("\nTotal Prime No.s="+cnt);
// 	}
// }

// class Test
// {
//     public static void main(String[] args) {
//         System.out.println("Hello World");
//     }
// }

//______________________________________________Default Value of DataTypes_______________________________
// class Test{
// 	static int a;
// 	static float b;
// 	static double c;
// 	static boolean d;
// 	static String e;
// 	public static void main(String[] args) {
// 		System.out.print("Default Value of Integer DataTypes: "+a);
// 		System.out.print("\nDefault Value of Float DataTypes: "+b);
// 		System.out.print("\nDefault Value of Double DataTypes: "+c);
// 		System.out.print("\nDefault Value of Boolean DataTypes: "+d);
// 		System.out.print("\nDefault Value of String DataTypes: "+e);
// 	}
// }

//____________________________________________String Print on Command Prompt_______________________________
// class Test{
// 	public static void main(String[] args) {
// 		for(int i=0;i<args.length;i++){
// 			System.out.print(args[i]+" ");
// 		}
// 	}
// }

//____________________________________________Length of String from cmd prompt____________________________
// class Test{
// 	public static void main(String[] args) {
// 		for(int i=0;i<args.length;i++){
// 			System.out.println("Length of Given String: "+args[i].length()); 
// 		int// 	}
// }
//______________________________________________Bubble Sort______________________________________________
// import java.util.Scanner;
// class Test
// {
// 	public static void main(String[] args) 
// 	{
// 		int a[]=new int[20];
// 		int n,i,round,temp;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter The Number of Element: ");
// 		n=sc.nextInt();
// 		for(i=0;i<n;i++){
// 			a[i]=sc.nextInt();
// 		}
// 		for(round=1;round<=n-1;round++){
// 			for(i=0;i<=n-1-round;i++){
// 				if(a[i]>a[i+1]){
// 					temp=a[i];
// 					a[i]=a[i+1];
// 					a[i+1]=temp;
// 				}
// 			}
// 		}
// 		System.out.println("Sorting Numbers");
// 		for(i=0;i<n;i++){
// 			System.out.print(+a[i]+" ");
// 		}
// 	}
// }

//______________________________________________Selection Sort___________________________________________
// import java.util.Scanner;
// class Test
// {
// 	static int j,LOC,MIN;
// 	public static int min(int a[],int k,int n){
// 		MIN=a[k];
// 		LOC=k;
// 		for(j=k+1;j<=n-1;j++){
// 			if(MIN>a[j]){
// 				MIN=a[j];
// 				LOC=j;
// 			}
// 		}
// 		return(LOC);
// 	}
// 	public static void main(String[] args) 
// 	{
// 		int a[]=new int[20];
// 		int n,i,temp,k;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter The Number of Element: ");
// 		n=sc.nextInt();
// 		for(i=0;i<n;i++){
// 			a[i]=sc.nextInt();
// 		}
// 		for(k=0;k<=n-2;k++){
// 			LOC=min(a,k,n);
// 			temp=a[k];
// 			a[k]=a[LOC];
// 			a[LOC]=temp;
// 		}
// 		System.out.println("Sorting Numbers");
// 		for(i=0;i<n;i++){
// 			System.out.print(+a[i]+" ");
// 		}
// 	}
// }

//______________________________________________Insertion Sort______________________________________
// import java.util.Scanner;
// class Test{
// 	static int i,j,temp;
// 	public static void ins_sort(int a[],int n){
// 		for(i=1;i<n;i++){
// 			temp=a[i];
// 			for(j=i-1;j>=0 && temp<a[j];j--)
// 				a[j+1]=a[j];
// 			a[j+1]=temp;
// 			}
// 		}
// 	public static void main(String[] args){
// 		int a[]=new int[20];
// 		int n,i;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter The Number of Element: ");
// 		n=sc.nextInt();
// 		for(i=0;i<n;i++){
// 			a[i]=sc.nextInt();
// 		}
// 		ins_sort(a,n);
// 		System.out.println("Sorting Numbers");
// 		for(i=0;i<n;i++){
// 			System.out.print(+a[i]+" ");
// 		}
// 	}
// }

//_____________________________________Find MAX Element in Array on Command Prompt________________________
// import java.util.*;
// class Test{
// 	public static void main(String[] args) {
// 		int MAX,temp;
// 		MAX=Integer.parseInt(args[0]);
// 		for(int i=0;i<args.length;i++){
// 			temp=Integer.parseInt(args[i]);
// 			if(MAX<temp)
// 				MAX=temp;
// 		}
// 		System.out.println("Maximum Value="+MAX);
// 	}
// }

//_____________________________________Check Even/Odd on Command Prompt________________________
// import java.util.*;
// class Test{
// 	public static void main(String[] args) {
// 		int n;
// 		n=Integer.parseInt(args[0]);
// 		if(n%2==0)
// 			System.out.println("Even No.");
// 		else
// 			System.out.println("Odd No.");
// 	}
// }
//______________________________________________Arithmetic Operation______________________________________
// import java.util.Scanner;
// class Test{
// 	public static void main(String[] args) {
// 		int a,b;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter First Number: ");
//         a=sc.nextInt();
//         System.out.print("Enter Second Number: ");
//         b=sc.nextInt();
//         System.out.println("Addition="+(a+b));
//         System.out.println("Subtraction="+(a-b));
//         System.out.println("Multiplication="+(a*b));
//         System.out.println("Division="+(a/b));
//         System.out.println("Modulus="+(a%b));
// 	}
// }

//______________________________________________Sum of Array Element______________________________________
// import java.util.Scanner;
// class Test{
// 	public static void main(String[] args) {
// 		int a[]=new int[15];
// 		int s=0;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter The Number of Element: ");
// 		int n=sc.nextInt();
// 		for(int i=0;i<n;i++){
// 			a[i]=sc.nextInt();
// 			s=s+a[i];
// 		}
// 		System.out.print("Sum of Array Element: "+s);
// 	}
// }

//______________________________________________Bubble Sort______________________________________
// import java.util.Scanner;
// class Test{
// 	public static void main(String[] args) {
// 		int a[]=new int[15];
// 		int temp,i,j;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter The Number of Element: ");
// 		int n=sc.nextInt();
// 		for(i=0;i<n;i++){
// 			// System.out.print((i+1)+" No:");
// 			a[i]=sc.nextInt();
// 		}
// 		for(i=1;i<=n-1;i++){
// 			for(j=0;j<=n-1-i;j++){
// 				if(a[j]>a[j+1]){
// 					temp=a[j];
// 					a[j]=a[j+1];
// 					a[j+1]=temp;
// 				}
// 			}
// 		}
// 		System.out.println("Sorted Element:");
// 		for(i=0;i<n;i++){
// 			System.out.print(a[i]+" ");
// 		}
// 	}
// }

//______________________________________________Selection Sort______________________________________
// import java.util.Scanner;
// class Test{
// 	public static void main(String[] args) {
// 		int a[]=new int[15];
// 		int temp,i,j;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter The Number of Element: ");
// 		int n=sc.nextInt();
// 		for(i=0;i<n;i++){
// 			a[i]=sc.nextInt();
// 		}
// 		for(i=0;i<n;i++){
// 			for(j=i;j<n-1;j++){
// 				if(a[i]>a[j+1]){
// 					temp=a[i];
// 					a[i]=a[j+1];
// 					a[j+1]=temp;
// 				}
// 			}
// 		}
// 		System.out.println("Sorted Element:");
// 		for(j=0;j<n;j++){
// 			System.out.print(a[j]+" ");
// 		}
// 	}
// }

//______________________________________________Insert an Element in Array______________________________________
// import java.util.Scanner;
// class Test{
// 	public static void main(String[] args) {
// 		int a[]=new int[10];
// 		int n,i,element,index;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter The Number of Element: ");
// 		n=sc.nextInt();
// 		for(i=0;i<n-1;i++){
// 			System.out.print((i+1)+"No is: ");
// 			a[i]=sc.nextInt();
// 		}
// 		System.out.print("Enter an Element to Insert in the Array: ");
// 		element=sc.nextInt();
// 		System.out.print("Enter Index Number to Insert Element in the Array: ");
// 		index=sc.nextInt();
// 		for(i=n-2;i>=index;i--){
// 			a[i+1]=a[i];
// 		}
// 		a[index]=element;
// 		System.out.print("After Inserted an Element in the Array:\n");
// 		for(i=0;i<n;i++){
// 			System.out.print(a[i]+" ");
// 		}
// 	}
// }

//______________________________________________Delete an Element in Array______________________________________
// import java.util.Scanner;
// class Test{
// 	public static void main(String[] args) {
// 		int a[]=new int[10];
// 		int n,i,j,element,index;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter The Number of Element: ");
// 		n=sc.nextInt();
// 		for(i=0;i<n;i++){
// 			System.out.print((i+1)+"No is: ");
// 			a[i]=sc.nextInt();
// 		}
// 		System.out.print("Which Number Do You Want to Delete: ");
// 		element=sc.nextInt();
// 		index=n-1;
// 		for(i=0;i<=index;i++){
// 			if(a[i]==element){
// 				for(j=i+1;j<=index;j++){
// 					a[j-1]=a[j];
// 				}
// 				i--;
// 				index--;
// 			}
// 		}
// 		System.out.print("After Delete an Element from the Array:\n");
// 		for(i=0;i<=index;i++){
// 			System.out.print(a[i]+" ");
// 		}
// 	}
// }

//______________________________________________Sum Number from cmd______________________________________
// class Test{
// 	public static void main(String[] args) {
// 		int s=0;
// 		for(int i=0;i<args.length;i++){
// 			s=s+Integer.parseInt(args[i]);
// 		}
// 		System.out.print("Sum="+s);
// 	}
// }

//______________________________________________Sum of Array Element______________________________________
// import java.util.Scanner;
// class Test{
// 	static int s=0;
// 	public static void sum(int a[],int n){
// 		for(int i=0;i<n;i++){
// 			s=s+a[i];
// 		}
// 		System.out.print("Sum="+s);
// 	}
// 	public static void main(String[] args) {
// 		int a[]=new int[10];
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter The Number of Element for Sum: ");
// 		int n=sc.nextInt();
// 		for(int i=0;i<n;i++){
// 			a[i]=sc.nextInt();
// 		}
// 		sum(a,n);
// 	}
// }

//______________________________________________Search Element in Array______________________________________
// import java.util.Scanner;
// class Test{
// 	public static void main(String[] args) {
// 		int a[]=new int[10];
// 		int found=0;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter The Number of Element: ");
// 		int n=sc.nextInt();
// 		for(int i=0;i<n;i++){
// 			a[i]=sc.nextInt();
// 		}
// 		System.out.print("Which Number Do You Want to Search: ");
// 		int ele=sc.nextInt();
// 		for(int i=0;i<n;i++){
// 			if(a[i]==ele){
// 				found++;
// 				break;
// 			}
// 		}
// 		if(found==1)
// 			System.out.print(ele+" is Available in given Array");
// 		else
// 			System.out.print(ele+" is not Available in given Array");
// 	}
// }

// WAP in java to implement static variable,method and class.
// class Sum{
// 	static int a=10,b=5;	
// 	static class Abc{
// 		public static void add(){
// 			int c;
// 			c=a+b;
// 			System.out.print("Sum="+c);
// 		}
// 	}	
// }
// class Test{
// 	public static void main(String[] args) {
// 		Sum.Abc.add();
// 	}
// }

//__________________________________________Sum of two number using function___________________________________
// import java.util.Scanner;
// class Test{
// 		static int sum(int a,int b){
// 		int c;
// 		c=a+b;
// 		return c;
// 	}
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter Two Number: ");
// 		int a=sc.nextInt();
// 		int b=sc.nextInt();
// 		int s=sum(a,b);
// 		System.out.print("Sum="+s);
// 	}
// }

//__________________________________________Sparse Matrix___________________________________
// import java.util.Scanner;
// class Test{
// 	public static void main(String[] args) {
// 		int a[][]=new int[10][10];
// 		int i,j,cnt=0;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter The Number of Rows: ");
// 		int r=sc.nextInt();
// 		System.out.print("Enter The Number of Columns: ");
// 		int c=sc.nextInt();
// 		for(i=0;i<r;i++){
// 			for(j=0;j<c;j++){
// 				a[i][j]=sc.nextInt();
// 				if(a[i][j]==0)
// 					cnt++;
// 			}
// 		}
// 		System.out.print("Given Your Matrix\n");
// 		for(i=0;i<r;i++){
// 			for(j=0;j<c;j++){
// 				System.out.print(a[i][j]+"\t");
// 			}
// 			System.out.print("\n");
// 		}
// 		if(cnt>(r*c)/2)
// 			System.out.print("Sparse Matrix");
// 		else
// 			System.out.print("Not a Sparse Matrix");
// 	}
// }

//______________________________________Example of Getter and Setter Method_________________________________
// import java.util.Scanner;
// class Test{
// 		static int c;
// 		public static void get(int a,int b){
// 				c=a+b;
// 		}
// 		public static void set(){
// 			System.out.print("Sum="+c);
// 		}
// 		public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);

// 		System.out.print("Enter First Value: ");
// 		int a=sc.nextInt();
// 		System.out.print("Enter Second Value: ");
// 		int b=sc.nextInt();
// 		get(a,b);
// 		set();
// 	}
// }

//Q10. Develop an Interest interface which contains simpleInterest and compInterest methods 
//     and static final field of Rate 25%. Write a class to implement those methods.
// import java.util.Scanner;
// import java.io.*;
// interface Interest{
// 	void simpleInterest();
// 	void compInterest();
// }
// class Calculate implements Interest{
// 	static final float r=25f;
// 	float p,t;
// 	public void inputData(){
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter Principal amount: ");
// 		p=sc.nextFloat();
// 		System.out.print("Enter Time: ");
// 		t=sc.nextFloat();
// 	}
// 	public void simpleInterest(){
// 		double SI=(p*r*t)/100;
// 		System.out.print("Simple Interest="+SI);
// 	}
// 	public void compInterest(){
// 		double CI = p *(Math.pow((1 + r / 100), t));
// 		System.out.println("\nCompound Interest="+CI);
// 	}
// }
// class Test{
// 	public static void main(String[] args) {
// 		Calculate c=new Calculate();
// 		c.inputData();
// 		c.simpleInterest();
// 		c.compInterest();
// 	}
// }

//______________________________________Calculate Number Of Power_________________________________
// import java.io.*;
// import java.util.Scanner;
// class Test{
//         static int f=1;
//     public static double fact(int n,int p){
//     	if(n==0)
//     		return 0;
//     	else if(p==0)
//     		return 1;
//     	else
//     		return(n*(Math.pow(n,p-1)));    
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n=sc.nextInt();
//         System.out.print("Enter a power: ");
//         int p=sc.nextInt();
//         double g=fact(n,p);
//         System.out.println("Factorial="+g);
//     }
// }

/*17. Write a program to prompt a question, what is your name? If answer is correct in first 
    attempt print Welcome Name, otherwise given another chance, if answer is correct 
    in second attempt print OK otherwise sorry.*/
import java.util.*;
class Test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s="vivek";
        System.out.println("What is Your Name: ");
        String a=sc.nextLine();
        if(s.equals(a))
            System.out.println("Welcome Name");
        else{
           System.out.println("What is Your Name: ");
            String b=sc.nextLine();
            if(s.equals(b))
                System.out.println("ok"); 
            else
                System.out.println("sorry");
        }
    }
}





