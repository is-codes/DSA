package DSA;

public class sumofleftleaves {
    
    public int sumOfLeftLeaves(TreeNode root) {

        return sum(root,'r');
    }

    private int sum(TreeNode node , char ch){
        if(node ==null)
        return 0;

        if(node.left==null && node.right==null){
            return (ch=='r')? 0: node.val;
        }

        int sum =sum(node.left ,'l') + sum(node.right ,'r');
        return sum;
        
    }
