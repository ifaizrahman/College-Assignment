class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        int[][] new_mat= new int[m][n];
        for(int i = 0; i< m; i++){
        for (int j = 0; j < n; j++){
            new_mat[i][j] = matrix[i][j];
        }
       }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    zeroes(i,j,new_mat);
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=new_mat[i][j];
            }
        }

    }


    private static void zeroes(int i,int j, int[][] mat){
        int m=mat.length;
        int n=mat[0].length;
        
        for(int k=0;k<n;k++){
            mat[i][k]=0;
        }
        for(int k=0;k<m;k++){
            mat[k][j]=0;
        }
    }


}