
import java.util.Scanner;

public class pattern18 {
	
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	 int t;
	 t=0;
	    	for(int i=1;i<=4;i++)
	    	{
	    	
	    	for(int j=1;j<=i;j++)
	    	{
	    			System.out.print(t+" ");	
	    			t++;
	    	}
	    	
			System.out.println();
	    
	    	}
	    	int s;
	    	s=5;
	    	for(int i=3;i>=1;i--)
	    	{
	    		for(int j=1;j<=i;j++)
	    		{
	    			System.out.print(s+" ");	
	    			s--;
	    		}
	    		System.out.println();
	    	}

}
}
// o/p:
// 0 
// 1 2 
// 3 4 5 
// 6 7 8 9 
// 5 4 3 
// 2 1 
// 0 
