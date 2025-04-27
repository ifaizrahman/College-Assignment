class Solution {
    public int maxScore(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        reverseArray(nums);
        long[] prefix=new long[n];
        int count=0;

        prefix[0]=nums[0];

        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
            
        }
        for(int i=0;i<n;i++){
            if(prefix[i]>0){
                count++;
            }
            else{
                break;
            }
        }
        
        return count;
    }

     public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
}
}