import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        int n = arr.length;

        int[] ans = prefixSumOfArray(arr, n);
        System.out.println("arr : "+Arrays.toString(arr));
        System.out.println("ans : "+Arrays.toString(ans));
    }

    public static int[] prefixSumOfArray(int arr[], int n){
        
        int[] prefixSumArr = new int[n];
        int prefixSum = 0;
        
        for(int i=0;i<n;i++)
        {
            prefixSum += arr[i];
            prefixSumArr[i] = prefixSum;
        }
        
        return prefixSumArr;
    }
}
