public class MyLinkedListWithAddingElementAtMiddle {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;

        Node head = null;

        // for optimized approach
        Node lastNode = null;

        for(int i=0;i<n;i++)
        {
            if(head == null)
            {
                head = new Node(arr[i]);
                lastNode = head;
            }
            else
            {
                Node temp = new Node(arr[i]);

                lastNode.next = temp;

                lastNode = temp;
            }

        }
        
        // linked list -  1-> 2-> 3-> 4 -> null
        // inserting new value after 2 nodes
        int value = 7;

        int k = 2;

        k = k-1;

        Node temp = head;

        while(k-->0)
        {
           temp = temp.next;
        }

        Node newNode = new Node(value);

        newNode.next = temp.next;

        temp.next = newNode;
        

        // printing linked List
        temp = head;
        while (temp !=null) {
            System.out.print(temp.data+" ");
            // System.out.println(temp.data+" -> "+temp.next);
            temp = temp.next;
        }
    }
}

class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node [data=" + data + ", next=" + next + "]";
    }

    
}

