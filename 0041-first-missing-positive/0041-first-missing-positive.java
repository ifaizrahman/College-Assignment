class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;

        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        for(int i=1;i<=n+1;i++){
            if(!set.contains(i))
            return i;
        }
        return 0;
    }
}