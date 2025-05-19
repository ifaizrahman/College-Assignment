class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int n = nums.length;

        for (int num : nums) {
            if(num % 2==0){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
            }
        int maxFreq = -1;
        int ans = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq || (freq == maxFreq && key < ans)) {
                maxFreq = freq;
                ans = key;
            }
        }

        return ans;
    }
}