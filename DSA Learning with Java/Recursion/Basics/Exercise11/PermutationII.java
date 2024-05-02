import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PermutationII {

    public static void main(String[] args) {
        int[] arr = {1,1};

        List<List<Integer>> ans = new ArrayList<>();
         
        permutationII(arr, ans,0);

        // System.out.println(ans);

        for(List<Integer> list : ans)
        {
            System.out.println(list);
        }
    }
    
    public static void permutationII(int[] arr,List<List<Integer>> ans, int idx)
    {

        if(arr.length == idx)
        {
            List<Integer> list = Arrays.stream(arr)
                                   .boxed() // Convert int to Integer
                                   .collect(Collectors.toList());
                                   
            ans.add(list);
            return;
        }


        int[] visited = new int[20]; 

        for(int i=idx;i<arr.length;i++)
        {
            System.out.println("idx : "+idx +" i : "+i+" arr : "+(Arrays.toString(arr)));
            System.out.println(Arrays.toString(visited));
            if(visited[arr[i]+10]==0)
            {
                swap(arr, idx, i);
                permutationII(arr, ans, idx+1);
                swap(arr, idx, i);
                visited[arr[i]+10] =1;
            }
        }
    }

    public static void swap(int[] arr,int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    

}