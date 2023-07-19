import java.util.Scanner;
class StrOperation 
{
	public static void main(String[] args) 
	{
		int alf=0,dig=0,sym=0,uca=0,lca=0,vow=0,con=0;
		int wrd=1;
		String st=" ";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any String: ");
		st=sc.nextLine();
		System.out,print("The Given String is :"+st);
		for(i=0;i<st.length();i++)
		{
			if(st.charAt(i)>='A' && st.charAt(i)<='Z')
			{
				alf++;
				uca++;
				switch(st.charAt(i))
				{
					case'A':
					case'E':
					case'I':
					case'O':
					case'U':
						vow++;
					default:
						con++;
				}
			}
			else if(st.charAt(i)>='a' && st.charAt(i)<='z')
			{
				alf++;
				lca++;
				switch(st.charAt(i))
				{
					case'a':
					case'e':
					case'i':
					case'o':
					case'u':
						vow++;
					default:
						con++;
				}
			}
			else if(st.charAt(i)>='0' && st.charAt(i)<='9')
			{
				dig++;
			}
			else if(st.charAt(i)=='  ')
			{
				if(st.charAt(i+1)!=32 && i<st.length())
					wrd++;
			}
			else
			{
				sym++;
			}
		}
		System.out.println("Alphabate="+alf);
		System.out.println("Digit="+dig);
		System.out.println("Upper Case Latter="+uca);
		System.out.println("Lower Case Latter="+lca);
		System.out.println("Constant="+con);
		System.out.println("Vowel="+vow);
		System.out.println("Word="+wrd);
		System.out.println("String="+st);
		System.out.println("Symbol="+sym);
	}
}