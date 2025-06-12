class Solution {
    public int findMinArrowShots(int[][] points) {
         int n = points.length;

        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int l = 0;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (points[i][0] > points[l][1]) {
                l = i; 
                count++;
            }
        }
        //count are the number of non overlapping intervals 
        //so subtracting it fri=om total interval gives overlapping to  be removed
        return count;
    }
}