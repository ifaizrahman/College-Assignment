class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                if (min > nums2[i])
                    min = nums2[i];
            }
        }

        if (min == Integer.MAX_VALUE)
            return -1;

        return min;
    }
}