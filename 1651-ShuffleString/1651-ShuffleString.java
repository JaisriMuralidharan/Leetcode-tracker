// Last updated: 7/9/2026, 11:27:57 AM
class Solution {
    public String restoreString(String s, int[] indices) {
        int l=indices.length;
        char ar[]=new char[l];
        for(int i=0;i<l;i++)
        {
            ar[indices[i]]=s.charAt(i);
        }
        return new String(ar);
    }
}