//print a reverse of the substring uptil the number that the user input. print the rest of the string like this
import java.util.Scanner;
public class string16 {
	 public static void main(String args[])
	    {
	    	
	 Scanner sc = new Scanner( System.in );
     System.out.print("Enter a range till you want the number to be reversed : ");
     int n =sc.nextInt();
    int i;
     System.out.print("enter a string:");
    String s=sc.next();
    int l=s.length();
    char ch[]=s.toCharArray();
    for(i=n-1;i>=0;i--)
    	System.out.print(ch[i]+" ");
    	
 for (i=n;i<l;i++) 
	 System.out.print(ch[i]+" ");
    
     
}
}
o/p:
Enter a range till you want the number to be reversed : 4
enter a string:khushboo
s u h k h b o o 