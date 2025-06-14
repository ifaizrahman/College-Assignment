class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> arr=new ArrayList<>();

        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        for(int i=1;i<=n;i++){
            if(!set.contains(i))
            arr.add(i);
        }
        return arr;
    }
}