import java.util.Arrays;

public class SuffixSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        int n = arr.length;

        int[] ans = suffixSumOfArray(arr, n);
        System.out.println("arr : "+Arrays.toString(arr));
        System.out.println("ans : "+Arrays.toString(ans));
    }

    public static int[] suffixSumOfArray(int arr[], int n){
        
        int[] suffixSumArr = new int[n];
        suffixSumArr[n-1] = arr[n-1];
        
        for(int i=n-2;i>=0;i--)
        {
           
            suffixSumArr[i] = suffixSumArr[i+1]+arr[i];
        }
        
        return suffixSumArr;
    }
}