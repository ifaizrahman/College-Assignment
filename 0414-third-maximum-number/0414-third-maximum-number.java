class Solution {
    public int thirdMax(int[] nums) {
int n=nums.length;
        int count=1;
        Arrays.sort(nums);

        if(n<3){
            return nums[n-1];
        }

        for(int i=n-1;i>0;i--){
            if(nums[i] != nums[i-1]){
                count++;
            }
            else{
                continue;
            }
            if(count==3){
                return nums[i-1];
            }
        }

        return nums[n-1]; 
    }

   
}