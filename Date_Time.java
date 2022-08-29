//. Write a JAVA program to display the current date and time

import java.util.*;
import java.text.*;
public class Date_Time
{
     public static void main(String args[])
	 {
	     //using A Date Class Dispalying Current Date And Time 
		 System.out.println("Displaying Current Date  And Time Using Date Class ");
		 Date d = new Date();
		 System.out.println("Current Date Is "+d);
		 System.out.println("-----------------------------------------------------------\n ");
		 
		 //using A SimpleDateFormat Class Dispalying Current Date And Time 
		 System.out.println("Displaying Current Date  And Time Using SimpleDateFormat Class ");
		// SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss Z");
		SimpleDateFormat D = new SimpleDateFormat(
            "dd/MM/yyyy  HH:mm:ss z");
		 System.out.println("Current Date Is "+D);
		 System.out.println("-----------------------------------------------------------\n ");
	 }
}