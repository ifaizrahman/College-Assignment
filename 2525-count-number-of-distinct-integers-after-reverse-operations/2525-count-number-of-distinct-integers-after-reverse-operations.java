class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
            hs.add(reverse(nums[i]));
        }

        return hs.size();
    }
    public int reverse(int x) {
        int reverseNumber = 0;
        while (x != 0) {
            reverseNumber = reverseNumber * 10 + x % 10;
            x /= 10;
        }
        
        return reverseNumber;
    }
}
/*class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n=nums.length;
        int[] arr=new int[2*n];


        for(int i=0;i<n;i++){
            arr[i]=nums[i];
            arr[n+i]=reverse(nums[i]);
        }

        Arrays.sort(arr);
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]) count++;
            else continue;
        }
        return count;
    }


     public int reverse(int x) {
        int reverseNumber = 0;
        while (x != 0) {
            reverseNumber = reverseNumber * 10 + x % 10;
            x /= 10;
        }
        
        return reverseNumber;
    }
}
*/
