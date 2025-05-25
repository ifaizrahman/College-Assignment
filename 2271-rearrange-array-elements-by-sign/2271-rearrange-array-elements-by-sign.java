class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] temp1 = new int[n / 2];
        int[] temp2 = new int[n / 2];
        int n1 = 0;
        int n2 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                temp1[n1] = nums[i];
                n1++;
            } else if (nums[i] < 0) {
                temp2[n2] = nums[i];
                n2++;
            }
        }

        for (int i = 0; i < n / 2; i++) {
            nums[i * 2] = temp1[i];
            nums[i * 2 + 1] = temp2[i];
        }

        return nums;
    }
}