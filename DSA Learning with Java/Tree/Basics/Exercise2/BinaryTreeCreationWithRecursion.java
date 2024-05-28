import java.util.Scanner;

public class BinaryTreeCreationWithRecursion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Node root = binaryTree(sc);
        
        System.out.println(root);

    }

    public static Node binaryTree(Scanner sc)
    {
        System.out.println("Enter the node element : ");
        int val = sc.nextInt();

        if(val == -1)
        {
            return null;
        }

        Node node = new Node(val);

        System.out.println("Enter the left child element of "+val+" :");
        node.left = binaryTree(sc);

        System.out.println("Enter the right child element of "+val+" :");
        node.right = binaryTree(sc);

        return node;
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

    @Override
    public String toString() {
        return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
    }


}