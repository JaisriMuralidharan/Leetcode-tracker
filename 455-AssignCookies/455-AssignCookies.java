// Last updated: 7/9/2026, 11:29:37 AM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
       Arrays.sort(g);
Arrays.sort(s);
int i = 0;
for(int j=0;i<g.length && j<s.length;j++) {
	if(g[i]<=s[j]) i++;
}
return i; 
    }
}