//. Write a program in JAVA to calculate the volume of a sphere.
//formula =4/3*PI*r^3 

import java.util.*;

class VolumeOfSphere_4
{
      double r,volume;
	 void Volume()
	 {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius Of The Sphere :");
         r = sc.nextDouble();
        volume = (4/3)*(3.14)*(r*r*r);
        System.out.println("Volume Of The Sphere :"+volume);
		
     }
     public static void main(String args[])
	 {
		VolumeOfSphere_4 v = new VolumeOfSphere_4() ;
        v.Volume();		
	 }		 

}