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
public class LCP {
    public static void main(String[] args) {
        System.out.println(new LCP().longestCommonPrefix(new String[] {"", ""}));
    }
    
    public String longestCommonPrefix(String[] strs) {
        String lcp = "";
        String ch = "";
        int ptr = 0;
        if(strs.length == 0)
        {
            return lcp;
        }
        else if(strs.length == 1)
        {
            return strs[0];
        }
        while(true)
        {
            for(int i = 0; i < strs.length; i ++)
            {
                if(ptr < strs[i].length())
                {
                    String c = strs[i].charAt(ptr) + "";
                    if(ch.equals("") || ch.equals(c))
                    {
                        ch = c;
                    }
                    else
                    {
                        return lcp;
                    }
                }
            }
            lcp += ch;
            ch = "";
            ptr++;
        }
    }
}
