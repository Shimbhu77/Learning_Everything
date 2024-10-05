import java.util.Arrays;

public class KadaneAlgo {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        int n = arr.length;

        int ans = maxSubarraySum(arr, n);
        System.out.println("arr : "+Arrays.toString(arr));
        System.out.println("ans : "+ans);

        System.out.println("without kadane's algo ans is : "+maxSubarraySumWithoutKadaneAlgo(arr,n));

    }

    // time complexity is O(N)
    public static int maxSubarraySum(int arr[], int n){
        
        int max = Integer.MIN_VALUE;
        int prefixSum = 0;
        
        for(int i=0;i<n;i++)
        {
            prefixSum += arr[i];
            max = Math.max(prefixSum,max);
            if(prefixSum<0)
            {
                prefixSum = 0;
            }
        }
        
        return max;
    }

    // time complexity is O(N^2)
    public static int maxSubarraySumWithoutKadaneAlgo(int arr[], int n){
        
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {
            int prefixSum = 0;

            for(int j=i;j<n;j++)
            {
                prefixSum += arr[i];
                max = Math.max(prefixSum,max);
            }
        
        }
        
        return max;
    }
}
