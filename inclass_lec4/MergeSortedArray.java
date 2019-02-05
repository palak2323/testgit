/*5.Write a program to merge two sorted arrays. (25 minutes)

Definition of Done:
a)The program should ask the user to enter two sorted arrays. The arrays may be of different sizes.
b)The program should create another array which merges the elements of the two arrays such that the merged array is also sorted.*/



import java.util.*;
class MergeSortedArray {
   public static void main(String[] args) {
      int[] arr1 = { 1, 18, 22, 100, 105, 1002 };
      int[] arr2 = { 16, 17, 19, 21, 1001 };
      int[] arr3 = new int[arr1.length + arr2.length];
      int i = 0, j = 0, k = 0;
      while (i < arr1.length && j < arr2.length) {
           if (arr1[i] < arr2[j]) {
               arr3[k] = arr1[i];
               i++;
           } else {
               arr3[k] = arr2[j];
               j++;
           }
           k++;
      }
 
      
      System.out.println("Merged Sorted Array" + Arrays.toString(arr3));
   }
}