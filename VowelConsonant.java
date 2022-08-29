//Java Program to Check Whether a character is Vowel or Consonant.

import java.util.*;
public class VowelConsonant
{
    public static void main(String args[])
	{
	     String c;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Any Character :");
	   c = sc.nextLine();
	 if(c=="A"||c=="a"||c=="e"||c=="E"||c=="i"||c=="I"||c=="o"||c=="O"||c=="u"||c=="U")
	 {
		 System.out.println(c+"  "+"Is a Vowel");
	 }		 
	 else
	 {
		 System.out.println(c+"  "+"Is a Consonant");
	 }
	}
}