class Solution {
    boolean isPalindrome(String s) {
        // code here
        int l=s.length();
        int start=0;
        int end=l-1;
        
        while(start<end){
            if(s.charAt(start) != s.charAt(end) ) return false;
            
            else{
                start++;
                end--;
            }
        }
        
        
        return true;
    }
}