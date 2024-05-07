public class DoublyLinkedListDeletingNodeAtAnyPosition {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int position = 4;

        Node head = null;

        head = generateDoublyLinkedList(arr, head);

        head = deleteNodeAtAnyPosition(head,position);

        Node temp = head;

        System.out.println("Updated LinkedList : ");

        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();


    }

    public static Node deleteNodeAtAnyPosition(Node head,int position)
    {
        if(head == null)
        {
            return head;
        }

        if(head.next == null)
        {
            head = null;
            return head;
        }

        if(position == 1)
        {
            Node temp = head;
            head = head.next;
            temp.next = null;
            head.prev = null;

            return head;
        }

        Node curr = head;

        while(--position>0)
        {
            curr = curr.next;
        }

        if(curr.next == null)
        {
            curr.prev.next = null;
            curr.prev = null;

            return head;
        }


        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;

        curr.next = null;
        curr.prev = null;

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
                temp.prev = curr;
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
    Node prev;

    Node(int val)
    {
        this.data = val;
        this.next = null;
        this.prev = null;
    }
}