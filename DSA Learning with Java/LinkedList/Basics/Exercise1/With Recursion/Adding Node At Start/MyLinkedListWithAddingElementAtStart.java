public class MyLinkedListWithAddingElementAtStart {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;

        Node head = null;

        head = createLinkedList(arr, n, 0, null);
        
        
        Node temp = head;
        while (temp !=null) {
            System.out.print(temp.data+" ");
            // System.out.println(temp.data+" -> "+temp.next);
            temp = temp.next;
        }
    }

    public static Node createLinkedList(int[] arr,int n,int idx,Node prev)
    {
        if(idx == n)
        {
            return prev;
        }
        
        Node temp = new Node(arr[idx]);

        temp.next = prev;

        prev = temp;
        
        return createLinkedList(arr, n, idx+1,prev); 
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

