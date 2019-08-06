

import java.util.Scanner;

public class pattern15 {
	
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	 int t;
	 t=0;
	    	for(int i=1;i<=4;i++)
	    	{
	    	
	    	for(int j=i;j>=1;j--)
	    	{
	    			System.out.print(j+" ");	
	    		
	    	}
	    	
			System.out.println();
	    
	    	}
	    	
	    	t=1;
	    	for(int i=3;i>=1;i--)
	    	{
	    		for(int j=i;j>=1;j--)
	    		{
	    			System.out.print(j+" ");	
	    			
	    		}
	    		
	    		System.out.println();
	    	}
	    	
	    	

}
}
// o/p:
// 1 
// 2 1 
// 3 2 1 
// 4 3 2 1 
// 3 2 1 
// 2 1 
// 1 
