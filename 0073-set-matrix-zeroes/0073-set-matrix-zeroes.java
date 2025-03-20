class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int x=Integer.MIN_VALUE-5;
        
       

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    ones(i,j,matrix);
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]== x){
                   matrix[i][j]=0; 
                }
            }
        }

    }


    private static void ones(int i,int j, int[][] mat){
        int m=mat.length;
        int n=mat[0].length;
        int x=Integer.MIN_VALUE-5;
        
        for(int k=0;k<n;k++){
            if(mat[i][k] !=0){
            mat[i][k]=x;
            }
        }
        for(int k=0;k<m;k++){
            if(mat[k][j] !=0){
            mat[k][j]=x;
            }
        }
    }


}