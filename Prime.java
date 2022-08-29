//Java Program to Check Whether a Number is Prime or Not

import java.util.*;
public class Prime
{
   public static void main(String args[])
   {
       int no,i,flag=0;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter The Number :");
	   no=sc.nextInt();
	   if(no==1)
	   {
		    System.out.println(no+" Is Not A Prime Nither A Composite Number !!");
	   }
        else
        {			
	   for(i=2;i<no;i++)
	   {
	       if(no%i==0)
		   {
		      flag=1;
			  break;
		   }
	   }
	   
	   if(flag==0)
	   {
	      System.out.println(no+" Is A Prime Number !!");
	   }
	   else
	   {
	      System.out.println(no+" Is A  Composite Number !!");
	   }
		}
   }
}