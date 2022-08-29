//Swapping two numbers with and without using third variable

import java.util.*;

class Swap_3
{
	public static void main(String args[])
	{
		int a,b,c;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Swapping values With Using a third variable ");
	 System.out.println("Enter First Number :");
	 a=sc.nextInt();
	 System.out.println("Enter Second Number :");
	 b=sc.nextInt();
	 System.out.println("Values Before  Swapping ");
	 System.out.println("Value Of A ="+a);
	 System.out.println("Value Of B ="+b);
	 c=a;
	 a=b;
	 b=c;
	 System.out.println("Values After Swapping ");
	 System.out.println("Value Of A ="+a);
	 System.out.println("Value Of B ="+b);
	 
	  System.out.println("Swapping values Without  Using a third variable ");
	 System.out.println("Enter First Number :");
	 a=sc.nextInt();
	 System.out.println("Enter Second Number :");
	 b=sc.nextInt();
	 System.out.println("Values Before  Swapping ");
	 System.out.println("Value Of A ="+a);
	 System.out.println("Value Of B ="+b);
	 a=a+b;
	 b=a-b;
	 a=a-b;
	 System.out.println("Values After Swapping ");
	 System.out.println("Value Of A ="+a);
	 System.out.println("Value Of B ="+b);
	}	
}
