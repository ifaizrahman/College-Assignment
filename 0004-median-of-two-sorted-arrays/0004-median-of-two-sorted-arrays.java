class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;

        int[] arr=new int[n1+n2];
        int k=0;

        for(int i=0;i<n1;i++){
            arr[k++]=nums1[i];
        }
        for(int i=0;i<n2;i++){
            arr[k++]=nums2[i];
        }
        Arrays.sort(arr);
        double mid=0;

        if(k%2 !=0){
            mid=arr[k/2];
        } 
        else{
            double mid1=arr[(k-1)/2];
            double mid2=arr[(k+1)/2];
            mid=(mid1+mid2)/2;
        }
        
       return  mid; 
   }
}