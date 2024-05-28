import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrintQueueElement {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // Queue<Integer> queue = new ArrayDeque<>();
        // Queue<Integer> queue = new PriorityQueue<>(); // can not use here because it sort the elements

        queue.offer(5);
        queue.offer(4);
        queue.offer(3);
        queue.offer(2);
        queue.offer(1);

        int size = queue.size();

        while(size-->0)
        {
            int el = queue.poll();
            System.out.print(el+" ");
            queue.offer(el);
        }

        System.out.println();

        System.out.println(queue.size());
    }
}
