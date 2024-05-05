public class MyLinkedListWithAddingElementAtStart {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;

        Node head = null;

        for(int i=0;i<n;i++)
        {
            if(head == null)
            {
                head = new Node(arr[i]);
            }
            else
            {
                Node temp = new Node(arr[i]);
                temp.next = head;
                head = temp;
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

