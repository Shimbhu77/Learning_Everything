public class WaysToSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int sum = 3;
        int totalWays = waysToSum(arr, sum);

        System.out.println(totalWays);
    }

    public static int waysToSum(int[] arr,int sum)
    {
        if(sum == 0) return 1;
        if(sum < 0) return 0;

        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            count += waysToSum(arr, sum-arr[i]);
        }

        return count;
    }
}
