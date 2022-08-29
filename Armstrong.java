//Java Program to Check Armstrong Number

import java.util.*;
public class Armstrong
{
   public static void main(String args[])
   {
       int no,rem,sum=0,temp;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Any Number :");
	   no=sc.nextInt();
	   temp=no;
	   while(no!=0)
	   {
	       rem=no%10;
		   sum=sum+(rem*rem*rem);
		   no=no/10;
	   }
	   if(temp==sum)
	   {
	      System.out.println(temp+" Is A Armstrong Number !!");
	   }
	   else
	   {
	      System.out.println(temp+" Is Not A Armstrong Number !!" );
	   }
	    
   }
}