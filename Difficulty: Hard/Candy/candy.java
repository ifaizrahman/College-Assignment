// User function Template for Java

class Solution {
    static int minCandy(int arr[]) {
        int n = arr.length;
        int total = 0;

        int [] nums=new int[n];

        for (int i = 0; i < n; i++) {
             nums[i]=1;
        }


        for (int i = 1; i<n; i++) {
            if (arr[i] > arr[i - 1] && nums[i]  <=  nums[i-1]) {
                nums[i] = 1+nums[i-1];
            }
            
        }
         for (int i = n-2; i>=0; i--) {
            if (arr[i] > arr[i + 1]  && nums[i]  <=  nums[i+1]) {
                nums[i] = 1+nums[i+1];
            }
            
        }
         for (int i = 0; i < n; i++) {
            total +=nums[i];
        }
        

        return total;
        
    }
}
