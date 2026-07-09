// Last updated: 7/9/2026, 11:29:46 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length(),m=t.length();
        if(n>m) return false;
        int i=0,j=0;
        while(i<n && j<m){
            if(s.charAt(i)==t.charAt(j)) { i++;j++;}
            else j++;
        }
        return i==n;
    }
}