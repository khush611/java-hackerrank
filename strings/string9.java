//change the case of each character in a sentence

import java.io.*;
public class string10 {
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
			if(Character.isUpperCase(ch))
				str1=str1+Character.toLowerCase(ch);
			else if(Character.isLowerCase(ch))
				str1=str1+Character.toUpperCase(ch);
			else
				str1=str1+ch;
		}
		
		System.out.println(str1);
	}

}

// o/p:
// enter a sentence
// htdsDRR dsgTETF ETRds
// no.of characters: 21
// HTDSdrr DSGtetf etrDS
