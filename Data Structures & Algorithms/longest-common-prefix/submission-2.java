class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        for(String s: strs){
            if(s.length() == 0) return "";
            int n = Math.min(s.length(), ans.length());
            int ind = 0;
            while(ind < n){
                if(s.charAt(ind) != ans.charAt(ind)) break;
                ind++;
            }
            ans = ans.substring(0, ind);
        }
        return ans;
    }
}