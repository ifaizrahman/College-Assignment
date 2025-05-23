class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ls=new ArrayList<>();
       for(int i=left;i<=right;i++){
        if(divisible(i)){
            ls.add(i);
        }
       }
        return ls;
    }

    public boolean divisible(int num){
        int div=0;
        int temp=num;

        while (temp > 0) {
            div = temp % 10;

            if (div == 0 || num % div != 0) {
                return false;
            }

            temp /= 10;
        }
        
        return true;
    }
}