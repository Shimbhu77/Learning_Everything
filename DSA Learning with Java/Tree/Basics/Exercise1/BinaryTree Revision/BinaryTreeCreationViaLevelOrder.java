import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class BinaryTreeCreationViaLevelOrder
{
    public static void main(String[] args) {

        Queue<Node> q = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the root value : ");

        int rootValue = sc.nextInt();

        Node root = new Node(rootValue);

        q.offer(root);

        while (!q.isEmpty()) {

            Node temp = q.poll();

            System.out.println("Enter the left child of "+temp.data+" : ");

            int leftChild = sc.nextInt();

            if(leftChild != -1)
            {
                temp.left = new Node(leftChild);
                q.offer(temp.left);
            }

            System.out.println("Enter the right child of "+temp.data+" : ");
            
            int rightChild = sc.nextInt();

            if(rightChild != -1)
            {
                temp.right = new Node(rightChild);
                q.offer(temp.right);
            }
        }
    }
    
}    

class Node {

    int data;
    Node left;
    Node right;

    public Node( int value)
    {
        this.data = value;
        this.left = null;
        this.right = null;
    }
}