// Last updated: 7/9/2026, 11:27:02 AM
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int res = 0;
        String temp = "01";
        while(temp.length() <= s.length()){
            if(s.contains(temp))
                res = temp.length();
            temp = "0" + temp + "1";
        }
        return res;
    }
}