public class MergeTwoSortedLinkedList {
    

    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,3,4,4,5};
        int[] arr2 = {1,3,4};

        Node head1 = null;

        Node head2 = null;

        head1 = generateDoublyLinkedList(arr1, head1);
        head2 = generateDoublyLinkedList(arr2, head2);

        Node head = mergeTwoSortedLinkedList(head1,head2);

        Node temp = head;

        System.out.println("Merged LinkedList : ");

        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();


    }

    public static Node mergeTwoSortedLinkedList(Node head1,Node head2)
    {
        Node head = null;
        Node tail = null;

        while(head1 != null && head2 != null)
        {
            if(head1.data <= head2.data)
            {
                if(head == null)
                {
                    head = new Node(head1.data);
                    tail = head;
                }
                else
                {
                    tail.next = new Node(head1.data);
                    tail = tail.next;
                }

                head1 = head1.next;
            }
            else
            {
                if(head == null)
                {
                    head = new Node(head2.data);
                    tail = head;
                }
                else
                {
                    tail.next = new Node(head2.data);
                    tail = tail.next;
                }

                head2 = head2.next;
            }
        }

        while (head1!=null) {
            tail.next = new Node(head1.data);
            tail = tail.next;

            head1 = head1.next;
        }

        while (head2!=null) {
            tail.next = new Node(head2.data);
            tail = tail.next;
            head2 = head2.next;
        }


        return head;


    }


    public static Node generateDoublyLinkedList(int[] arr, Node head)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(head == null)
            {
                head = new Node(arr[i]);
            }
            else
            {
                Node curr = head;

                while (curr.next!=null) {
                    curr = curr.next;
                }

                Node temp = new Node(arr[i]);
                curr.next = temp;
            }
        }

        Node temp = head;
        System.out.println("Generated LinkedList By Adding Node At End : ");

        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();

        return head;
       
    }

}


class Node {

    int data;
    Node next;

    Node(int val)
    {
        this.data = val;
        this.next = null;
    }
}