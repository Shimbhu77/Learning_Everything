import java.util.*;

public class InsertionSort {
      // insertion sort algorithm
      public static void main(String[] args)
      {
          int[] array = {3,7,1,9,6,5};
          
         
          System.out.println("UnSorted Array");
          System.out.println(Arrays.toString(array));
          
          // {1,3,6,7,9,12}
          int[] sortedArray = insertionSortMethod(array);
  
          System.out.println("Sorted Array");
          System.out.println(Arrays.toString(sortedArray));
      } 

      public static int[] insertionSortMethod(int[] arr)
      {
        for(int i=1; i<arr.length; i++)
        {
            for(int j = i; j>0 ; j--)
            {
               if(arr[j]<arr[j-1])
               {
                 int temp = arr[j];
                 arr[j] = arr[j-1];
                 arr[j-1] = temp;
               }
               else
               {
                 break;
               }
            }
        }

        return arr;
      }
}
