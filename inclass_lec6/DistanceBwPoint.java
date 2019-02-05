/* 1.Write a program to calculate the distance between two points (x1, y1) and (x2, y2). All numbers and return values should be of type double. 

Definition of Done:
a)Two java files to be defined. One for class definitions and another for the application
b)Data members to be defined as private
c)Three constructors are defined: non-parameterized, One argument for setting x co-ordinate, two arguments for setting both the co-ordinates.
d)A class point is defined with two float variables for x1 and x2 and the following functionality: 
i.Non-parametrized and parameterized constructors are defined.
ii.Public Get and set methods are defined for all the instance variables.
iii.Public Distance function is defined to calculate the distance between two points using Object as an argument.*/






import java.util.*;
class DistanceBwPoint
{
	public static void main(String arg[])
	
	{
	
             	 int x1,x2,y1,y2;
 
	         double dis;
	
	         Scanner sc=new Scanner(System.in);
 
	         System.out.println("enter x1 point");
	   
                 x1=sc.nextInt();
	    
                 System.out.println("enter y1 point");
	   
                 y1=sc.nextInt();
 
	         System.out.println("enter x2point");
	   
                 x2=sc.nextInt();
 
	         System.out.println("enter y2 point");
	   
                 y2=sc.nextInt();
	  	    
		 dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
 	 	    	 	    
  	         System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
 
	}
 
}