//Check whether a number is positive, negative or zero :

import java.util.*;
class Number
{
    public static void main(String args[])
	{
	   Scanner sc = new Scanner(System.in);
	   int no;
	   System.out.println("Enter Number :");
	   no= sc.nextInt();
	   if(no<0)
	   {
	       System.out.println("Number Is The Negative !!");
	   }
	   else if(no>0)
	   {
	       System.out.println("Number Is The Positive !!");
	   }
	   else
	   {
	       System.out.println("Zero Is The Neither Positive Nor Negative !!");
	   }
	   
	}
}