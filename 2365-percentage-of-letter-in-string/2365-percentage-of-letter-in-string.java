class Solution {
    public int percentageLetter(String s, char letter) {
        int countl=0 , countt=0;
        for(int i=0;i<s.length();i++){
            countt++;
            if(s.charAt(i)==letter){
                countl++;
            }
        }

        int ans=(countl*100)/countt;
        
        return ans;
    }
}