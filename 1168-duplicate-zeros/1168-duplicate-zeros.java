class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        int s=0;
        ArrayList<Integer> list=new ArrayList<>();


        while(s<n){
            if(arr[s]==0){
               list.add(0);
               list.add(0);
            }
            else{
                list.add(arr[s]);
            }
            s++;
        }
        for(int i=0;i<n;i++){
            arr[i]=list.get(i);
        }
    }
}