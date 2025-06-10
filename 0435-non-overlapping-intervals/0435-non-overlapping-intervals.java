class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

       int n = intervals.length;

       //sort according to the end time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int l = 0;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (intervals[i][0] >= intervals[l][1]) {
                l = i; //track of last overlapping interval
                count++;
            }
        }
        //count are the number of non overlapping intervals 
        //so subtracting it fri=om total interval gives overlapping to  be removed
        return n - count;
    } 
    
}