class Solution {
    public int maximumDifference(int[] nums) {
      
      int max = -1;
    int left = 0;
    int n = nums.length;
    
    for(int i = 0; i < n; i++){
        
        if(nums[i] > nums[left]){
            max = Math.max(max, nums[i] - nums[left]);
        }else{
            left = i;
        }

    }
    
    return max;

    }
}