import java.util.Arrays;
import java.util.Stack;

public class MaximalRectangle {
      public static void main(String[] args) {
        
        int[][] heights = {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
        int n = heights.length;
        int m = heights[0].length;
        int ans = 0;
        
        int[] height = new int[m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(heights[i][j]==0)
                {
                    height[j] = 0;
                }
                else
                {
                    height[j] = height[j] + 1;
                }
            }

            ans = Math.max(ans,findMaxAreaForRectangle(height, m));
        }
        
        System.out.println("final max area of histogram is : "+ans);
        

       
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
