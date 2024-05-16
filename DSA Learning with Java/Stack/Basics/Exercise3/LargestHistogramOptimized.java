import java.util.Arrays;
import java.util.Stack;

public class LargestHistogramOptimized {
    public static void main(String[] args) {
        
        int[] heights = {2,3,4,2,6,5,4,5,3};
        int n = heights.length;

        int ans = findMaxAreaForRectangle(heights, n);

        System.out.println("max area of histogram is : "+ans);
    }

    public static int findMaxAreaForRectangle(int[] heights, int n)
    {
        int ans = 0;

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && heights[i] < heights[st.peek()])
            {
               int index = st.pop();

               if(!st.isEmpty())
               {
                ans = Math.max(ans,heights[index]*(i-st.peek()-1));
               }
               else
               {
                  ans = Math.max(ans,heights[index]*(i));
               }
            }

            st.push(i);
        }

        while(!st.isEmpty())
        {
            int index = st.pop();

            if(!st.isEmpty())
            {
             ans = Math.max(ans,heights[index]*(n-st.peek()-1));
            }
            else
            {
               ans = Math.max(ans,heights[index]*(n));
            }
        }

        return ans;
    }

}


