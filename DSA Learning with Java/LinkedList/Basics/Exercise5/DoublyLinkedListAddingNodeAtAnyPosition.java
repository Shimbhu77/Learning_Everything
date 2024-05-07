public class DoublyLinkedListAddingNodeAtAnyPosition {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        Node head = null;

        head = generateDoublyLinkedList(arr, head);

        int position = 4;

        head = insertNodeAtAnyPosition(head, position, 5);

        Node temp = head;

        System.out.println("Updated LinkedList : ");

        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();


    }

    public static Node insertNodeAtAnyPosition(Node head, int position,int val)
    {
        // linked list not exist
        if(head == null)
        {
            head = new Node(val);
            return head;
        }
        else
        {
            // at first position = 0

            if(position == 0)
            {
                Node temp  = new Node(val);
                temp.next = head;
                head.prev = temp;

                head = temp;
                return head;
            }
            // at last position 
            Node curr = head;
            while(--position>0)
            {
                curr = curr.next;
            }

            if(curr.next == null)
            {
                Node temp = new Node(val);
                temp.prev = curr;
                curr.next = temp;

                return head;
            }
            else
            {
                Node temp = new Node(val);
                
                temp.next = curr.next;
                curr.next.prev = temp;
                curr.next = temp;
                temp.prev = curr;

                return head;

            }
            // at any other position
        }
        // linked list exist
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