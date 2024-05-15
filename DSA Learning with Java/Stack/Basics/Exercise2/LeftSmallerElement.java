import java.util.*;

public class LeftSmallerElement {
    public static void main(String[] args) {
        
        int[] arr = {1,5,0,3,4,5};
        int n = arr.length;
        
        int[] ans = leftSmallerElement(arr, n);

        System.out.println("original array : "+Arrays.toString(arr));
        System.out.println("next smaller element : "+Arrays.toString(ans));
    }


    // first approach when we start from left to right ( start to end ( 1 to n))
    private static int[] leftSmallerElement(int[] arr,int n)
    {
        Stack<Integer> st = new Stack<>();

        int[] ans = new int[n];

        Arrays.fill(ans, -1);
         
        for(int i=n-1;i>=0;i--)
        {
             while(!st.isEmpty() && arr[i] <= arr[st.peek()])
             {
                ans[st.peek()] = arr[i];
                st.pop();
             }

             st.push(i);
        }
        
        return ans;
    }
}
