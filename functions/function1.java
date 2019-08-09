//using function check whether a number is either a buzz no. or composite no.
import java.util.Scanner;
public class Main {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
	System.out.println("enter a Number: ");
	int n=sc.nextInt();
	System.out.println("enter a choice: 1.buzz 2.composite ");
	int ch=sc.nextInt();
	Main ob=new Main();
	switch(ch)
	
	{
	case 1:ob.buzz(n);
	break;
	case 2:int c=ob.composite(n);
	if(c>2)
		System.out.println("composite number");
	else
		System.out.println("not a composite number");
	break;
	default:System.out.println("wrong choice");
	break;
	
	}
	}
	public static void buzz(int num)
	{
		if((num%7==0)&&(num%10==7))
			System.out.println("buzz number");
		else
			System.out.println("not a buzz number");
		
	}
	public static int composite(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			count++;
		}
		return(count);
	}
	
}

