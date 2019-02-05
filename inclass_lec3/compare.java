/*3.Write a Java program that reads in two floating-point numbers and tests   whether they are the same up to three decimal places. (15 minutes)

Definition of Done:
a)The program should read two float numbers.
b)The program should ask the user to re-enter of the values entered are not numbers.
c)The program should display an appropriate message after comparison of the two numbers.*/


import java.util.*;
class compare 
{

    
  public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        double x = in.nextDouble();
        System.out.print("Input floating-point another number: ");
        double y = in.nextDouble();

        double a = x*1000;
        double b = y*1000;


        if (a==b)
        {
            System.out.println("They are the same up to three decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}