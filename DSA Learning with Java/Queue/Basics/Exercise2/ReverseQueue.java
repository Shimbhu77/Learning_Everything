import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        queue.offer(5);
        queue.offer(4);
        queue.offer(3);
        queue.offer(2);
        queue.offer(1);

        while(!queue.isEmpty())
        {
            st.push(queue.poll());
        }

        while (!st.isEmpty()) {
            queue.offer(st.pop());
        }

        System.out.println(queue);
    }
}
