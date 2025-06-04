class Solution {
    public String toLowerCase(String s) {
        int n = s.length();

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) <= 90 && sb.charAt(i) >= 65) {
                sb.setCharAt(i, (char) (sb.charAt(i) + 32));
            }
        }
        String ans = sb.toString();
        return ans;
    }
}