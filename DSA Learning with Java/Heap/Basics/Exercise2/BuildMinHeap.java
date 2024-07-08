public class BuildMinHeap {
    
    private static int smallest;

    public static void main(String[] args) {
        // O(n) time complexity

         int[] arr = {18,20,6,7,34,22,10,19};

         minHeap(arr,arr.length);

         print(arr, arr.length);

         
    }

    public static void print(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }

    public static void minHeap(int[] arr, int n)
    {
        int start = n/2-1;

        for(int i= start;i>=0;i--)
        {
            heapify(arr,n,i);
        }
    }

    public static void heapify(int[] arr, int size,int index)
    {
        smallest = index;

        int left = index*2+1;
        int right = index*2+2;

        if(left < size && arr[left] < arr[smallest])
        {
            smallest = left;
        }

        if(right < size && arr[right] < arr[smallest])
        {
            smallest = right;
        }

        if(smallest != index)
        {
            int temp = arr[index];
            arr[index] = arr[smallest];
            arr[smallest] = temp;

            heapify(arr, size, smallest);
        }
    }
}
