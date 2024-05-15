import java.util.Arrays;

public class MainWithArrayStack{
    public static void main(String[] args) {
        StackWithArray stack = new StackWithArray(5);

        System.out.println("is stack empty : "+stack.isEmpty());
        System.out.println("size of stack is : "+stack.size());
        
        stack.push(3);
        stack.push(4);
        stack.push(1);
        stack.push(9);

        System.out.println("peek element is "+stack.peek());
        stack.pop();
        System.out.println("peek element is "+stack.peek());
        stack.pop();
        System.out.println("size of stack is : "+stack.size());
        System.out.println("is stack empty : "+stack.isEmpty());
    }
}


 class StackWithArray {
    int[] arr ;
    int top = -1 ;
    int size;

    StackWithArray(int size)
    {
        this.size = size;
        arr = new int[size];
    }

    public void push(int val)
    {
        if(top == arr.length-1)
        {
            System.out.println("stack over flow");
        }
        else
        {
            top++;
            arr[top] = val;

            System.out.println("value "+val+" is pushed into the stack");
            System.out.println(Arrays.toString(arr));
        }
    }

    public int pop()
    {
        if(top == -1)
        {
            System.out.println("stack under flow");
            return -1;
        }
        else
        {
            int val = arr[top];
            arr[top]=0;
            top--;

            System.out.println(Arrays.toString(arr));

            return val;
        }
    }

    public int peek()
    {
        if(top == -1)
        {
            System.out.println("stack under flow");
            return -1;
        }
        else
        {
            System.out.println(Arrays.toString(arr));
            return arr[top];
        }
    }

    public boolean isEmpty()
    {
        if(top == -1)
        {
            System.out.println("stack is empty");
            return true;
        }
        else
        {
            System.out.println("stack is not empty");
            return false;
        }
    }

    public int size()
    {
        return top+1;
    }
}
