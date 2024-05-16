import java.util.*;

public class NextGreaterElementInCircular {
    public static void main(String[] args) {
        
        int[] arr = {6,8,0,1,3};
        int n = arr.length;
        
        int[] ans = nextGreaterElementInCircularArray(arr, n);

        System.out.println("original array : "+Arrays.toString(arr));
        System.out.println("next Greater Element In Circular Array : "+Arrays.toString(ans));
    }


    // first approach when we start from left to right ( start to end ( 1 to n))
    private static int[] nextGreaterElementInCircularArray(int[] arr,int n)
    {
        Stack<Integer> st = new Stack<>();

        int[] ans = new int[n];

        Arrays.fill(ans, -1);
         
        for(int i=0;i<2*n-1;i++)
        {
            int j = i%n;
             while(!st.isEmpty() && arr[j] > arr[st.peek()])
             {
                ans[st.peek()] = arr[j];
                st.pop();
             }

             st.push(j);
        }
        
        return ans;
    }
}
