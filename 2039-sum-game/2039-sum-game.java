class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        int sumB=0;
        int countB=0;
        int sumA=0;
        int countA=0;

        for(int i=0;i<n/2;i++){
           char c = num.charAt(i);
            if (c != '?') {
                sumA += c - '0'; 
            } else {
                countA++;
            }
        }

        for(int i=n/2;i<n;i++){

             char c = num.charAt(i);
            if (c != '?') {
                sumB += c - '0'; 
            } else {
                countB++;
            }
        
        }

       
        if ((countA + countB) % 2 == 1) return true; 
        return (sumA - sumB) != (countB - countA) / 2 * 9;
        
        
        
  }
}