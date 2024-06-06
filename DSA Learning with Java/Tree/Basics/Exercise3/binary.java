
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        return uniValueTree(root,root.val);
    }


    public boolean uniValueTree(TreeNode root, int value)
    {
        if(root == null)
        {
            return true;
        }

        if(value != root.val)
        {
            return false;
        }

        return uniValueTree(root.left, value) && uniValueTree(root.right,value);
    }
}