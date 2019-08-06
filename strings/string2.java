// no. of vowel in a string

import java.io.*;
public class strings2 {
	public static void main(String args[])throws IOException
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in =new BufferedReader(read);
		String str;
		System.out.println("enter a string");
		str=in.readLine();
		str=str.toLowerCase();
int l=str.length();
int i,c=0;
for(i=0;i<l;i++)
{
	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
		c++;
}
System.out.println("countof vowels: "+c);			
	}

}

// o/p:
// enter a string
// hey! how are you ? everything is okay!
// countof vowels: 12
