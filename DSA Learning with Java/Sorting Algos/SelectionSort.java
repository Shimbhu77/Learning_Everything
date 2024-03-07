import java.util.*;

public class SelectionSort{
    
    // selection sort algorithm
    public static void main(String[] args)
    {
        int[] array = {3,7,1,9,6,5};
        
       
        System.out.println("UnSorted Array");
        System.out.println(Arrays.toString(array));
        
        // {1,3,6,7,9,12}
        int[] sortedArray = selectionSortMethod(array);

        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(sortedArray));
    } 

    public static int[] selectionSortMethod(int[] arr)
    {
        int n = arr.length;
        // assuming minimum element index
        int index = 0;
        // running loop for n-1 rounds for sorting array
        for(int i=0;i<n-1;i++)
        {
            // finding the minimum element index in the array
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[index])
                {
                    index = j;
                }
            }
            // swaping the initial position number to the minimum element index
            swapNumber(arr,index,i);
        }
        return arr;
    }
    
    public static int[] swapNumber(int[] arr,int minimumElementIndex,int initialPosition)
    {
       int initialPositionNumber = arr[initialPosition];
       arr[initialPosition]= arr[minimumElementIndex];
       arr[minimumElementIndex]=initialPositionNumber;

       return arr;
    }

}