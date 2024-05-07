public class DoublyLinkedListDeletingNodeAtLast {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        Node head = null;

        head = generateDoublyLinkedList(arr, head);

        head = deleteNodeAtLast(head);

        Node temp = head;

        System.out.println("Updated LinkedList : ");

        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();


    }

    public static Node deleteNodeAtLast(Node head)
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

        Node curr = head;

        while(curr.next != null)
        {
            curr = curr.next;
        }

        curr.prev.next = null;
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