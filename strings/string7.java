//print the string opposite direction
import java.io.*;
public class string8 {
	public static void main(String args[])throws IOException
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in =new BufferedReader(read);
		String str=" ";
		System.out.println("enter a sentence");
		str=in.readLine();
	
		String s[]=str.split(" ");
		int l=s.length;
		System.out.println("no.of words: "+l);
		
		for(int i=l-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}
		
	}

}
// o/p:
// enter a sentence
// the man is good fellow
// no.of words: 5
// fellow good is man the 