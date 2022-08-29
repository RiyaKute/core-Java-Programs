//Java Program to Make a Simple Calculator to Add, Subtract, Multiply or Divide Using switch...case

import java.util.*;
public class Calculator
{
   public static void main(String args[])
   {
       int i=1,a,b,c,ch;
	   Scanner sc =  new Scanner(System.in);
	   while(i==1)
	   {
	        System.out.println("1.Addition");
			System.out.println("2.Subtraction");
		    System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Remainder");
			System.out.println("6.Exit");
			 System.out.println("Enter Your Chioce :");
			 ch=sc.nextInt();
			 switch(ch)
			 {
			      case 1: System.out.println("Enter First Number :");
				           a=sc.nextInt();
				          System.out.println("Enter Second Number :");
						  b=sc.nextInt();
						  c=a+b;
						   System.out.println("Addition ="+c);
						  break;
						 
				  case 2: System.out.println("Enter First Number :");
				           a=sc.nextInt();
				          System.out.println("Enter Second Number :");
						  b=sc.nextInt();
						  c=a-b;
						  System.out.println("Subtraction ="+c);
						  break;
                   case 3: System.out.println("Enter First Number :");
				           a=sc.nextInt();
				          System.out.println("Enter Second Number :");
						  b=sc.nextInt();
						  c=a*b;
						  System.out.println("Multiplication ="+c);
						  break;
                   case 4: System.out.println("Enter First Number :");
				           a=sc.nextInt();
				          System.out.println("Enter Second Number :");
						  b=sc.nextInt();
						  c=a/b;
						  System.out.println("Division ="+c);
						  break;
                  case 5: System.out.println("Enter First Number :");
				           a=sc.nextInt();
				          System.out.println("Enter Second Number :");
						  b=sc.nextInt();
						  c=a%b;
						  System.out.println("Remainder  ="+c);
						  break;
				case 6: System.out.println("Program Has Exited successFully !!");
           				System.exit(0);		  
                 default : System.out.println("Please Enter Valid Choice !!");						  
			 }
	   }
   }
}