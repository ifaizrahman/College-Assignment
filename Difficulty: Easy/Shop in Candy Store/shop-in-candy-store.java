// User function Template for Java

class Solution {
    static ArrayList<Integer> candyStore(int candies[], int N, int K) {
        
        Arrays.sort(candies);
        
        ArrayList<Integer> arr=new ArrayList<>();
        
        int mincost=0;
        int maxcost=0;
        int tnum=0;
        
        if( (N%(K+1)) == 0){
            tnum=N/(K+1);
        }
        else{
            tnum=N/(K+1) + 1;
        }
        
        for(int i=0;i<tnum;i++){
            mincost +=candies[i];
        }
        arr.add(mincost);
        int j=N-1;
        int count=tnum;
        
        while(count>0){
            maxcost +=candies[j];
            j--;
            count--;
        }
        arr.add(maxcost);
        
        
        return arr;
        
    }
}