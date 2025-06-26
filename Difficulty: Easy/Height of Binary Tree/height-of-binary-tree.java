

// User function Template for Java

/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    // Function to find the height of a binary tree.
    int height(Node node) {
        // If the node is null, the height is -1 (since there are no edges in an empty tree).
        if (node == null) {
            return -1;
        }

        // Recursively find the height of the left and right subtrees.
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Return the maximum of the left and right subtree heights, plus 1 for the current edge.
        return Math.max(leftHeight, rightHeight) + 1;
    }
}