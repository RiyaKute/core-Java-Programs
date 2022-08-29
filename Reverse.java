//Java Program to Reverse a Number

import java.util.*;
public class Reverse
{
    public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
		int no,rem,rev=0;
		System.out.print("Enter The Number :");
		no=sc.nextInt();
		while(no!=0)
		{
		    rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println("Reversed Number Is :"+rev);
	}
}