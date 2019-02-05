/*1.Write a Java program to find the index of an array element in an array of size 10. The program should not use any function other than main ( ) functions. (20 minutes)

Definition of Done:
a)The program should ask user to enter the elements of the array.
b)The program should ask the user to enter a number to search.
c)The program should display the elements of the array entered.
d)The program should display the index of the number if the item is present or display -1 of the element is not present.*/


import java.util.*; 
class index 
{ 
     public static void main(String args[]) 
       {
           int[] arr = new int[10];
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter elements of array");
           int k;
           for (k=0;k<10;k++)
             {
               arr[k]=sc.nextInt();
             }
           System.out.print("enter elements whose index is to be  found");
           int n = sc.nextInt();  
           
                 
            int len = arr.length; 
            int i = 0; 
  
         
        while (i < 10) 
        { 
              if (arr[i] == n)
               { 
                System.out.print("index is "+i);
                } 
            else
            {
            	System.out.print("not found");
            }
            i++;
        }

  }
}        