//convert a to an in a string

import java.io.*;
public class string4 {
	public static void main(String args[])throws IOException
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in =new BufferedReader(read);
		String str=" ",str2=" ";
		System.out.println("enter a word");
		str=in.readLine();
int i;
String str1=" "+str+" ";
int l=str1.length();
for(i=0;i<l;i++)
{
	if((str1.charAt(i)==' ')&&(str1.charAt(i+1)=='a')&&(str1.charAt(i+2)==' '))
	{
	str2=str2+" an ";
	i=i+2;
	}
	else
		str2=str2+str1.charAt(i);
}

System.out.println(str2.trim());

	}

}

// o/p:
// enter a word
// hey a an ag sfdan a
// hey an an ag sfdan an
