import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SubSetsSum {
    public static void main(String[] args) {
        
        // List<Integer> ans = new ArrayList<>();
        // Stack<Integer> temp = new Stack<>();
        int[] arr = {1,2,3};
        subSeq(arr,0,3,0);

        // System.out.println(ans);
    }

    public static void subSeq(int[] arr,int idx,int n,int sum)
    {
        if(idx==n)
        {
            System.out.println(sum);
            return;
        }

        // choice no
        subSeq(arr, idx+1, n, sum);

        // choice yes
        subSeq(arr, idx+1, n, sum +arr[idx]);

    }
}
