public class MyLinkedListWithAddingElementAtLast {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;

        Node head = null;

        // for optimized approach
        Node lastNode = null;

        for(int i=0;i<n;i++)
        {

            // Brute Force Approach
            // if(head == null)
            // {
            //     head = new Node(arr[i]);
            // }
            // else
            // {
            //     Node tail = head;

            //     while(tail.next != null)
            //     {
            //         tail = tail.next;
            //     }

            //     tail.next = new Node(arr[i]);
            // }

            // Optimized Approach

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
        
        Node temp = head;
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

