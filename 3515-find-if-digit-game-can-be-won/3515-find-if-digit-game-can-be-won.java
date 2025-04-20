class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1=0;
        int sum2=0;
        int totalsum=0;
         for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
         }
        for(int i=0;i<nums.length;i++){
            if(nums[i] < 10){
                sum1+=nums[i];
            }
            if(nums[i]>=10){
                sum2+=nums[i];
            }
            if(sum1>(totalsum-sum1) || sum2>(totalsum-sum2)){
                return true;
            }
        }
        return false;
    }
}