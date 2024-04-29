import java.util.Stack;

public class CorrespondingSubSetsSum {
    
    public static void main(String[] args) {
        
        // List<Integer> ans = new ArrayList<>();
        Stack<Integer> temp = new Stack<>();
        int[] arr = {1,2,3};
        correspondingSubSetsSum(arr,0,3,temp,0);

        // System.out.println(ans);
    }


    public static void correspondingSubSetsSum(int[] arr,int idx,int n, Stack<Integer> st,int sum)
    {

        if(idx == n)
        {
            System.out.println("SubSet : "+st+", Sum : "+sum);
            return;
        }

        // choice no
        correspondingSubSetsSum(arr, idx+1, n, st,sum);

        // choice yes
        st.push(arr[idx]);
        correspondingSubSetsSum(arr, idx+1, n, st,sum+arr[idx]);
        st.pop();

    }
}
