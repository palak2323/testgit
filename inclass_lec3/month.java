/*2.Write a Java program that takes a number from the user between 1 and 12 and displays the name of the corresponding month until the user wants to exit the program. (15 minutes)
Definition of Done:
a)The program asks the user to enter a number between 1 and 12.
b)The program should display an error message if the number entered is not between 1 and 12.
c)The corresponding month should be display for the number entered.
d)The program should not exit unless the user wants to exit the program.*/


import java.util.*;
class month
{
	public static void main (String args[])
	{  
	   do
	   {

	     System.out.print("Enter your choice");
	     Scanner sc = new Scanner (System.in);
	     int a=sc.nextInt();
	     switch(a)
	       {
	           case 1: System.out.print("JANUARY");
	             break;
	           case 2: System.out.print("FEBURARY");
	             break;
	           case 3: System.out.print("MARCH");
	             break;
	           case 4: System.out.print("APRIL");
	             break;
	           case 5: System.out.print("MAY");
	             break;
	           case 6: System.out.print("JUNE");
	             break;
	           case 7: System.out.print("JULY");
	             break;
	           case 8: System.out.print("AUGUST");
	             break;
        	   case 9: System.out.print("SEPTEMBER");
	             break;
	           case 10: System.out.print("OCTOBER");
	             break;
	           case 11: System.out.print("NOVEMBER");
	             break;
	           case 12: System.out.print("DECEMBER");
	             break;
	             default: System.out.print("WRONG VALUE");
            }
         System.out.print("Do you want to continue?");
   
   	   }
   	     char ch;
	     ch = sc.next().charAt(0);   
         while(ch ='y'|| ch ='Y');
	}
}
