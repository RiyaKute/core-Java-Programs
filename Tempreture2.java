//Write a program in JAVA to convert temperature in Fahrenheit  to Celsius. 
import java.util.*;
class Tempreture2
{
	public static void main(String args[])
    {
        float c,f;
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter The Tempreture In  Fahrenheit :");
		f=sc.nextFloat();
		c=((f-32)*5)/9;
		
		System.out.println("Tempreture in Fahrenheit ="+f);
		System.out.println("Tempreture in Celsius = "+c);
	}	
	
}