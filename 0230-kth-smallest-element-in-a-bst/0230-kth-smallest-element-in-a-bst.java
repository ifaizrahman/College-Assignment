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
    public void preOrderTraversal(TreeNode root, ArrayList<Integer> arr){
        if(root == null)    return;
        
       
        arr.add(root.val);
        preOrderTraversal(root.left, arr);
        preOrderTraversal(root.right, arr);      
    }

    int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr=new ArrayList<>();;
        preOrderTraversal(root, arr);
        Collections.sort(arr);
        return arr.get(k - 1);
    }

}