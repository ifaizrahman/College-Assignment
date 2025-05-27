class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int maxjump=0;
        int i=0;

        while(i<n){
        if(i>maxjump){
            return false;
        }
        else{
            maxjump=Math.max(maxjump,nums[i]+i);
            i++;
        }
        }
        return true;
    }
}