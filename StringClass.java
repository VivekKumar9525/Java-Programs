class StringClass{
	public static void main(String[] args) {
		String s1="Computer";
		String s2="Computer";
		String s3=new String("Computer");
		System.out.println("Result: "+(s1==s2));
		System.out.println("Result: "+s1.equals(s2));
		System.out.println("Result: "+(s1==s3));
		System.out.println("Result: "+s1.equals(s3));
	}
}

//______________________________________________Example of String Concatenation_______________________________
// class StringClass{
// 	public static void main(String[] args) {
// 		String s1="Hello ";
// 		String s2="Brother";
// 		String s3=s1+s2;
// 		System.out.println("Strings: "+s3);
// 	}
// }

// class StringClass{
// 	public static void main(String[] args) {
// 		String s1="Morning";
// 		String s2="Hello Brother Good "+s1;
// 		String s3="Hello Brother Good Morning";
// 		System.out.println("Strings: "+s2.equals(s3));
// 	}
// }