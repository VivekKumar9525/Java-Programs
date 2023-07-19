import java.io.*;
import java.util.*;
public class substitution_cipher {
	static Scanner sc = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		String a = "abcdefghijklmnopqrstuvwxyz";
		String b = "zyxwvutsrqponmlkjihgfedcba";
		System.out.print("Enter any string: ");
		String str = br.readLine();
		char c;
		String encrypted = "";
		for(int i=0;i<str.length();i++)
		{
			c = str.charAt(i);
			int j = a.indexOf(c);
			encrypted = encrypted+b.charAt(j);
		}
		System.out.println("The encrypted data is: " +encrypted);
		String decrypt = "";
		for(int i=0;i<str.length();i++)
		{
			c = encrypted.charAt(i);
			int j = b.indexOf(c);
			decrypt = decrypt+a.charAt(j);
		}
		System.out.println("The decrepted data is: " +decrypt);
		
	}
} 
