//Java Program to Find Factorial

import java.util.*;
public class Factorial
{
   public static void main(String args[])
   {
        int f=1,n,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number :");
		n=sc.nextInt();
		if(n==0)
		{
			 System.out.println("Factorial Of "+n+" Is = 0");
		}
		else
		{
		     for(i=n;i>0;i--)
		     {
		        f=f*i;
		     }
		    System.out.println("Factorial Of "+n+" Is ="+f);
   }
}