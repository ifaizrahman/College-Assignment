class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int tsum=0;
        for(int i=1;i<=nums.length;i++){
            tsum+=i;
        }
        return tsum-sum;
    }
}