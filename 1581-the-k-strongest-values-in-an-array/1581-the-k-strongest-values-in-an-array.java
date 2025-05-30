class Solution {
    public int[] getStrongest(int[] arr, int k) {

        ArrayList<Integer> ls=new ArrayList<>();
        Arrays.sort(arr);
        int[] nums=new int[k];
        int n=arr.length;
        int m=arr[(n-1)/2];
        int i=0;
        int j=n-1;
        
        while(i<=j){
            if(Math.abs(arr[i] - m) > Math.abs(arr[j] - m)){
                ls.add(arr[i]);
                i++;
            }
            else{
                ls.add(arr[j]);
                j--;
            }
        }

        
        for(int x=0;x<k;x++){
            nums[x]=ls.get(x);
        }



        
        return nums;
    }
}