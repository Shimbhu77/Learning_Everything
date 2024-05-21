import java.util.*;

public class NStack {
    int[] arr;
    Node[] stacks;
    Stack<Integer> emptyIndexs = new Stack<>();

    public NStack(int N, int S) {
        arr = new int[S];
        stacks = new Node[N];

        for (int i = S - 1; i >= 0; i--) {
            emptyIndexs.push(i);
        }
    }

    // Pushes 'X' into the Mth stack. Returns true if it gets pushed into the stack, and false otherwise.
    public boolean push(int x, int m) {
        if (emptyIndexs.isEmpty()) {
            return false;
        } else {
            int index = emptyIndexs.pop();
            System.out.println("Pushing element " + x + " at index " + index + " in stack " + m);

            arr[index] = x;

            if (stacks[m - 1] == null) {
                stacks[m - 1] = new Node(index);
            } else {
                Node temp = new Node(index);
                temp.next = stacks[m - 1];
                stacks[m - 1] = temp;
            }

            return true;
        }
    }

    // Pops top element from Mth Stack. Returns -1 if the stack is empty, otherwise returns the popped element.
    public int pop(int m) {
        if (stacks[m - 1] == null) {
            return -1;
        } else {
            int index = stacks[m - 1].index;
            int element = arr[index];
            System.out.println("Popping element " + element + " from index " + index + " in stack " + m);

            stacks[m - 1] = stacks[m - 1].next;
            emptyIndexs.push(index);

            return element;
        }
    }

    class Node {
        int index;
        Node next;

        Node(int index) {
            this.index = index;
        }
    }

    public static void main(String[] args) {
        // Test the NStack class with various operations to ensure it works correctly
        NStack nstack = new NStack(3, 6);
        
        System.out.println(nstack.push(10, 1)); // true
        System.out.println(nstack.push(20, 1)); // true
        System.out.println(nstack.push(30, 2)); // true
        System.out.println(nstack.push(40, 2)); // true
        System.out.println(nstack.push(50, 3)); // true
        System.out.println(nstack.push(60, 3)); // true
        System.out.println(nstack.push(70, 3)); // false, should print stack overflow message

        System.out.println(nstack.pop(1)); // 20
        System.out.println(nstack.pop(1)); // 10
        System.out.println(nstack.pop(2)); // 40
        System.out.println(nstack.pop(2)); // 30
        System.out.println(nstack.pop(3)); // 60
        System.out.println(nstack.pop(3)); // 50
        System.out.println(nstack.pop(3)); // -1, stack is empty
    }
}
