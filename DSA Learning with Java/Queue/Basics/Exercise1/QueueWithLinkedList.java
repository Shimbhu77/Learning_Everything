// interface Queue {
//     public void offer(int t);
//     public int poll();
//     public int peek();
//     public int size();
//     public boolean isEmpty();
//     public boolean isFull();
// }

public class QueueWithLinkedList // implements Queue 
{
    public static void main(String[] args) {
        
        Queue queue = new Queue();

        System.out.println("queue is empty : "+queue.isEmpty());
        
        // System.out.println("queue is full : "+queue.isFull());
  
        queue.offer(7);

        queue.offer(2);

        queue.offer(5);

        queue.size();

        queue.peek();

        queue.poll();

        queue.peek();

        queue.size();

        queue.poll();

        queue.peek();

        queue.size();

        queue.offer(4);

        queue.offer(6);

        queue.offer(1);

        System.out.println("queue is empty : "+queue.isEmpty());
        
        // System.out.println("queue is full : "+queue.isFull());

        queue.size();

        queue.offer(90);

        queue.offer(23);

        queue.offer(7);

        queue.size();
    }

}

class Node{
    int data;
    Node next;

    Node(int x)
    {
        data = x;
    }
}

/**
 * Queue
 */
class Queue {

    Node front;
    Node rear;
    int size;
    
    Queue()
    {
       front = null;
       rear = null;
       size = 0;
    }

    public boolean isEmpty()
    {
        if(rear == null && front == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @SuppressWarnings("unused")
    public boolean offer(int x)
    {
        Node temp = new Node(x);
        if(temp == null)
        {
            System.out.println("Queue is Full.");
            return false;
        }
        else
        {
            if(isEmpty())
            {
                front = temp;
                rear = front;
    
                System.out.println("Element "+x+" is added into the queue.");
                size++;
                return true;
            }
            else
            {
                rear.next = temp;
                rear = rear.next;
                System.out.println("Element "+x+" is added into the queue.");
                size++;
                return true;
            }
        }
    }

    public int poll()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty.");
            return -1;
        }
        else
        {
            Node temp = front;
            front = front.next;
            
            int el = temp.data;
            temp = null;

            System.out.println("Element "+el+" is removed from the queue.");

            size--;

            return el;
        }
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty.");
            return -1;
        }
        else
        {
            int el = front.data;
            System.out.println("Peek Element is "+el);
            return el;
        }
    }

    public int size()
    {
        if(isEmpty())
        {
            System.out.println("Queue size is 0.");
            return 0;
        }
        else
        {
            System.out.println("Queue size is "+size+".");
            return size;
        }
    }

}
