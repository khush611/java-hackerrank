

import java.util.Scanner;

public class pattern4 {
	
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    for(int i=5;i<=9;i++)
	    {
	    	for(int j=5;j<=i;j++)
	    	{
	    			System.out.print(j);	
	    	}
			System.out.println();
	    }
	

}
}
//o/p:
// 5
// 56
// 567
// 5678
// 56789