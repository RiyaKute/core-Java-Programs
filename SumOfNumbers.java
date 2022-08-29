//Java Program to Calculate Sum of Natural Numbers
import java.util.*;
public class SumOfNumbers
{
    public static void main(String args[])
	{
	   int a[]=new int[10];
	   int n,i,sum=0;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("How Many Numbers Do You Want to enter :");
	   n=sc.nextInt();
	   System.out.println("Enter  "+n+" Numbers ");
       for(i=1;i<=n;i++)
       {
	      a[i]=sc.nextInt();
		  sum=sum+a[i];
       }	   
	   System.out.println("Sum Of the Numbers :"+sum);
	   
	}
}
 