//Java Program to Find Largest Number Among Three Numbers

import java.util.*;
public class LargestNo
{
    public static void main(String args[])
	{
	    int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number :");
		a=sc.nextInt();
		System.out.println("Enter Second Number :");
		b=sc.nextInt();
		System.out.println("Ente Third Number :");
		c=sc.nextInt();
		if(a>b)
		{
		   if(a>c)
		   {
		      System.out.println("Largest Number Is :"+a);
		   }
		   else
		   {
		      System.out.println("Largest Number Is :"+c);
		   }
		}
		else
		{
		    if(b>c)
			{
			   System.out.println("Largest Number :"+b);
			}
			else
			{
			   System.out.println("Largest Number :"+c);
			}
		}
	}
}