public class DeleteNodeFromMiddle {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        Node head = new GenerateLinkedList().generate(arr);
        // head = null;

        int k = 2;

        head = deleteNodeFromMiddle(head,k);

        Node temp = head;

        System.out.println("Updated Linked List: ");
        while (temp !=null) {
            System.out.print(temp.data+" ");
            // System.out.println(temp.data+" -> "+temp.next);
            temp = temp.next;
        }
        System.out.println();


    }


    // with loops 

    public static Node deleteNodeFromMiddle(Node head,int k)
    {
        if(head != null)
        {
            if(head.next==null)
            {
                head = null;
                return head;
            }
            else
            {
                 Node prev = null;
                 Node curr = head;

                 while(k-->1)
                 {
                    prev = curr;
                    curr = curr.next;
                 }

                 prev.next = curr.next;
                 curr.next = null;

                 return head;
            }
            
        }

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





