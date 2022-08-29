//Java Program to Check Leap Year

import java.util.*;
public class LeapYear
{
   public static void main(String args[])
   {
        Scanner sc = new Scanner(System.in);
		int y;
		System.out.println("Enter Any Year :");
		y=sc.nextInt();
		if(y%4==0)
		{
		   System.out.println(y+"  Is a Leap Year ");
		}
		else
		{
		   System.out.println(y+"Is Not a Leap Year");
		}
   }
}