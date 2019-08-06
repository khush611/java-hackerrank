//enter a character to check whether it is a letter or not. if it is a letter change the case or else check whther it is a digit or special character.

import java.io.*;
public class strings1 {
	public static void main(String args[])throws IOException
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in =new BufferedReader(read);
		char ch;
		System.out.println("enter a character");
		ch=(char)(in.read());
		if(Character.isLetter(ch))
		{
			
			System.out.println("character"+ch+" is a letter");
			if(Character.isUpperCase(ch))
				System.out.println(Character.toLowerCase(ch));
			else
				System.out.println(Character.toUpperCase(ch));
		}
		else if(Character.isDigit(ch))
			System.out.println("character"+ch+" is a digit");
		else
			System.out.println("character"+ch+" is a special character");
				
	}

}
// o/p:
// enter a character
// )
// character) is a special character
