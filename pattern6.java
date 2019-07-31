import java.util.Scanner;

public class pattern6 {
	
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    for(int i=1;i<=5;i++)
	    {
	    	for(int j=i;j>=1;j--)
	    	{
	    			System.out.print(j);	
	    	}
			System.out.println();
	    }
	

}
}
// o/p:
// 1
// 21
// 321
// 4321
// 54321
