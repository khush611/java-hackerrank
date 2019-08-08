//2-D Array problem: find the max hourglass sum
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[][]=new int[6][6];
for(int i=0;i<6;i++)
{
    for(int j=0;j<6;j++)
    {
        arr[i][j]=sc.nextInt();
    }
}
int i,j,sum=-1000,topsum=0,middlesum=0,bottomsum=0,sum1=0;
for(i=0;i<4;i++)
{
    for(j=0;j<4;j++)
    {
        topsum=arr[i][j]+arr[i][j+1]+arr[i][j+2];
        middlesum=arr[i+1][j+1];
        bottomsum=arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
        sum1=topsum+middlesum+bottomsum;
        if(sum<sum1)
        sum=sum1;
    }
}
System.out.println(sum);
}
}
