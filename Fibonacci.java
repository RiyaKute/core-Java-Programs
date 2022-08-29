//Java Program to Display Fibonacci Series


import java.util.*;
public class Fibonacci
{
   public static void main(String args[])
   {
       int i,n,fno,sno,tno;
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter The Length Of The Series : ");
	   n=sc.nextInt();
	   fno=0;
	   sno=1;
	   System.out.print(fno+"\t");
	    System.out.print(sno+"\t");
		
		for(i=2;i<n;i++)
		{
		   tno=fno+sno;
		   System.out.print(tno+"\t");
		   fno=sno;
		   sno=tno;
		}
	   
	   
   }
}