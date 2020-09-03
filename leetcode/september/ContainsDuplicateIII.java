package leetcode.september;

/**
 * Link: https://leetcode.com/problems/contains-duplicate-iii/
 */
public class ContainsDuplicateIII {
    /**
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for(int i = 0; i < nums.length; i ++) {
            for(int j = i + 1; j < nums.length && i-j <= k; j ++) {
                if(Math.abs(1L * nums[i] - nums[j]) <= t && Math.abs(i-j) <= k) {
                    return true;
                }
            }
        }

        return false;
    }
}
