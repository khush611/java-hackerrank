//calculating area and perimeter by using functions
import java.util.Scanner;
public class rectangle {
	public static int l,b,area=0,perimeter=0;
public static void main(String args[])
{
	rectangle ob=new rectangle();
	ob.inputdata();
	ob.calculation();
	ob.display();
}
public static void inputdata()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length: ");
	 l=sc.nextInt();
	System.out.println("enter breadth: ");
	 b=sc.nextInt();
	
}
public static void calculation()
{
	 area=l*b;
	 perimeter=2*(l+b);
}
public static void display()
{
	System.out.println("area : "+area);
	System.out.println("perimeter: "+perimeter);
}
}

// o/p:
// enter length: 
// 12
// enter breadth: 
// 3
// area : 36
// perimeter: 30
