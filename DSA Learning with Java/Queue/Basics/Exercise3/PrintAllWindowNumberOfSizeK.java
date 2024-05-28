import java.util.*;

public class PrintAllWindowNumberOfSizeK {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3;

        printAllNumberOfWindowSizeK(arr, k);
    }

    public static void printAllNumberOfWindowSizeK(int[] arr,int k)
    {
        Queue<Integer> q = new LinkedList<>();

        int idx = 0;

        for(idx = 0;idx<k;idx++)
        {
            q.offer(arr[idx]);
        }

        idx = k-1;

        while(idx < arr.length)
        {
            int x = k;

            while(x-->0)
            {
                int el = q.poll();
                System.out.print(el+" ");
                q.offer(el);
            }

            System.out.println();

            idx++;

            if(idx<arr.length)
            {
                // removing front element from queue
                q.poll();
                
                // adding new element into the queue
                q.offer(arr[idx]);
            }

        }
    }
}
