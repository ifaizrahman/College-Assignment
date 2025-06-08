class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;

        int result[] = new int[n];
        result[n-1] = -1;
        int max = -1;

        for(int i=n-2; i>=0; i--){
            max = Math.max(max, arr[i+1]);
            result[i] = max;
        }

        return result;

    }
}