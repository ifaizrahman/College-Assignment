class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int count = 0;
        int maxsubarray = 0;
        for(int i=1;i<n-1;i++) {
            if(arr[i - 1] < arr[i] && arr[i] > arr[i+1] ) {
               count=1;
                int j=i;

                while(j>0){
                    if(arr[j]> arr[j-1]){
                     count++;
                     j--;
                    }
                    else{
                        break;
                    }
                }

                int k=i;

                while(k<n-1){
                    if(arr[k]>arr[k+1]){
                        count++;
                        k++;
                    }
                    else{
                        break;
                    }
                }
                
            }

            maxsubarray = Math.max(maxsubarray, count);
            count = 0;
        }

        return maxsubarray;
    }
}