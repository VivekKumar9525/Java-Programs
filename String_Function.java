import java.util.Scanner;
class String_Function
{
	public static void main(String[] args) 
	{
		String str="Hello World";
		String str1="Ram is a";
		String str2="Ram is";
		System.out.println("Length of String= "+str.length());
		System.out.println(str.charAt(4));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.compareTo(str2));
		System.out.println(str2.compareTo(str1));
		System.out.println("Hello".startsWith("pe"));
		System.out.println("Vivek Jaiswal".endsWith("wal"));
		System.out.println(str.indexOf('l',5));
		System.out.println(str.lastIndexOf('o',5));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
	}
}