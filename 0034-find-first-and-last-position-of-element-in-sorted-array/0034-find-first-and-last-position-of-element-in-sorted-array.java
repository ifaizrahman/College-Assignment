class Solution {
    public int[] searchRange(int[] nums, int target) {
    
        
        int[] arr=new int[2];
        
       arr[0]=firstocc(nums,target);
       arr[1]=lastocc(nums,target);

        return arr;
    }


     
      public int firstocc(int[] ar, int target){
         int first=0;
        int last=ar.length-1;
        int ans=-1;
              while(first<=last){
            int mid=first+(last-first)/2;
            if(ar[mid]==target){
                ans=mid;
                last=mid-1;
                
            }
            else if(ar[mid]<target){
                first=mid+1;
            }
            else{
                last=mid-1;
            }

       
        } return ans;
        
        }


    public int lastocc(int[] ar, int target){
         int first=0;
        int last=ar.length-1;
        int ans=-1;
    while(first<=last){
            int mid=first+(last-first)/2;
            if(ar[mid]==target){
                ans=mid;
                first=mid+1;
            }
            else if(ar[mid]<target){
                first=mid+1;
            }
            else{
                last=mid-1;
            }
           
        }
        return ans;

    }
}