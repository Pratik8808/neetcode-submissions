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
    public void vaild(TreeNode root ,List<Integer> s1)
    {
        if(root==null)
        {
            return;
        }
        vaild(root.left ,s1);
        s1.add(root.val);
        vaild(root.right,s1);
    }

    public boolean isValidBST(TreeNode root) {
        List<Integer> s1=new ArrayList<>();
        vaild(root,s1);

        boolean postive=true;
        for(int  i=0;i<s1.size()-1;i++)
        {
            if(s1.get(i)>=s1.get(i+1))
            {
                postive=false;
                break;
            }

        }
        return postive;
    }
}
