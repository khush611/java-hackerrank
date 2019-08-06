

import java.util.Scanner;

public class pattern14 {
	
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	 int t;
	 t=0;
	    	for(int i=1;i<=5;i++)
	    	{
	    	
	    	for(int j=1;j<=i;j++)
	    	{
	    			System.out.print(j+" ");	
	    		
	    	}
	    	
			System.out.println();
	    
	    	}
	    	
	    	t=4;
	    	for(int i=1;i<=4;i++)
	    	{
	    		for(int j=1;j<=t;j++)
	    		{
	    			System.out.print(j+" ");	
	    			
	    		}
	    		t--;
	    		System.out.println();
	    	}

}
}
// o/p:
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 
