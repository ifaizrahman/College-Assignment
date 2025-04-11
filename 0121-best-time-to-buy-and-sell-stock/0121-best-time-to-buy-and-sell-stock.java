/*class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; 
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; 
            }
        }

        return maxProfit;
    }
}
*/
class Solution {
    public int maxProfit(int[] prices) {
      int max = 0;
    int left = 0;
    int n = prices.length;
    
    for(int i = 0; i < n; i++){
        
        if(prices[i] > prices[left]){
            max = Math.max(max, prices[i] - prices[left]);
        }else{
            left = i;
        }

    }
    
    return max;
}
}