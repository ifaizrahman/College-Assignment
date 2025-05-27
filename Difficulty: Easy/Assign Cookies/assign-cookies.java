
class Solution {
    public int maxChildren(int[] greed, int[] cookie) {
        Arrays.sort(greed);
        Arrays.sort(cookie);
        int count=0;
        int i=0;
        int j=0;
        
        while(i<cookie.length &&j<greed.length){
            if(cookie[i]>=greed[j]){
                count++;
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return count;
    }
}