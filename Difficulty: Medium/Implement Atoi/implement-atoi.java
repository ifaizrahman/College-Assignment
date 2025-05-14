//{ Driver Code Starts
// Initial template for JAVA

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String str = sc.nextLine();

            Solution obj = new Solution();
            int num = obj.myAtoi(str);
            System.out.println(num);
            System.out.println("~");
            t--;
        }
    }
}
// } Driver Code Ends


class Solution {
    public int myAtoi(String s) {
        // Your code here
        int n = s.length();
        int i = 0;
        int sign = 1;
        long ans = 0;
        if(n==0){
            return 0;
        }
        for(int j=0;j<n;j++){
            if(s.charAt(j)!=' '){
                break;
            }
            else{
                i++;
            }
        }

        if (i<n && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i<n && s.charAt(i) == '+') {
            sign = 1;
            i++;
        }
        
        while (i < n) {
            if (47 < s.charAt(i) && s.charAt(i) < 58) {

                ans = ans * 10 + (s.charAt(i++) - '0');
                if (sign * ans < Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;

                if (sign * ans > Integer.MAX_VALUE)
                 return Integer.MAX_VALUE;

            } else {
                break;
            }
        }

        ans = ans * sign;
        return (int)ans;
    }
}