class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
    
    public void transpose(int[][] mat){
        int r=mat.length;
        int c=mat[0].length;
        for(int i=0;i<r;i++){
            for(int j=i+1;j<c;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
                
            }
        }
    }


    public void reverse(int[][] mat){
    
        
            for(int i=0;i<mat[0].length;i++){
               int start=0;
               int end=mat.length-1;

                while(start<end){
                int temp=mat[i][end];
                mat[i][end]=mat[i][start];
                mat[i][start]=temp;
                start++;
                end--;
            }
        }
    }


}