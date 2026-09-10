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
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
        {
            return root;
        }
        TreeNode head=root;
        Queue<TreeNode> q1=new LinkedList<>();
        q1.add(root);

        while(!q1.isEmpty())
        {
            TreeNode node=q1.remove();

            TreeNode temp=node.left;
            node.left=node.right;
            node.right=temp;

            if(node.left!=null)
            {
                q1.add(node.left);
            }
            if(node.right!=null)
            {
                q1.add(node.right);
            }
        }

        return head;
       
    }
}
