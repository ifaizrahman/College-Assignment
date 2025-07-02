class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        ArrayList<Integer> arr = new ArrayList<>();
        int a = 0;
        int b = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr.add(grid[i][j]);
            }
        }

        int n = rows * cols;
        int[] freq = new int[n + 1];

        for (int num : arr) {
            freq[num]++;
        }

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0)
                b = i;
            else if (freq[i] == 2)
                a = i;
        }

        return new int[] { a, b };
    }
}
