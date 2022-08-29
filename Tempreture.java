//Write a program in JAVA to convert temperature in Celsius to Fahrenheit. 
import java.util.*;
class Tempreture
{
	public static void main(String args[])
    {
        float t,f;
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter The Tempreture In Celsius :");
		t=sc.nextFloat();
		f=(t*9/5)+32;
		System.out.println("Tempreture in Celsius = "+t);
		System.out.println("Tempreture in Fahrenheit ="+f);
	}	
	
}