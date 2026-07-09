// Last updated: 7/9/2026, 11:29:26 AM
public class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(new StringBuilder(words[i]).reverse());
            if (i < words.length - 1) sb.append(" ");
        }
        return sb.toString();
    }
}
