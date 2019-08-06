//no.of special characters in a sentence
import java.io.*;
public class string9 {
	public static void main(String args[])throws IOException
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in =new BufferedReader(read);
		String str=" ";
		System.out.println("enter a sentence");
		str=in.readLine();
char ch;
int c=0;
		int l=str.length();
		System.out.println("no.of characters: "+l);
		
		for(int i=0;i<l;i++)
		{
			ch=str.charAt(i);
			if((ch==',')||(ch==';')||(ch==':')||(ch=='"')||(ch=='\''))
				c++;
		
		}
		
		System.out.println("no.of special characters: "+c);
	}

}
o/p:
enter a sentence
"the ma:am now is; frequently "" wow's"
no.of characters: 39
no.of special characters: 7
