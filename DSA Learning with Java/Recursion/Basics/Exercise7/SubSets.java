import java.util.*;

public class SubSets {
    public static void main(String[] args) {
        
        List<List<Character>> ans = new ArrayList<>();
        Stack<Character> temp = new Stack<>();
        String str = "abc";
        char[] chars = str.toCharArray();
        subSeq(chars,0,3,ans,temp);

        System.out.println(ans);
    }

    public static void subSeq(char[] arr,int idx,int n,List<List<Character>> ans,Stack<Character> temp)
    {
        if(idx==n)
        {
            List<Character> list = new ArrayList<>();
            for(Character el : temp)
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
