//convert first letter of each word into 'X'
import java.io.*;
public class string13 {
	public static void main(String args[])throws IOException
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in =new BufferedReader(read);
		String str=" ";
		System.out.println("enter a sentence");
		str=in.readLine();
		String str1=" "+str;
char ch;
int c=0;
String str2="";
		int l=str1.length();
		System.out.println("no.of characters: "+l);
		
		for(int i=0;i<l;i++)
		{
			ch=str1.charAt(i);
			if(ch==' ')
			{
				ch=str.charAt(i+1);
				ch='X';
				str2=str2+" "+ch;
				i++;
		
			}
			else
				str2=str2+ch;
		}
		
		System.out.println(str2);
	}

}

// o/p:
// enter a sentence
// i AM a good girl.
// no.of characters: 18
//  X XM X Xood Xirl.
