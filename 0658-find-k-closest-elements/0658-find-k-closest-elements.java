class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n=arr.length;
        int start=0;
        int end=n-1;
        int idx=0;
        List<Integer> ls=new ArrayList<>();

        while(end-start +1 >k){
                if((Math.abs(arr[end]-x)) < (Math.abs(arr[start]-x)) ){
                    start++;
                }
                else{
                    end--;
                }
        }
        for(int i=start;i<=end;i++){
            ls.add(arr[i]);
        }
        
        return ls;
    }
}