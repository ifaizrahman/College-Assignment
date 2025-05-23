class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<address.length();i++){
            if(Character.isDigit(address.charAt(i))){
                sb.append(address.charAt(i));
            }
            else if(address.charAt(i) == '.'){
                sb.append("[.]");
            }
        }
        String ans = sb.toString();

        return ans;
    }
}