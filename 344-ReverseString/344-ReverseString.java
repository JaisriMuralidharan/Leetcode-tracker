// Last updated: 7/9/2026, 11:29:55 AM
class Solution {
    public void reverseString(char[] s) {
        for(int i = 0, j = s.length - 1; i < j; i++, j--){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}