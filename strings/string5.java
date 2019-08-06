//accept a word and display the same in alphabetic order of letters
import java.io.*;
public class string5 {
	public static void main(String args[])throws IOException
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in =new BufferedReader(read);
		String str=" ";
		System.out.println("enter a word");
		str=in.readLine();
		String str1=str.toLowerCase();
		int i;
int l=str1.length();
for(i='a';i<='z';i++)
{
	for(int j=0;j<l;j++)
	{
		if((char)(i)==str1.charAt(j))
			System.out.print(i);
	}
}

	}

}

// o/p:
// enter a word
// SFDad
// addfs

----------------or---------------------


import java.io.*;
public class string5 {
	public static void main(String args[])throws IOException
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in =new BufferedReader(read);
		String str=" ";
		System.out.println("enter a word");
		str=in.readLine();
		
		char i;
int l=str.length();
for(i=65;i<=90;i++)
{
	for(int j=0;j<l;j++)
	{
		if((char)(i)==str.charAt(j)||(char)(i+32)==str.charAt(j))
			System.out.print(str.charAt(j));
	}
}

	}

}

// o/p:
// enter a word
// gdgfFSSYR
// dfFggRSSY