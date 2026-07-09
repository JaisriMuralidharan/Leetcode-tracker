// Last updated: 7/9/2026, 11:30:00 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;  // Where the next non-zero goes
        for(int num : nums){
            if(num != 0) nums[index++] = num; // Slide non-zero forward
        }
        while(index < nums.length){
            nums[index++] = 0; // Fill the rest with zeros
        }
    }
}