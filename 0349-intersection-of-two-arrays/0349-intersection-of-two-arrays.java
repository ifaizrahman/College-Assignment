class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> arr=new ArrayList<>();
        HashSet<Integer> hash1=new HashSet<>();
        HashSet<Integer> hash2=new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            hash1.add(nums1[i]);
        }

         for(int i=0;i<nums2.length;i++){
            if(hash1.contains(nums2[i])){
                hash2.add(nums2[i]);
            }
         }

        int[] nums = new int[hash2.size()];
         int i = 0;
         for (int val : hash2) {
            nums[i] = val;
            i++;
         }

        return nums;
    }
}