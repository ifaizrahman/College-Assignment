class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;

        int top=0;
        int bottom=r-1;

        while(top<=bottom){
            int mid=top+(bottom-top)/2;

            if(matrix[mid][0]<target && matrix[mid][c-1]>target){
                break;
                }

            if(matrix[mid][0]>target){
                bottom=mid-1;
            }
            else{
                top=mid+1;
            }
            

            
        }

        int col=(top+bottom)/2;

        int left=0;
        int right=c-1;

        while(left<=right) {
            int mid=left+(right-left)/2;

            if(matrix[col][mid]==target){
                return true;
            }

            else if(matrix[col][mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
}
}