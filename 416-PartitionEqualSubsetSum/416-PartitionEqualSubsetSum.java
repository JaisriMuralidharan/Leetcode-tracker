// Last updated: 7/9/2026, 11:29:42 AM
class Solution {
    Boolean dp[][];
    public boolean canPartition(int[] nums) {
        /* 
        INTUITION : a) If the sum of the array is odd, it can never be partitioned into equal sum subsets.
        b) If we get a subset where the sum of the elements in the subset is exactly half the sum, we'll return true. Else, return false
        This is because to partition into equal subsets, we need to find exactly one subset which is half the sum, then the remaining array is a subset has the sum of half the total sum
        */

        // BASE CASE : if the sum of the array is odd, we'll simply return false
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        if(sum % 2 != 0) return false;

        // Initialise a dp array
        // We'll replace the total sum with the required sum which is half the sum
        sum /= 2;
        dp = new Boolean[nums.length + 1][sum + 1];
        /* 
        States of dp array :
        ** dp array is initialised with null values which indicates not visited
        ** dp[i][j] = false : visited and subset not found
        ** dp[i][j] = true : visited and subset found
        */
        
        return helper(nums, 0, sum);
    }

    public boolean helper(int nums[], int i, int target){
        // BASE CASES :
        // If the index is out of bounds, return false
        if(i >= nums.length) return false;

        // If remaining target is less than, we'll return false
        if(target < 0) return false;

        // If exact target is reached, we'll retur true
        if(target == 0) return true;

        // If the result is already stored in dp, just retrieve it
        if(dp[i][target] != null) return dp[i][target];

        // We'll now proceed with our idea
        // Ignore the element and proceed to the next element
        boolean leave = helper(nums, i + 1, target);

        // Take the element and reduce the target by that element
        boolean take = helper(nums, i + 1, target - nums[i]);

        // If either of the helper function returns true, return true.
        // If both returns false, return false.
        return dp[i][target] = leave || take;
    }
}