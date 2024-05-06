public class RotateLinkedList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        Node head = new GenerateLinkedList().generate(arr);
        // head = null;\
        int k = 7;

        // normal reverse
        head = rotateLinkedListKTimes(head,k);

        // recursion reverse

        // Node prev = null;
        // Node curr = head;

        // head = reverseLinkedListWithRecursion(prev, curr);

        Node temp = head;

        System.out.println("Updated Linked List: ");
        while (temp !=null) {
            System.out.print(temp.data+" ");
            // System.out.println(temp.data+" -> "+temp.next);
            temp = temp.next;
        }
        System.out.println();


    }


    public static Node rotateLinkedListKTimes(Node head,int k)
    {
        Node temp = head;
        int size = 0;

        while (temp !=null) {
            size++;
            temp = temp.next;
        }

        k = k % size;

        int rotation = size-k;

        if(rotation == size)
        {
            return head;
        }

        temp = head;

        while (rotation-->1) {
            temp = temp.next;
        }

        Node rotatedList = temp.next;

        temp.next = null;

        Node start = head;

        head = rotatedList;

        while(rotatedList.next !=null)
        {
            rotatedList = rotatedList.next;
        }

        rotatedList.next = start;

        return head;
    }
}



class GenerateLinkedList {
    
    private Node createLinkedList(int[] arr,int n,int idx)
    {
        if(idx == n)
        {
            return null;
        }
        
        Node temp = new Node(arr[idx]);

        temp.next = createLinkedList(arr, n, idx+1);

        return temp;
    }

    public Node generate(int[] arr) {
        // int[] arr = {1,2,3,4};
        int n = arr.length;

        Node head = null;

        head = createLinkedList(arr, n, 0);
        
        
        Node temp = head;
        System.out.println("Generated Linked List: ");
        while (temp !=null) {
            System.out.print(temp.data+" ");
            // System.out.println(temp.data+" -> "+temp.next);
            temp = temp.next;
        }
        System.out.println();

        return head;
    }
}

 class Node {
    int data;
    Node next; 

    Node(int data)
    {
        this.data = data;
    }
}



