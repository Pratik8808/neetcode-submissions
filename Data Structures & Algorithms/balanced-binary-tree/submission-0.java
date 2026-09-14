/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    boolean isBalance=true;
    public int result(TreeNode root)
    {
        if(root ==null)
        {
            return 0;
        }

        int left=1+result(root.left);
        int right=1+result(root.right);

        if(Math.abs(left -right)>1)
        {
            isBalance=false;
        }
        int max=Math.max(left,right);
        return  max;

    }

    public boolean isBalanced(TreeNode root) {
     
        result(root);


       return isBalance;


        
    }
}
