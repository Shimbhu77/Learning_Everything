import java.util.*;

public class BinaryTree {
    public static void main(String[] args) {
        
        Queue<Node> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Root Node Element:");
        int x = sc.nextInt();
        Node root = new Node(x);
        q.offer(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();

            System.out.println("Enter the " + temp.data + " left child (enter -1 for no child): ");
            int first = sc.nextInt();

            if (first != -1) {
                temp.left = new Node(first);
                q.offer(temp.left);
            }

            System.out.println("Enter the " + temp.data + " right child (enter -1 for no child): ");
            int second = sc.nextInt();

            if (second != -1) {
                temp.right = new Node(second);
                q.offer(temp.right);
            }
        }

        // Closing the scanner object
        sc.close();
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
