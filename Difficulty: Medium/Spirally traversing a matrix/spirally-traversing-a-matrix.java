//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            int matrix[][] = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
       int m=mat.length ;
        int n=mat[0].length;
        
        int top=0;
        int bottom=m-1;
        
        int left=0;
        int right=n-1;

        ArrayList<Integer> ans= new ArrayList<>();

        while(ans.size()<m*n){
            for(int i=left;i<=right && ans.size() < m * n;i++){
                ans.add(mat[top][i]);
            }

            for(int i=top+1;i<=bottom-1 && ans.size() < m * n;i++){
                ans.add(mat[i][right]);
            }

            for(int i=right;i>=left && ans.size() < m * n;i--){
                ans.add(mat[bottom][i]);
            }

            for(int i=bottom-1;i>=top+1 && ans.size() < m * n;i--){
                ans.add(mat[i][left]);
            }

            top++;
            bottom--;
            left++;
            right--;



        }
        return ans;
    }
}
