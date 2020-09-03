package leetcode.september;

/**
 * Link: https://leetcode.com/problems/repeated-substring-pattern/
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class RepeatedSubString {
    public boolean repeatedSubstringPattern(String s) {
        return (s+s).substring(1, 2*s.length()-1).contains(s);
    }
}
