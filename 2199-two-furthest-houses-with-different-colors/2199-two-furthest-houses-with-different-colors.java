class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int dist1=0;
        int dist2=0;
        int max=0;

    for(int i=0;i<n;i++){
        if(colors[i] != colors[n-1]){
            dist1= Math.max(dist1,(n-1)- i) ;
            
        }
        if(colors[0] != colors[n-1-i]){
            dist2= Math.max(dist2,(n-1 - i)) ;
            
        }
        max=Math.max(dist1,dist2);
    }

        return max;
        
    }
}