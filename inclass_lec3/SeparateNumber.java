/*4.Write an application that inputs one number consisting of five digits from    the user, separates the number into its individual digits in the same order and prints the digits separated from one another by three spaces each. (15 minutes) (20 minutes)

Definition of Done:
a)The program should ask the user to input the integer.
b)If the number of digits in the integer is not equal to 5, the program should generate an error message and ask the use to re-enter the integer.
c)After a successful run, the program should ask the user if he wants to try the program for some other value, and should exit only when the user wants to exit (by pressing the character ‘N’). */


import java.util.*;

class SeparateNumber
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int nr, nr1, nr2, nr3, nr4, nr5;

        System.out.print("Enter a number with 5 digits: ");
        nr = in.nextInt();

        nr1 = nr / 10000;
        nr2 = (nr % 10000) / 1000;
        nr3 = ((nr % 10000) % 1000) / 100;
        nr4 = (((nr % 10000) % 1000) % 100) / 10;
        nr5 = (((nr % 10000) % 1000) % 100) % 10;

        System.out.print("The separated digits of entered number are"+ nr1+ " "+ nr2+ " "+ nr3+ " "+ nr4+ " "+nr5);
    }
}