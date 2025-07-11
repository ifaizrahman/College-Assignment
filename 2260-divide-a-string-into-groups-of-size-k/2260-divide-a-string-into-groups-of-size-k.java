class Solution {
    public String[] divideString(String s, int k, char fill) {
           List<String> ans= new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if (sb.length() == k) {
                ans.add(sb.toString());
                sb.setLength(0);
                
            }
        }

        if (sb.length() != 0) {
            while (sb.length() < k) {
                sb.append(fill);
            }
            ans.add(sb.toString());
        }

        String[] result=new String[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }
        
        return result;
    }
}