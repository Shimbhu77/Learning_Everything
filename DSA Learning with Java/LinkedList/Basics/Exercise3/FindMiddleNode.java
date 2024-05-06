public class FindMiddleNode {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        Node head = new GenerateLinkedList().generate(arr);
        // head = null;

        // normal finding the middle node
        Node middleNode;
        
        // middleNode = findMiddleNode(head);

        // recursion reverse

        Node slow = head;
        Node fast = head;

        middleNode = findMiddleNodeWithRecursion(slow, fast);


        System.out.println(middleNode.data);


    }

    public static Node findMiddleNode(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next !=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Node findMiddleNodeWithRecursion(Node slow,Node fast)
    {

        if(fast==null || fast.next == null)
        {
            return slow;
        }

        return findMiddleNodeWithRecursion(slow.next, fast.next.next);
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



