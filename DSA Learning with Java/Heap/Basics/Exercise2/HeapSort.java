public class HeapSort {
    public static void main(String[] args) {
        // O(n) time complexity

         int[] arr = {18,20,6,7,34,22,10,19};

         print(arr, arr.length);
         
         maxHeap(arr,arr.length);

         print(arr, arr.length);

         sortHeapArray(arr,arr.length);

         print(arr, arr.length);

         
    }

    public static void sortHeapArray(int[] arr, int n)
    {
        for(int i=n-1;i>=0;i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void print(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }

    public static void maxHeap(int[] arr, int n)
    {
        int start = n/2-1;

        for(int i= start;i>=0;i--)
        {
            heapify(arr,n,i);
        }
    }

    public static void heapify(int[] arr, int size,int index)
    {
        int largest = index;

        int left = index*2+1;
        int right = index*2+2;

        if(left < size && arr[left] > arr[largest])
        {
            largest = left;
        }

        if(right < size && arr[right] > arr[largest])
        {
            largest = right;
        }

        if(largest != index)
        {
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;

            heapify(arr, size, largest);
        }
    }
}
