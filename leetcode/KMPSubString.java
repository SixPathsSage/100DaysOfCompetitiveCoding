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
public class KMPSubString {
    public static void main(String[] args) {
        String haystack = "mississippi", needle = "issip";
//        System.out.println(new KMPSubString().strStr(haystack, needle));
        int[][] prefix = new int[needle.length()][2];
//        new KMPSubString().calculateFailure(needle, prefix);
        System.out.println(new KMPSubString().strStr(haystack, needle));
//        for (int i = 0; i < prefix.length; i++) {
//            System.out.println(prefix[i][0] + " " + prefix[i][1]);
//        }
    }
    
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0)
        {
            return 0;
        }
        if(haystack.length() == 0)
        {
            return -1;
        }
        int[][] prefix = new int[needle.length()][2];
        calculateFailure(needle, prefix);
        
        int i = 0;
        int j = 0;
        
        while(i < haystack.length() && j < needle.length())
        {
            if(haystack.charAt(i) == prefix[j][0])
            {
                i++;
                j++;
            }
            else
            {
                if(j > 0)
                {
                    j = prefix[j-1][1];
                }
                else
                {
                    j = 0;
                    i++;
                }
            }
        }
        
        if(j == prefix.length)
        {
            return i-prefix.length;
        }
        
        return -1;
    }
    
    public void calculatePrefix(String needle, int[][] prefix)
    {
        int count = 1;
        for(int i = 0; i < prefix.length; i ++)
        {
            if(isInPrefix(needle.charAt(i), prefix))
            {
                prefix[i][0] = needle.charAt(i);
                prefix[i][1] = ++count;
            }
            else
            {
                prefix[i][0] = needle.charAt(i);
                prefix[i][1] = 1;
            }
        }
    }
    
    public boolean isInPrefix(char c, int[][] prefix)
    {
        for(int i = 0; i < prefix.length; i ++)
        {
            if(prefix[i][0] == c)
            {
                return true;
            }
        }
        return false;
    }
    
    public void calculateFailure(String needle, int[][] prefix)
    {
        prefix[0][0] = needle.charAt(0);
        prefix[0][1] = 0;
        
        if(needle.length() > 0)
        {
            int i = 0;
            int j = 1;

            while(i < j && j < needle.length())
            {
                if(needle.charAt(i) == needle.charAt(j))
                {
                    prefix[j][0] = needle.charAt(j);
                    prefix[j][1] = i+1;
                    i++;
                    j++;
                }
                else
                {
                    if(i > 0)
                    {
                        i = prefix[i-1][1];
                    }
                    else
                    {
                        prefix[j][0] = needle.charAt(j);
                        prefix[j][1] = 0;
                        j++;
                    }
                }
            }
        }
    }
}
