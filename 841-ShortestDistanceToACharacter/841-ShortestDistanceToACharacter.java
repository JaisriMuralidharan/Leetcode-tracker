// Last updated: 7/9/2026, 11:29:02 AM
class Solution {
    public int[] shortestToChar(String s, char c) {
        
        int n = s.length();
        int[] ans = new int[n];
        Arrays.fill(ans,-1);
        List<Integer> index=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(s.charAt(i) == c) {
               index.add(i);
            }
        }
        for(int i=0;i<index.size();i++){
            int num = index.get(i);
             cDistance(ans,num);
        }
        return ans;
    }
    private void cDistance(int[] ans,int num){
        for(int i=0;i<ans.length;i++){
            if( ans[i]==-1 || ans[i] > Math.abs(num - i) ){
                  ans[i] = Math.abs(num - i) ;
            }
        }
    } 
}