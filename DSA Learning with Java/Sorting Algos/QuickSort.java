import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,7,3,8,5,4,0,6,2,3};

        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr,int start,int end)
    {
        if(start>=end)
        {
            return;
        }

        int pivot = partition(arr,start,end);
        quickSort(arr, start, pivot-1);
        quickSort(arr, pivot, end);
    }

    public static int partition(int[] arr,int start,int end)
    {
        int pos = start;

        for(int i=start;i<=end;i++)
        {
            if(arr[i]<=arr[end])
            {
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
            }
        }

        return pos-1;
        
    }

}
