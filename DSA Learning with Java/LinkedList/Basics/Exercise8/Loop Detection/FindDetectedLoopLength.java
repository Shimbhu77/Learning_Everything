import java.util.HashMap;
import java.util.Map;

public class FindDetectedLoopLength {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,3,9};

        Node head = new GenerateLinkedList().generate(arr);

        makeCircularLinkedList(head);

        // boolean ans = loopdetectionViaMap(head);
        int ans = loopdetectionViaSlowAndFastPointersAndLength(head);

        System.out.println("loop length : "+ans);

        Node temp = head;

        int round = 17;

        System.out.println("Updated Linked List: ");
        while (temp !=null && round-- > 0) {
            System.out.print(temp.data+" ");
            // System.out.println(temp.data+" -> "+temp.next);
            temp = temp.next;
        }
        System.out.println();
    }

    public static int loopdetectionViaSlowAndFastPointersAndLength(Node head)
    {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
           
            slow = slow.next;
            fast = fast.next.next;

            if(slow.equals(fast))
            {
               break;
            }
        }

        if(fast != null && fast.next != null)
        {
            int count = 1;

            slow = slow.next;

            while(!slow.equals(fast))
            {
                count++;
                slow = slow.next;
            }

            return count;
        }
        else
        {
            return 0;
        }
        
    }

    public static void makeCircularLinkedList(Node head)
    {
        Node curr = head;

        while(curr.next != null)
        {
            curr = curr.next;
        }

        curr.next = head.next.next.next;
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



