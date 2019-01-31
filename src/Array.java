import java.util.*;
class Array
{
public static void main(String[] args) 
    {     

           int num;
           Scanner scan = new Scanner (System.in);
           System.out.println("Enter the size of array");
           num = scan.nextInt();
           int ar1[] = new int[num];
           int ar2[] = new int[num];

           System.out.print("enter array elements");
           for (int i = 0; i < ar1.length; i++)
           ar1[i] = scan.nextInt();
           System.out.print("Display ar1 : "  );
           for (int i = 0; i < ar1.length; i++)
           System.out.print(ar1[i] +" "); 

           System.out.print("enter array elements"); 
          for (int i = 0; i < ar2.length; i++)
          ar2[i] = scan.nextInt();
          System.out.print("Display ar2 : "  );
          for (int i = 0; i < ar2.length; i++)
          System.out.print(ar2[i] +" ");

          int mergedArray[]=merging(ar1, ar2);  //merging both arrays.
          System.out.print("\nDisplay merged array: "  );
          for (int i = 0; i < mergedArray.length; i++)
          System.out.print(mergedArray[i] +" ");
      }
        static int[] merging(int[] ar1, int ar2[]) 
         {
           
             int mergedArray[]=new int[ar1.length+ar2.length];
             int ar1Index=0, ar2Index=0, mergedArrayIndex=0;
           
           while (ar1Index < ar1.length  && ar2Index < ar2.length)
                  if (ar1[ar1Index] < ar2[ar2Index])
                        mergedArray[mergedArrayIndex++] = ar1[ar1Index++];
                  else
                        mergedArray[mergedArrayIndex++] = ar2[ar2Index++];
           
           while (ar1Index < ar1.length )
                  mergedArray[mergedArrayIndex++] = ar1[ar1Index++];
           
           while (ar2Index < ar2.length)
                  mergedArray[mergedArrayIndex++] = ar2[ar2Index++];
           
           return mergedArray;

}
           }