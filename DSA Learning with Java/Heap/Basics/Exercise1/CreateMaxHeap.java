import java.util.Arrays;

public class CreateMaxHeap {
    public static void main(String[] args) {
        
        // n*logn time complexity
        MaxHeap heap = new MaxHeap(4);
        heap.insert(6);
        heap.insert(12);
        heap.insert(15);
        heap.print();
        heap.delete();
        heap.print();
        heap.insert(18);
        // heap.insert(19);
        // heap.insert(7);
        // heap.delete();
        heap.insert(16);
        heap.print();
        heap.delete();
        heap.print();
        heap.insert(36);
        heap.print();
    }


}


/**
 * InnerCreateMaxHeap
 */
class MaxHeap {

    private int[] arr;
    private int size;
    private int n;

    public MaxHeap(int n) {
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

            if(arr[parentIndex]<arr[index])
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

    public void print()
    {
        for(int i=0;i<size;i++)
        {
           System.out.print(arr[i]+" ");
        }

        System.out.println();
    }
    

    private void heapify(int index)
    {
        int largest = index;

        int left = index*2+1;
        int right = index*2+2;

        if(left < size && arr[left] > arr[index])
        {
            largest = left;
        }

        if(right < size && arr[right] > arr[index])
        {
            largest = right;
        }

        if(left < size && right < size && arr[left] > arr[index] && arr[right] > arr[index])
        {
            int max = Math.max(arr[left], arr[right]);

            if(max == arr[right])
            {
                largest = right;
            }

            if(max == arr[left])
            {
                largest = left;
            }
        }

        if(largest != index)
        {
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;

            heapify(largest);
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
}
