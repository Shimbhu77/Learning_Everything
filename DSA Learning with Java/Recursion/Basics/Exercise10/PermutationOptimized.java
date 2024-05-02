import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PermutationOptimized {
     
    public static void main(String[] args) {
        
        int[] arr = {1,2,3};

        List<List<Integer>> ans = new ArrayList<>();
         
        permutation(arr, ans,0);

        // System.out.println(ans);

        for(List<Integer> list : ans)
        {
            System.out.println(list);
        }
    }

    public static void permutation(int[] arr,List<List<Integer>> ans,int idx)
    {

        if(idx == arr.length)
        {
            List<Integer> list = Arrays.stream(arr)
                                   .boxed() // Convert int to Integer
                                   .collect(Collectors.toList());
                                   
            ans.add(list);
            return;
        }


        for(int i = idx;i<arr.length;i++)
        {
            swap(arr,i,idx);
            permutation(arr, ans, idx+1);
            swap(arr, idx, i);
        }
    }

    public static void swap(int[] arr,int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

     

}
