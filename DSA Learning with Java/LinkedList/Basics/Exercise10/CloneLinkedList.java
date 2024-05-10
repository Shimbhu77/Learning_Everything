import java.util.HashMap;
import java.util.Map;

/**
 * SumOfTwoLinkedList
 */
public class CloneLinkedList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        // int[] arr1 = {1};

        Node head = new GenerateLinkedList().generate(arr);
        head.arb = head.next;
        head.next.arb = head.next.next.next;

        System.out.println(head);

        Node temp = head;

        System.out.println("Updated Linked List: ");
        while (temp !=null) {
            System.out.println(temp);
            // System.out.println(temp.data+" -> "+temp.next);
            temp = temp.next;
        }
        System.out.println();


        // Node headCopy = cloneList(head);
        Node headCopy = cloneListUsingMap(head);

        System.out.println(headCopy);


        temp = headCopy;

        // int round = 12;

        System.out.println("Updated Linked List: ");
        while (temp !=null) {
            System.out.print(temp.data+" ");
            // System.out.println(temp.data+" -> "+temp.next);
            temp = temp.next;
        }
        System.out.println();


    }

    public static Node cloneListUsingMap(Node head)
    {
        Node headCopy = null;
        Node tailCopy = null;

        Map<Node,Node> map = new HashMap<>();

        Node curr = head;

        while(curr != null)
        {
            if(headCopy == null)
            {
                headCopy = new Node(curr.data);
                tailCopy = headCopy;
                map.put(curr, tailCopy);
                curr = curr.next;
            }
            else
            {
                tailCopy.next = new Node(curr.data);
                tailCopy = tailCopy.next;
                map.put(curr, tailCopy);
                curr = curr.next;
            }
        }

        curr = head;
        Node currCopy = headCopy;

        while (curr != null) {
            currCopy.arb = map.get(curr.arb);
            currCopy = currCopy.next;
            curr = curr.next;
        }

        return headCopy;

    }

    public static Node cloneList(Node head)
    {
        Node headCopy = null;
        Node tailCopy = null;

        Node curr = head;

        while(curr != null)
        {
            if(headCopy == null)
            {
                headCopy = new Node(curr.data);
                tailCopy = headCopy;
                curr = curr.next;
            }
            else
            {
                tailCopy.next = new Node(curr.data);
                tailCopy = tailCopy.next;
                curr = curr.next;
            }
        }

        curr = head;
        Node currCopy = headCopy;

        while (curr != null) {
            
            Node rdm = curr.arb;

            if(rdm != null)
            {
                Node temp = head;
                Node tempCopy = headCopy;


                while(temp != rdm)
                {
                    temp = temp.next;
                    tempCopy = tempCopy.next;
                }

                currCopy.arb = tempCopy;
            }
            currCopy = currCopy.next;
            curr = curr.next;
        }

        return headCopy;

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
    Node arb; 
    

    @Override
    public String toString() {
        return "Node [data=" + data + ", next=" + next + ", arb=" + arb + "]";
    }


    Node(int data)
    {
        this.data = data;
    }
}



