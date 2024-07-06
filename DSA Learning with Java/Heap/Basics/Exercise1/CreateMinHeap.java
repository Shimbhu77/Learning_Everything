import java.util.Arrays;

public class CreateMinHeap {
    public static void main(String[] args) {
        
        MinHeap heap = new MinHeap(7);
        heap.insert(6);
        heap.insert(12);
        heap.insert(9);
        heap.print();
        heap.delete();
        heap.print();
        heap.insert(18);
        heap.insert(7);
        heap.print();
        heap.delete();
        heap.print();
        heap.insert(3);
        heap.print();
    }
}


/**
 * InnerCreateMaxHeap
 */
class MinHeap {

    private int[] arr;
    private int size;
    private int n;
    private int smallest;

    public MinHeap(int n) {
        this.arr = new int[n];
        this.size = 0;
        this.n = n;
    }

    public void insert(int value)
    {
        // checking overflow condition

        if(n == size)
        {
            System.out.println("Heap Overflow");
            return;
        }

        // inserting element

        arr[size] = value;
        int index = size;
        size++;

        System.out.println("Element "+value+" inserted into the heap.");

        // checking and doing step up process
        while(index>0)
        {
            int parentIndex = (index-1)/2;

            if(arr[parentIndex]>arr[index])
            {
                int temp = arr[index]; 
                arr[index] = arr[parentIndex];
                arr[parentIndex] = temp;
                
                index = parentIndex;
            }
            else
            {
                break;
            }
        }

    }

    private void heapify(int index)
    {
        smallest = index;

        int left = index*2+1;
        int right = index*2+2;

        if(left < size && arr[left] < arr[index])
        {
            smallest = left;
        }

        if(right < size && arr[right] < arr[index])
        {
            smallest = right;
        }

        if(left < size && right < size && arr[left] < arr[index] && arr[right] < arr[index])
        {
            int min = Math.min(arr[left], arr[right]);

            if(min == arr[right])
            {
                smallest = right;
            }

            if(min == arr[left])
            {
                smallest = left;
            }
        }

        if(smallest != index)
        {
            int temp = arr[index];
            arr[index] = arr[smallest];
            arr[smallest] = temp;

            heapify(smallest);
        }
    }

    public void delete()
    {
        if(size == 0)
        {
            System.out.println("Heap UnderFlow.");
            return;
        }

        System.out.println("Element "+arr[0]+" deleted from the heap.");
        arr[0] = arr[size-1];

        size--;

        heapify(0);
    }


    public void print()
    {
        for(int i=0;i<size;i++)
        {
           System.out.print(arr[i]+" ");
        }

        System.out.println();
    }
    
}
