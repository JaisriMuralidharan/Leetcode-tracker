// Last updated: 7/9/2026, 11:28:14 AM
class Solution {
    public int removePalindromeSub(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return 2;
            left++;
            right--;
        }
        return 1;
    }
}