// User function Template for Java

class Solution {
    static int toyCount(int N, int K, int arr[]) {
        // code here
        Arrays.sort(arr);
        int count=0;
        int sum=0;
        
        for(int i=0;i<N;i++){
            if(sum + arr[i]<= K){
            sum +=arr[i];
            count++;
            }
            
            else break;
            
        }
        
        
        return count;
    }
}