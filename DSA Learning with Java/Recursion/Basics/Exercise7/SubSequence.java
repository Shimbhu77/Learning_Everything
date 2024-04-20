import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SubSequence {
    public static void main(String[] args) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Stack<Integer> temp = new Stack<>();
        int[] arr = {1,2,3};
        subSeq(arr,0,3,ans,temp);

        System.out.println(ans);
    }

    public static void subSeq(int[] arr,int idx,int n,List<List<Integer>> ans,Stack<Integer> temp)
    {
        if(idx==n)
        {
            List<Integer> list = new ArrayList<>();
            for(Integer el : temp)
            {
                list.add(el);
            }
            ans.add(list);
            return;
        }

        // choice no
        subSeq(arr, idx+1, n, ans, temp);

        // choice yes
        temp.push(arr[idx]);
        subSeq(arr, idx+1, n, ans, temp);
        temp.pop();
    }
}
