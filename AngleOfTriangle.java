//. Write a program in JAVA to find the third angle of a triangle. 

import java.util.*;
class AnlgleOfTriangle
{
     public static void main()
	 {
	      int a1,a2,a3;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter First Angle of Trianle :");
		  a1=sc.nextInt();
		  System.out.println("Enter Second Angle Of Triangle :");
		  a2=sc.nextInt();
	      a3= 180-(a1+a2);
		  System.out.println("Third angle Of Right Angled Triangle Is :"+a3);
		  
	 }
}