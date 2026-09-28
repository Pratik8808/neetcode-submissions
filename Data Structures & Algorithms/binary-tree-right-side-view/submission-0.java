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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> s1=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();

   
       
        if(root ==null)
        {
            return s1;
        }
         q.add(root);

        while(!q.isEmpty())
        {
            int size=q.size();
            
            for(int i=0;i<size;i++)
            {
                TreeNode temp2=q.remove();

                if(temp2.left!=null)
                {
                    q.add(temp2.left);
                }
                if(temp2.right!=null)
                {
                    q.add(temp2.right);
                }
                if(i==size-1)
                {
                    s1.add(temp2.val);
                }

            }



        }

        return s1;
        
    }
}
