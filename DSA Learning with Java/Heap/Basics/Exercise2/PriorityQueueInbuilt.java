import java.util.PriorityQueue;

public class PriorityQueueInbuilt {
    public static void main(String[] args) {

        // default is min-heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(4);
        pq.add(34);
        pq.add(78);
        pq.add(3);

        while (!pq.isEmpty()) {
            System.out.print(pq.poll()+" ");
        }
        
    }
}
