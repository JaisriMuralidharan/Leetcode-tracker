// Last updated: 7/9/2026, 11:27:51 AM
class Solution {
    public int findCenter(int[][] e) {
      
        
       return e[0][0]==e[1][0]||e[0][0]==e[1][1]?e[0][0]:e[0][1];
    }
}