//Difference between sum of odd and even position digits of a number :
import java.util.Scanner;
public class evenoddposition {
	 public static void main(String args[])
	    {
	    	
	 Scanner sc = new Scanner( System.in );
     System.out.print("Enter a number : ");
     int n =sc.nextInt();
     int a[]=new int[20];
     int d,c=0,k=0;
     while(n!=0)
     {
    	 d=n%10;
    	 a[k]=d;
    	 k++;
    	 n=n/10;
     }
     int sodd=0,seven=0,diff=0;
     for(int i=0;i<k;i++)
     {
    	 if(i%2!=0)
    		 sodd=sodd+a[i];
    	 else
    		 seven=seven+a[i];
     }
  if(sodd>seven)
    	 diff=sodd-seven;
  else
	  diff=seven-sodd;
     
     System.out.print("Difference between sum of odd and even position digits of a number : "+diff);
}
}

o/p:
Enter a number : 946452
Difference between sum of odd and even position digits of a number : 10