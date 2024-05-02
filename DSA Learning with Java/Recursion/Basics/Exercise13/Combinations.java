import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Combinations {
    
    public static void main(String[] args) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Stack<Integer> temp = new Stack<>();
        int[] arr = {1,2,3,4};
        combinations(arr,0,4,ans,temp,2);

        System.out.println(ans);
    }


    public static void combinations(int[] arr,int idx,int n,List<List<Integer>> ans,Stack<Integer> temp,int k)
    {
        if(idx==n || temp.size() == 2)
        {
            if(temp.size()==k)
            {
                List<Integer> list = new ArrayList<>();
                for(Integer el : temp)
                {
                    list.add(el);
                }
                ans.add(list);
            }

            return;
        }

        // choice no
        combinations(arr, idx+1, n, ans, temp,k);

        // choice yes
        temp.push(arr[idx]);
        combinations(arr, idx+1, n, ans, temp,k);
        temp.pop();
    }




}
