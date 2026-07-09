// Last updated: 7/9/2026, 11:27:48 AM
class Solution {
    public String truncateSentence(String s, int k) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;

                if (count == k) {
                    return s.substring(0, i);
                }
            }
        }
        return s;
    }
}