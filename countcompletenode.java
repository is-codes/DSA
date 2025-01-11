package DSA;



public class countcompletenode {
    public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
            TreeNode() {}
            TreeNode(int val) { this.val = val; }
            TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
            }
        
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1+countNodes(root.right)+countNodes(root.left);
    }
}
}