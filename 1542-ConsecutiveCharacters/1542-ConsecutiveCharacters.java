// Last updated: 7/9/2026, 11:28:00 AM
class Solution {
    public int maxPower(String s) {
        int count = 1; 
        int maxi = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }
            maxi = Math.max(maxi, count);
        }
        return maxi;
    }
}