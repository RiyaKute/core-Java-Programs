//Java Program to Check Whether a Number is Palindrome or Not

import java.util.*;
public class Pallindrome
{
    public static void main(String args[])
	{
	     Scanner sc = new Scanner(System.in);
		int no,rem,rev=0,temp;
		System.out.print("Enter The Number :");
		no=sc.nextInt();
		temp=no;
		while(no!=0)
		{
		    rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		if(temp==rev)
		{
		   System.out.println(temp+" Number Is A Pallindrome Number !!");
		}
		else
		{
		   System.out.println(temp+" Number Is A Not A Pallindrome Number !! ");
		}
	}
	
}