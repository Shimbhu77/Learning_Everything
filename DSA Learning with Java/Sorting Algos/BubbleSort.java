import java.util.Arrays;

public class BubbleSort {
     // selection sort algorithm
    public static void main(String[] args)
    {
        int[] array = {3,7,1,9,6,5};
        
       
        System.out.println("UnSorted Array");
        System.out.println(Arrays.toString(array));
        
        // {1,3,6,7,9,12}
        int[] sortedArray = bubbleSortMethod(array);

        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(sortedArray));
    } 

    public static int[] bubbleSortMethod(int[] arr)
    {
        int n = arr.length;
        for(int i = n-2;i>=0;i--)
        {
            boolean flag = true;
            for(int j=0;j<=i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    flag = false;
                }
            }

            if(flag)
            {
                break;
            }
        }

        return arr;
    }
}
