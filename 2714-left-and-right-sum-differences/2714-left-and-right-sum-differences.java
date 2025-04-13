class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int rightSum[] = new int[n];
        int[] diff = new int[n];

        // calculate leftsum
        leftSum[0] = 0; // no element in left
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }
        // calulate right sum
        rightSum[n - 1] = 0; // no element in right
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1]; // because we dont need to include curr element into the both left and right sum
        }

        // calc abs diff between left and right sum
        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return diff;

    }
}