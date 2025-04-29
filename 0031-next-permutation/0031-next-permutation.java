class Solution {
    public void nextPermutation(int[] nums) {

        int i=nums.length-2;

        while(i>=0 && nums[i]>=nums[i+1] ){
            i--;
            
        } 

        if(i>=0){
            int j=nums.length-1;
            while(i<j && nums[i]>=nums[j]) j--;


        swap(nums, i,j);
        }
        reverse(nums,i+1,nums.length-1);


        
    }

    private static void swap(int[] arr,int i, int j ){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    private static void reverse(int[] arr, int s, int e){
        while(s<e){
            swap(arr,s,e);
            s++;
            e--;
        }

    }
}