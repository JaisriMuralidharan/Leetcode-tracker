// Last updated: 7/9/2026, 11:29:23 AM
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();  // sum -> frequency

        // initially ek prefix sum = 0 maan lete h jo 1 baar aaya h
        // taaki agar starting se hi sum = k ho jaye to usko bhi count kar sake
        map.put(0, 1);      

        int count = 0;  // answer count
        int sum = 0;    // running prefix sum

        for (int j = 0; j < nums.length; j++) {
            sum += nums[j]; // is index tak ka sum

            // ab check krna h ki koi aisa prefix sum pehle exist karta tha jisse:
            // (ab tak ka sum - wo prefix sum) = k
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k); // us sum ke occurrences add kar do
            }

            // ab is naye sum ko map me dal do (ya frequency badha do agar pehle se h)
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}