import java.util.Arrays;
import java.util.Stack;

public class LargestHistogram {
    public static void main(String[] args) {
        
        int[] heights = {2,3,4,2,6,5,4,5,3};
        int n = heights.length;

        int[] nsr = nextSmallerRight(heights, n);
        int[] nsl = nextSmallerLeft(heights, n);

        System.out.println("nsr "+Arrays.toString(nsr));
        System.out.println("nsl "+Arrays.toString(nsl));
        // System.out.println("nsl "+Arrays.toString(nsr));

        int ans = findMaxAreaForRectangle(nsr, nsl, heights, n);

        System.out.println("max area of histogram is : "+ans);
    }


    public static int findMaxAreaForRectangle(int[] nsr,int[] nsl, int[] heights,int n)
    {
        int maxArea = 0;

        for(int i=0;i<n;i++)
        {
            maxArea = Math.max(maxArea, (heights[i]*(nsr[i]-nsl[i]-1)));
        }

        return maxArea;
    }

    public static int[] nextSmallerRight(int[] arr, int n)
    {
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && arr[i] < arr[st.peek()])
            {
                ans[st.peek()] = i;
                st.pop();
            }

            st.push(i);
        }

        while(!st.isEmpty())
        {
            ans[st.peek()] = n;
            st.pop();
        }

        return ans;
    }

    
    public static int[] nextSmallerLeft(int[] arr, int n)
    {
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[i] < arr[st.peek()])
            {
                ans[st.peek()] = i;
                st.pop();
            }

            st.push(i);
        }

        while(!st.isEmpty())
        {
            ans[st.peek()] = -1;
            st.pop();
        }

        return ans;
    }
}


