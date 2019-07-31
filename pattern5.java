

import java.util.Scanner;

public class pattern5 {
	
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    for(int i=5;i>=1;i--)
	    {
	    	for(int j=i;j<=5;j++)
	    	{
	    			System.out.print(j);	
	    	}
			System.out.println();
	    }
	

}
}
// o/p:
// 5
// 45
// 345
// 2345
// 12345