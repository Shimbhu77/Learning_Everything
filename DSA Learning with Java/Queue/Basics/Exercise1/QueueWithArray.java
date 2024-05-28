// interface Queue {
//     public void offer(int t);
//     public int poll();
//     public int peek();
//     public int size();
//     public boolean isEmpty();
//     public boolean isFull();
// }

public class QueueWithArray // implements Queue 
{
    public static void main(String[] args) {
        
        Queue queue = new Queue(5);

        System.out.println("queue is empty "+queue.isEmpty());
        
        System.out.println("queue is full "+queue.isFull());
  
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
    }





}

/**
 * Queue
 */
class Queue {

    int front;
    int rear;
    int[] arr;
    int length;
    
    Queue(int n)
    {
       front = -1;
       rear = -1;
       arr = new int[n];
       length = n;
    }

    public boolean isEmpty()
    {
        if(rear == -1 && front == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isFull()
    {
        if(rear == length-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void offer(int x)
    {
        if(isFull())
        {
            System.out.println("Queue is Full.");
        }
        else
        {
            if(isEmpty())
            {
                rear = 0;
                front = 0;
                arr[rear] = x;
    
                System.out.println("Element "+x+" is added into the queue.");
            }
            else
            {
                rear = rear+1;
                arr[rear] = x;
    
                System.out.println("Element "+x+" is added into the queue.");
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
            int el = arr[front];
            front = front+1;

            System.out.println("Element "+el+" is removed from the queue.");
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
            int el = arr[front];
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
            int size = rear - front + 1;
            System.out.println("Queue size is "+size+".");
            return size;
        }
    }

}
