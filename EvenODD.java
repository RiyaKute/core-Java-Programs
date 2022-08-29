//Java Program to Check Whether Number is Even or Odd

import java.util.*;
public class EvenODD
{
    public static void main(String args[])
	{
	     int no;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Any Number :");
		 no=sc.nextInt();
		 if(no%2==0)
		 {
		    System.out.println(no+"Is A Even Number ");
		 }
		 else
		 {
		 System.out.println(no+"Is A Odd Number ");
		 }
	}
}