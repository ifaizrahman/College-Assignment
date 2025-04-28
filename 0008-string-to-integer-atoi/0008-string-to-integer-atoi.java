class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int sign = 1;
        int i = 0;
        long ans = 0; 

        for (int j = 0; j < n; j++) {
            if (s.charAt(j) != ' ') {
                break;
            } else {
                i++;
            }
        }

        if (i < n && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < n && s.charAt(i) == '+') {
            sign = 1;
            i++;
        }

        for (; i < n; ++i) {
            if (Character.isDigit(s.charAt(i))) {
                ans = ans * 10 + (s.charAt(i) - '0');
                if (ans * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (ans * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            } else {
                break;
            }
        }

        ans = ans * sign;
        return (int) ans; 
    }
}
