class Solution {
    public int findLucky(int[] arr) {
      int n=arr.length;
      int ans=-1;
      HashMap<Integer,Integer> map=new HashMap<>();

      for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i] , 0)+1);
        }  

        for(int i=0;i<n;i++){
            if(map.get(arr[i]) == arr[i] && arr[i]>ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}