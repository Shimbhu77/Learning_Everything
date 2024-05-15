import java.util.*;

public class NextSmallerElement {
    public static void main(String[] args) {
        
        int[] arr = {1,4,7,2,1,7,2};
        int n = arr.length;
        
        int[] ans1 = nextSmallerElement(arr, n);
        int[] ans2 = nextSmallerElementApproachSecond(arr, n);

        System.out.println("original array : "+Arrays.toString(arr));
        System.out.println("next smaller element via first approach : "+Arrays.toString(ans1));
        System.out.println("next smaller element via second approach : "+Arrays.toString(ans2));
    }


    // first approach when we start from left to right ( start to end ( 1 to n))
    private static int[] nextSmallerElement(int[] arr,int n)
    {
        Stack<Integer> st = new Stack<>();

        int[] ans = new int[n];

        Arrays.fill(ans, -1);
         
        for(int i=0;i<n;i++)
        {
             while(!st.isEmpty() && arr[i]<arr[st.peek()])
             {
                ans[st.peek()] = arr[i];
                st.pop();
             }

             st.push(i);
        }
        
        return ans;
    }

    // second approach when we start from left to right ( start to end ( 1 to n))
    private static int[] nextSmallerElementApproachSecond(int[] arr,int n)
    {
        Stack<Integer> st = new Stack<>();

        int[] ans = new int[n];

        Arrays.fill(ans, -1);
         
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[i]<=arr[st.peek()])
            {
               st.pop();
            }

            if(!st.isEmpty())
            {
               ans[i] = arr[st.peek()];
            }

            st.push(i);
        }
        
        return ans;
    }
}
