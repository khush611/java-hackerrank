//palindrome word check
package strings;
import java.io.*;
public class strings3 {
	public static void main(String args[])throws IOException
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in =new BufferedReader(read);
		String str;
		System.out.println("enter a word");
		str=in.readLine();
		
int l=str.length();
int i,c=0;
String str1="";
----------------------------
//for(i=l-1;i>=0;i--)
//{
//str1=str1+str.charAt(i);
//}

-------------or-------------

for(i=0;i<l;i++)
{
	str1=str.charAt(i)+str1;
}
----------------------------
if(str.equalsIgnoreCase(str1))
System.out.println("palindrome word");
else
	System.out.println("not a palindrome word");
	}

}

// o/p:
// enter a word
// madAM
// palindrome word

