class Solution {
    public int findClosestNumber(int[] nums) {
        int close=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if ((Math.abs(close) > Math.abs(nums[i])) || (Math.abs(nums[i]) == Math.abs(close) && nums[i] > close) ) {
            close=nums[i];
            }
        }
        return close;
    }
}