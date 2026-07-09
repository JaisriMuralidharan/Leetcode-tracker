// Last updated: 7/9/2026, 11:29:35 AM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String t = s + s;
        if (t.substring(1, t.length() - 1).contains(s)) {
            return true;
        }
        return false;
    }
}