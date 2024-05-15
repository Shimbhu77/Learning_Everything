import java.util.*;

public class StockSpanProblem {
    public static void main(String[] args) {
        
        int[] arr = {100,80,60,70,60,75,85};
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
         
        for(int i=0;i<n;i++)
        {
             while(!st.isEmpty() && arr[i] >= arr[st.peek()])
             {
                st.pop();
             }

             if(st.isEmpty())
             {
                ans[i]=1;
             }
             else
             {
                 ans[i] = i-st.peek();
             }

             st.push(i);
        }
        
        return ans;
    }
}
