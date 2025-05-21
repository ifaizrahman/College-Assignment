// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int s1=0;
        int s2=0;
        int count=0;
        int n=arr.length;
        int max=0;
        
        while(s1<n && s2<n){
            if(arr[s1]<=dep[s2]){
                count++;
                s1++;
                max=Math.max(max,count);
            }
            else{
                count--;
                s2++;
            }
        }
        return max;
    }
}
