/**
 * SumOfTwoLinkedList
 */
public class SumOfTwoLinkedList {
    public static void main(String[] args) {
        int[] arr = {0,8,9,8,9,0};
        int[] arr1 = {1};

        Node head1 = new GenerateLinkedList().generate(arr);
        Node head2 = new GenerateLinkedList().generate(arr1);

        // head1 = reverseLinkedList(head1, null);
        // head2 = reverseLinkedList(head2, null);

        Node head = sumOfTwoLinkedList(head1,head2);

        Node temp = head;

        int round = 12;

        System.out.println("Updated Linked List: ");
        while (temp !=null && round-- > 0) {
            System.out.print(temp.data+" ");
            // System.out.println(temp.data+" -> "+temp.next);
            temp = temp.next;
        }
        System.out.println();


    }

    public static Node sumOfTwoLinkedList(Node head1, Node head2)
    {
        head1 = reverseLinkedList(head1, null);
        head2 = reverseLinkedList(head2, null);

        Node curr1 = head1;
        Node curr2 = head2;

        int sum = 0, carry = 0,number = 0;

        Node head = new Node(0);
        Node tail = head;

        while(curr1 != null && curr2 != null)
        {
            sum = curr1.data+curr2.data+carry;
            number = sum%10;
            tail.next = new Node(number);
            tail = tail.next;
            curr1 = curr1.next;
            curr2 = curr2.next;
            carry = sum/10;
        }

        while(curr1 != null)
        {
            sum = curr1.data+carry;
            number = sum%10;
            tail.next = new Node(number);
            tail = tail.next;
            curr1 = curr1.next;
            carry = sum/10;
        }

        while(curr2 != null)
        {
            sum = curr2.data+carry;
            number = sum%10;
            tail.next = new Node(number);
            tail = tail.next;
            curr2 = curr2.next;
            carry = sum/10;
        }

        while(carry != 0)
        {
            tail.next = new Node(carry%10);
            tail = tail.next;
            carry = carry/10;
        }

        head = reverseLinkedList(head.next, null);

        while( head != null && head.data == 0)
        {
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
        
        if(head == null)
        {
            head = new Node(0);
        }

        return head;
    }

    public static Node reverseLinkedList(Node curr, Node prev)
    {
        if(curr == null)
        {
            return prev;
        }

        Node fut = curr.next;
        curr.next = prev;

        return reverseLinkedList(fut, curr);
    }

    public static void makeCircularLinkedList(Node head)
    {
        Node curr = head;

        while(curr.next != null)
        {
            curr = curr.next;
        }

        curr.next = head;
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



