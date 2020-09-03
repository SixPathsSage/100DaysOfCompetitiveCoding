package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Link: https://leetcode.com/problems/contains-duplicate-ii/
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int index = 0; index < nums.length; index ++) {
            if(map.containsKey(nums[index]) && index - map.get(nums[index]) <= k) {
                return true;
            }
            map.put(nums[index], index);
        }

        return false;
    }
}
