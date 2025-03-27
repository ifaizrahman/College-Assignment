//{ Driver Code Starts
// Initial Template for Java
import java.util.*;


// } Driver Code Ends

// User function Template for Java
class Solution {
    public int findTarget(int arr[], int target) {
        int s=0;
        int e=arr.length-1;
        
        
        if(s==e ){
            if(arr[s] == target){
                return 0;
            }
        }
        

        while(s<e){
           int mid=s+(e-s)/2;
          
            
            if( arr[mid]==target){
                return mid;
            }
            if(mid<e && arr[mid+1]==target){
                return mid+1;
            }
            if(mid>s && arr[mid-1]==target){
                return mid-1;
            }
            
    
            if(arr[mid]>target){
                e=mid-1;
            }
            if(arr[mid]<target){
                s=mid+1;
            }
        }
        
        
        return -1;
    }
}


//{ Driver Code Starts.

public class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String temp[] = sc.nextLine().trim().split(" ");
            int n = temp.length;
            int arr[] = new int[n];
            int target = sc.nextInt();
            if (sc.hasNextLine()) sc.nextLine();
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(temp[i]);
            Solution sln = new Solution();
            int ans = sln.findTarget(arr, target);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends