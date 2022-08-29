//Write a program in JAVA to find the Area and Perimeter of a Rectangle. 

import java.util.*;

class Rectangle 
{
     int l,b;
	 float area,perimeter;
	 Scanner sc = new Scanner(System.in);
    void Area()
	{
	  System.out.println("Enter Length :");
	  l=sc.nextInt();
	  System.out.println("Enter Breadth :");
	  b=sc.nextInt();
	  area=(l*b);
	  System.out.println("Area Of Rectangle Is :"+area);
	  
	}
	void Perimeter()
	{
	   System.out.println("Enter Length :");
	  l=sc.nextInt();
	  System.out.println("Enter Breadth :");
	  b=sc.nextInt();
	  perimeter = 2*(l*b);
	  System.out.println("Perimeter Of Rectangle :"+perimeter);
	}
    public static void main(String args[])
	{
	  Rectangle r = new Rectangle();
	  r.Area();
	  r.Perimeter();
	}
}