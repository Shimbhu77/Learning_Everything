import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,7,3,8,5,4,0,6,2,3};

        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void mergeSort(int[] arr,int start,int end)
    {
        if(start==end)
        {
            return;
        }

        int mid = start + (end-start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);

        mergeArray(arr,start,mid,end);
    } 

    public static void mergeArray(int[] arr,int start,int mid,int end)
    {
        int[] temp = new int[end-start+1];

        int left = start;
        int right = mid+1;
        int index = 0;

        while(left <= mid && right <= end)
        {
            if(arr[left] <= arr[right])
            {
                temp[index] = arr[left];
                left++;
                index++;
            }
            else
            {
                temp[index] = arr[right];
                right++;
                index++;
            }
        }

        while (left<=mid) {
            temp[index] = arr[left];
            left++;
            index++;
        }

        while (right<=end) {
            temp[index] = arr[right];
            right++;
            index++;
        }

        index = 0;

        while (start<=end) {

            arr[start] = temp[index];
            index++;
            start++;
            
        }
    }
}
