public class DoublyLinkedListAddingNodeAtStart {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        Node head = null;

        head = generateDoublyLinkedList(arr, head);

        Node temp = head;

        System.out.println("Generated LinkedList By Adding Node at Start : ");

        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();


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
                Node temp = new Node(arr[i]);
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
        }

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