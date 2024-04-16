import java.util.Arrays;

public class ReverseArray {
    
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,9,11,14,16,17};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr,int start,int end)
    {
        if(start>end)
        {
            return;
        }
        
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr, start+1, end-1);

    }
}
