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
    public void inOrderTraversal(TreeNode root, ArrayList<Integer> arr){
        if(root == null)    return;
        
       
        inOrderTraversal(root.left, arr);
        arr.add(root.val);
        inOrderTraversal(root.right, arr);      
    }

    int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr=new ArrayList<>();;
        inOrderTraversal(root, arr);
        return arr.get(k - 1);
    }

}