class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;

        while (mid <= end) {
            if (nums[mid] == 0) {
                swap(mid, start, nums);
                start++;
                mid++;
            } else if (nums[mid] == 2) {
                swap(mid, end, nums);
                end--;
                
            } else {
                mid++;
            }
        }
    }

    private void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
