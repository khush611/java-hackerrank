//first index of 'i'or 'I' in a sentence
import java.io.*;
public class string12 {
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
			if(ch=='i'||ch=='I')
			{
				c=str.indexOf(ch);
			break;
			}
		}
		
		System.out.println(c);
	}

}
// o/p:

// enter a sentence
// hiI
// no.of characters: 3
// 1
