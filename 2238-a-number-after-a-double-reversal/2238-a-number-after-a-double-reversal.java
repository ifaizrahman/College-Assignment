class Solution {
    public boolean isSameAfterReversals(int num) {
       
        if(num==0) return true;
        int x=reverse(num);

        if(x%10==0 || num %10==0) return false;

        return true;
    }


    public int reverse(int x) {
        int reverseNumber = 0;
        while (x != 0) {

            if((reverseNumber>Integer.MAX_VALUE/10) || (reverseNumber<Integer.MIN_VALUE/10)) return 0;

            reverseNumber = reverseNumber * 10 + x % 10;
            x /= 10;
        }
         return reverseNumber;
}
}