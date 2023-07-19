//______________________________________________Example of Case Conversion()_______________________________
// class StringMethod{
// 	public static void main(String[] args) {
// 		String s1=new String("Computer");
// 		String s2=s1.toUpperCase();
// 		System.out.println(s2);
// 		s2=s1.toLowerCase();
// 		System.out.println(s2);
// 	}
// }

//______________________________________________Example of IndexOf()_______________________________
// import java.util.Scanner;
// class StringMethod{
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter The String: ");
// 		String s=sc.nextLine();
// 		// System.out.println("The String: "+s);
// 		System.out.print("Which Character do want to Search: ");
// 		char c=sc.next().charAt(0);
// 		// System.out.println("The Character: "+c);
// 		int i=s.indexOf(c);
// 		// int j=s.lastIndexOf(c);
// 		System.out.println(c+" First Occurrence at Index No:"+i);
// 		// System.out.println(c+" Last Occurrence at Index No:"+j);
// 	}
// }

// public class StringMethod 
// { 
// 	public static void main(String[] args) { 
// 		String str = "Programming in java."; 
// 		System.out.println(str.charAt(4)+str.substring(8, 11)); 
// 	}
// }



// import java.util.Scanner;
// class StringMethod{
// 	public static void main(String[] args) {
// 		// String str="java";
		// Scanner sc=new Scanner(System.in);
		// System.out.print("Enter the String: ");
		// String s=sc.nextLine();
// 		// int i=s.codePointAt(0);
// 		// int i=s.codePointBefore(1);
// 		// char x=s.charAt(0);
// 		int i=s.codePointCount(0,4);
// 		// int i=s.length();
// 		System.out.println("Count the number of Unicode is: "+i);
// 	}
// }
// import java.util.Scanner;
// class StringMethod{
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter the String: ");
// 		String s1=sc.nextLine();
// 		System.out.print("Which String do you want to Remove: ");
// 		String s2=sc.nextLine();
// 		String str=s1.replace(s2,"");
// 		System.out.println(str);
// 	}
// }
