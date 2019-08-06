//count of word "the' in a string
import java.io.*;
public class string7 {
	public static void main(String args[])throws IOException
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in =new BufferedReader(read);
		String str=" ";
		System.out.println("enter a sentence");
		str=in.readLine();
		int c=0;
		String s[]=str.split(" ");
		int l=s.length;
		System.out.println("no.of words: "+l);
		String check="the";
		String str1=" ";
		for(int i=0;i<l;i++)
		{
			str1=s[i];
			if(str1.compareTo(check)==0)
				c++;
		}
		System.out.println("cound of word 'the' : "+c);
	}

}
// o/p:
// enter a sentence
// the the man the mhn hh the
// no.of words: 7
// cound of word 'the' : 4
