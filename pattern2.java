
import java.util.Scanner;

public class pattern2 {
	
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    for(int i=5;i>=1;i--)
	    {
	    	
	    	for(int j=5;j>=i;j--)
	    	{
	    		System.out.print(j);		
	    
	    	}
			System.out.println();
	    }
	

}
}
// o/p:
// 5
// 54
// 543
// 5432
// 54321
