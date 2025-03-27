class Solution {
    public int mySqrt(int x) {
        if(x==0 || x == 1){
            return x;
        }
        long s=0;
        long e=x/2;
        long ans=0;

        while(s<=e){
            long mid=s+(e-s)/2;

            if(mid*mid==x){
                return (int)mid;
            }
            if(mid*mid<x){
                s=mid+1;
                ans=mid;
            }
            else{
                e = mid-1;
            }
            
        }
        return (int)ans;
    }

}