class Solution {
    public int divide(int dividend, int divisor) {
       if (dividend == Integer.MIN_VALUE && divisor == -1) {
        return Integer.MAX_VALUE; // Avoid overflow
    }

    // Convert to long to avoid overflow during abs operation
    long divi = Math.abs((long) dividend);
    long div = Math.abs((long) divisor);

    // Perform binary search to find the quotient
    int result = (int) binarySearch(divi, div);

    // Determine the sign of the result
    if ((dividend < 0) ^ (divisor < 0)) {
        result = -result;
    }

    return result;
    }
    private long binarySearch(long dividend, long divisor){
        long s  = 0;
        long e = Math.abs(dividend);
        long ans = 0;

        while(s <= e){
            long mid = s + (e - s) / 2;
            long num = divisor * mid;
            if(num == dividend){
                ans = mid;
                break;
            }
            if(num > dividend){
                e  = mid -1;
            }else{
                ans = mid;
                s = mid + 1;
            }            
        }               
        return ans;
    }
}