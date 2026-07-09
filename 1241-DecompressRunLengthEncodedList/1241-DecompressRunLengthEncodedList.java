// Last updated: 7/9/2026, 11:28:30 AM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> resList = new ArrayList<Integer>();  
        for (int i = 0; i < nums.length; i++) {
            int fre = nums[i++];  
            int val = nums[i];  
            for (int j = 0; j < fre; j++) 
                resList.add(val);  
        }
        int[] resArray = new int[resList.size()]; 
        Arrays.setAll(resArray, resList::get);  
        return resArray;  
    }
}