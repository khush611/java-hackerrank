
import java.util.Scanner;

public class pattern15 {
	
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	
	    	for(int rows=1;rows<=5;rows++)
	    	{
	    	
	    	for(int colspace=5-rows;colspace>=1;colspace--)
	    	{
	    			System.out.print(" ");	
	    		
	    	}
	    	for(int colstar=1;colstar<=rows;colstar++)
	    	{
	    			System.out.print("* ");	
	    		
	    	}
	    	
			System.out.println();
	    
	    	}
	    	
	    
	    
	    	

}
}
// o/p:
//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
