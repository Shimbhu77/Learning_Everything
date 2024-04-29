import java.util.Stack;

public class PerfectSum {
     public static void main(String[] args) {
        
        int[] arr = {1,2,3};
        int count = perfectSum(arr,0,3,3);
        System.out.println(count);
    }


    public static int perfectSum(int[] arr,int idx,int n, int sum)
    {

        if(idx == n)
        {
            if(sum==0)
            {
                return 1;
            }
            
            return 0;
        }

        
        return perfectSum(arr, idx+1, n, sum) + perfectSum(arr, idx+1, n, sum-arr[idx]);
    }
}
