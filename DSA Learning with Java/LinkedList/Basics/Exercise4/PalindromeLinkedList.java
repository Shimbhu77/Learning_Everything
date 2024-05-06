public class PalindromeLinkedList {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};

        ListNode head = new GenerateLinkedList().generate(arr);

        // normal reverse
        boolean ans = palindromeLinkedList(head);
      
        System.out.println("Palindrome : "+ans);
    }

    public static boolean palindromeLinkedList(ListNode head)
    {
        // calculate size of linkedlist

        int size = 0;
        ListNode temp = head;

        while (temp!=null)
        {
            size++;
            temp = temp.next;
        } 

        // making half size linked list

        size /=2;

        ListNode prev = null;
        ListNode curr = head;
// breaking linked list
        while(size-->0)
        {
            prev = curr;
            curr = curr.next;
        }

        prev.next = null;

        // reverse the second linked list 

        prev = null;
        ListNode fut = null;

        while (curr!=null) {
            fut = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fut;
        }

        // compare the both linked list values

        ListNode head1 = head;
        ListNode head2 = prev;

        while(head1!=null)
        {
            if(head1.val != head2.val)
            {
                return false;
            }

            head1 = head1.next;
            head2 = head2.next;
        }

        return true;
    }
}



class GenerateLinkedList {
    
    private ListNode createLinkedList(int[] arr,int n,int idx)
    {
        if(idx == n)
        {
            return null;
        }
        
        ListNode temp = new ListNode(arr[idx]);

        temp.next = createLinkedList(arr, n, idx+1);

        return temp;
    }

    public ListNode generate(int[] arr) {
        // int[] arr = {1,2,3,4};
        int n = arr.length;

        ListNode head = null;

        head = createLinkedList(arr, n, 0);
        
        
        ListNode temp = head;
        System.out.println("Generated Linked List: ");
        while (temp !=null) {
            System.out.print(temp.val+" ");
            // System.out.println(temp.val+" -> "+temp.next);
            temp = temp.next;
        }
        System.out.println();

        return head;
    }
}

 class ListNode {
    int val;
    ListNode next; 

    ListNode(int val)
    {
        this.val = val;
    }
}



