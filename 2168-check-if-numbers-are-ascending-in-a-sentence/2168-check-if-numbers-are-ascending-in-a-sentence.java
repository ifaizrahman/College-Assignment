class Solution {
    public boolean areNumbersAscending(String s) {
        int curr = 0; int prev = 0;

        for(int i=0;i<s.length();i++){  
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                curr = s.charAt(i) - '0';
                while(i+1<s.length() && s.charAt(i+1) >= '0' && s.charAt(i+1)<='9'){
                    curr = (curr*10)+ (s.charAt(i+1)-'0');
                    i++;
                }if(curr<=prev) return false;
            }
            prev = curr;
        }
        
        return true;
    }
}