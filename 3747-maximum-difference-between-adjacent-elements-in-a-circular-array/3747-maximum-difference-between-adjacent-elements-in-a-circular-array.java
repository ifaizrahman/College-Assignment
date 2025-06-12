class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int diff=Math.abs(nums[i]-nums[i+1]);
            max=Math.max(max,diff);
        }
        if(Math.abs(nums[nums.length-1]-nums[0]) >max){
            max=Math.abs(nums[nums.length-1]-nums[0]);
        }

        return max;
    }
}