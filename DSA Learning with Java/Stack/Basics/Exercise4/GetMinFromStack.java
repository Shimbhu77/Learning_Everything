import java.util.Stack;

public class GetMinFromStack {

    static Stack<Integer> st1 = new Stack<>();
    static Stack<Integer> st2 = new Stack<>();
    public static void main(String[] args) {
        
        push(5);
        push(4);
        push(7);
        push(2);
        push(1);
        push(9);

        System.out.println(pop());
        System.out.println(getMin());
        System.out.println(pop());
        System.out.println(getMin());
        System.out.println(pop());
        System.out.println(getMin());
        System.out.println(pop());
        System.out.println(getMin());
    }

    private static void push(int x )
    {
        if(st1.isEmpty())
        {
            st1.push(x);
            st2.push(x);
        }
        else
        {
            st1.push(x);
            st2.push(Math.min(x, st2.peek()));
        }
    }

    private static int pop()
    {
        if(st1.isEmpty())
        {
            return -1;
        }
        else
        {
            st2.pop();
            return st1.pop();
        }
    }

    private static int getMin()
    {
        if(st1.isEmpty())
        {
            return -1;
        }
        else
        {
            return st2.peek();
        }
    }
}