/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Siddharth
 */
public class StrStr {
    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        System.out.println(new StrStr().strStr(haystack, needle));
    }
    
    public int strStr(String haystack, String needle)
    {
        if(needle.length() == 0)
        {
            return 0;
        }
        return getSubString(haystack, needle, 0, haystack.length());
    }
    
    public int getSubString(String haystack, String needle, int x, int y)
    {
        if(haystack.length() == 0)
        {
            return 0;
        }
        if(haystack.equals(needle))
        {
            return x;
        }
        if(x+1 < haystack.length())
        int preSplit = getSubString(haystack.substring(x+1, y), needle, x+1, y);
        int postSplit = getSubString(haystack.substring(x, y-1), needle, x, y-1);
        return Integer.max(preSplit, postSplit);
    }
}

/*
    Mississippi issip, ip, issippi
*/