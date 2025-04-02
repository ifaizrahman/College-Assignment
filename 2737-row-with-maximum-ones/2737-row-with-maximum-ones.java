class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int ans=0;
        int[] arr=new int[2];
       

        for(int i=0;i<r;i++){
            int count=0;
            for(int j=0;j<c;j++){
                if(mat[i][j]==1){
                    count++;
                }
               if(count>ans){
                ans=count;
                arr[0]=i;
                arr[1]=ans;
               }
            }
        }
       return arr;
    }
}