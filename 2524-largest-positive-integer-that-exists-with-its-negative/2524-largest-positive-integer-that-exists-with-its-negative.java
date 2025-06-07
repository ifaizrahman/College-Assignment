class Solution {
    public int findMaxK(int[] nums) {
        int ans=-1;
        HashSet<Integer> set=new HashSet<>();
        int neg=-1;
        for(int num:nums){
                set.add(num);
                if(set.contains(num*neg)){
                    ans=Math.max(ans,Math.abs(num));
                }
        }
        return ans;
    }
}