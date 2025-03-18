class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length ;
        int n=matrix[0].length;
        
        int top=0;
        int bottom=m-1;
        
        int left=0;
        int right=n-1;

        ArrayList<Integer> ans= new ArrayList<>();

        while(ans.size()<m*n){
            for(int i=left;i<=right && ans.size() < m * n;i++){
                ans.add(matrix[top][i]);
            }

            for(int i=top+1;i<=bottom-1 && ans.size() < m * n;i++){
                ans.add(matrix[i][right]);
            }

            for(int i=right;i>=left && ans.size() < m * n;i--){
                ans.add(matrix[bottom][i]);
            }

            for(int i=bottom-1;i>=top+1 && ans.size() < m * n;i--){
                ans.add(matrix[i][left]);
            }

            top++;
            bottom--;
            left++;
            right--;



        }
        return ans;
    }
}