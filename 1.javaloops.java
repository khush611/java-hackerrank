import java.util.*;
import java.io.*;


class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a,b,n;
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            int j;
        for(j=0;j<n;j++)
        {
a=a+(int)(Math.pow(2,j)*b);
System.out.print(a+" ");
        }
System.out.println();
        }
        in.close();
        
    }
}

