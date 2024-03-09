import java.util.*;

public class BinarySearchAlgo {
      // selection sort algorithm
      public static void main(String[] args)
      {
          int[] array = {1,3,7,8,11,16};
          int k = 16;
          
         
          System.out.println("Array");
          System.out.println(Arrays.toString(array));
          
          // 2
          int index = binarySearchMethod(array,k);
  
          System.out.println("Search Elements Index in  Array : "+index);
      } 

      public static int binarySearchMethod(int[] arr,int k)
      {
          int start = 0;
          int end = arr.length-1;

          while (start<=end) {
            int mid = start+((end-start)/2);
            if(arr[mid]==k)
            {
                return mid;
            }
            else if(arr[mid]<k)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
          }

         return -1; 
      }
}
