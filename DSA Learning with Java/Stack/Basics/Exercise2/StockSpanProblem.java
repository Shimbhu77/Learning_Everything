import java.util.*;

public class StockSpanProblem {
    public static void main(String[] args) {
        
        int[] arr = {60,70,100,80,60,70,60,75,85};
        int n = arr.length;
        
        int[] ans = stockSpan(arr, n);

        System.out.println("original array : "+Arrays.toString(arr));
        System.out.println("stock span problem : "+Arrays.toString(ans));
    }


    // first approach when we start from left to right ( start to end ( 1 to n))
    private static int[] stockSpan(int[] arr,int n)
    {
        Stack<Integer> st = new Stack<>();

        int[] ans = new int[n];
         
        for(int i=n-1;i>=0;i--)
        {
             while(!st.isEmpty() && arr[i] > arr[st.peek()])
             {
                ans[st.peek()] = st.peek()-i;
                st.pop();
             }

             st.push(i);
        }

        while(!st.isEmpty())
        {
            ans[st.peek()] = st.peek()+1;
            st.pop();
        }
        
        return ans;
    }
}
