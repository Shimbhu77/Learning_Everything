import java.util.*;

public class Permutation {

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int[] visited = new int[3];
         
        permutation(arr, visited, temp, ans);

        // System.out.println(ans);

        for(List<Integer> list : ans)
        {
            System.out.println(list);
        }

    }

    public static void permutation(int[] arr,int[] visited,List<Integer> temp,List<List<Integer>> ans)
    {
        if(temp.size()==arr.length)
        {   
            List<Integer> list = new ArrayList<>();
            list.addAll(temp);
            ans.add(list);
            return;
        }

        for(int i=0;i<visited.length;i++)
        {
            if(visited[i]==0)
            {
                visited[i]=1;
                temp.add(arr[i]);
                permutation(arr, visited, temp, ans);
                visited[i]=0;
                temp.remove(temp.size()-1);
            }
        }
    }




}