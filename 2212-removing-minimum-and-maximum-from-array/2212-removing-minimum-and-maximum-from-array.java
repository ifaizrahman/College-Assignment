class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;

        int max=Integer.MIN_VALUE;
        int maxIndex=0;
        int min=Integer.MAX_VALUE;
        int minIndex=0;

        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }

            if(nums[i]<min){
                min=nums[i];
                minIndex=i;
            }
        }

        int ff=Math.max(minIndex,maxIndex)+1;
        int fb=n - Math.min(minIndex,maxIndex);
        int ffb=Math.min(minIndex,maxIndex)+1 + (n - Math.max(minIndex,maxIndex));

        int ans = Math.min(ff, Math.min(fb, ffb));


        return ans;
    }
}