import java.util.Scanner;
class reverseString
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String st;
	int v=0,c=0;
	System.out.println("Enter String:- ");
	st=sc.nextLine();
	char ch[] = new char[100];
	int i,l;
	l=st.length();
	for(i=l-1;i>=0;i--)
	{
		ch[i]=st.charAt(i);
		System.out.print(ch[i]+" ");
	}

	 for(i=0;i<l;i++)
	 {
	 	if(ch[i]=='A'||ch[i]=='E'||ch[i]=='E'||ch[i]=='O'||ch[i]=='U')
	 		v++;
	 	else
	 		c++;
	 }
	System.out.println("Number of vowel:- "+v);
	System.out.println("Number of Consonent:- "+c);
	}
 }
