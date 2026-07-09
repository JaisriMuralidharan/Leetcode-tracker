// Last updated: 7/9/2026, 11:28:35 AM
class Solution {
    Map<Integer , Integer> dp = new HashMap<>();
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        if(dp.containsKey(n)) return dp.get(n);
        int nt = tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
        dp.put(n,nt);
        return nt;
    }
}