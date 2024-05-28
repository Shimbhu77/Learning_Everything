import java.util.*;

public class PreOrderTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Node root = binaryTree(sc);
        
        System.out.println(root);

        List<Integer> ans = preOrder(root, new ArrayList<Integer>());
        System.out.println("pre order : "+ans);

        List<Integer> ans1 = inOrder(root, new ArrayList<Integer>());
        System.out.println("in order : "+ans1);

        List<Integer> ans2 = postOrder(root, new ArrayList<Integer>());
        System.out.println("post order : "+ans2);


    }

    public static List<Integer> preOrder(Node root, List<Integer> ans) {
        
        if(root == null)
        {
            return ans;
        }

        ans.add(root.data);

        preOrder(root.left, ans);

        preOrder(root.right, ans);

        return ans;
    }

    public static List<Integer> postOrder(Node root, List<Integer> ans) {
        
        if(root == null)
        {
            return ans;
        }

        postOrder(root.left, ans);
        
        postOrder(root.right, ans);
        
        ans.add(root.data);
        
        return ans;
    }

    public static List<Integer> inOrder(Node root, List<Integer> ans) {
        
        if(root == null)
        {
            return ans;
        }

        inOrder(root.left, ans);
        
        ans.add(root.data);

        inOrder(root.right, ans);

        return ans;
    }

    public static List<Integer> levelOrder(Node root, List<Integer> ans) {
        
        if(root == null)
        {
            return ans;
        }

        levelOrder(root.left, ans);
        
        ans.add(root.data);

        levelOrder(root.right, ans);

        return ans;
    }

    public static Node binaryTree(Scanner sc)
    {
        // System.out.println("Enter the node element : ");
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
