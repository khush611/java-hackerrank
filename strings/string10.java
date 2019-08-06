//no.of 'a' or 'A' in a string
import java.io.*;
public class string11 {
	public static void main(String args[])throws IOException
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in =new BufferedReader(read);
		String str=" ";
		System.out.println("enter a sentence");
		str=in.readLine();
		String str1="";
char ch;
int c=0;
		int l=str.length();
		System.out.println("no.of characters: "+l);
		
		for(int i=0;i<l;i++)
		{
			ch=str.charAt(i);
			if(ch=='a'||ch=='A')
				c++;
		}
		
		System.out.println(c);
	}

}
// o/p:
// enter a sentence
// aff A ghjsaa
// no.of characters: 12
// 4
