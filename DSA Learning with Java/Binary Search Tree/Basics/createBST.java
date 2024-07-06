public class createBST {

    public static void main(String[] args) {
        int[] values = {4,2,7,9,5,6,10,45,23,8};

        Node root = null;
        for(int val : values)
        {
            root = createBinarySearchTree(val,root);
        }
        
        inOrder(root);
        

    }

    public static void inOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        
        inOrder(root.left);

        System.out.print(root.data+" ");

        inOrder(root.right);
    }

    public static Node createBinarySearchTree(int val, Node root )
    {
        if(root == null)
        {
            Node node = new Node(val);
            return node;
        }
 

        if(val < root.data)
        {
            root.left = createBinarySearchTree(val, root.left);
        }
        else
        {
            root.right = createBinarySearchTree(val, root.right);
        }

        return root;
        
    }
}



/**
 * Node
 */
class Node {

    int data;
    Node right;
    Node left;

    Node(int data)
    {
        this.data = data;
    }
    
}