/*3.Use a one-dimensional array to solve the following problem: Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number is read, display it only if it’s not a duplicate of a number already read. Provide for the “worst case,” in which all five numbers are different. Display the complete set of unique values input after the user enters each new value. The program should not use any function other than main ( ) functions. (30 minutes)


Definition of Done:
a)The program should ask the user to enter 5 numbers.
b)The program should generate an error message is the value is not between 10 and 100 and ask the user to re-enter.
c)The program should display the non-duplicate entries only after each new value is read.*/



class check
{
public static void main(String[] args)
 {
     Scanner input = new Scanner(System.in);
        int sid[] = new int[5];

        int count = 0; 
        int x = 0;
        int num = 0;

        while (x < sid.length) 
            {
            System.out.println("Enter number: ");
            num = input.nextInt();

            if ((num >= 10) && (num <= 100)) {
                boolean digit = false;
                x++;

                for (int i = 0; i < sid.length; i++) 
                 {   if (sid[i] == num)     
                     digit = true;
                 }  

            if (!digit) {

                    sid[count] = num;

                    count++;

            } 

                else

                System.out.printf("the number was entered before \n");
 }

              else
               System.out.println("number must be between 10 and 100");


            for (int i =0;  i < x; i++) {
                System.out.print(sid[i] +" ");

            }

            System.out.println();  
        } 

        } 
    } 
