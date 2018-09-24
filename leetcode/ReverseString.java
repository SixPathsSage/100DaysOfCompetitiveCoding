/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;

/**
 *
 * @author Siddharth
 */
public class ReverseString {
    public static void main(String[] args) {
        
    }
    
    public String reverse(String s)
    {
        char[] cs = s.toCharArray();
        int j = s.length()-1;
        for(int i = 0; i < s.length()/2 && j > i; i ++)
        {
            char t = cs[i];
            cs[i] = cs[j];
            cs[j--] = t;
        }
        
        StringBuilder b = new StringBuilder();
        for(int i = 0; i < cs.length; i ++)
        {
            b.append(cs[i]);
        }
        return b.toString();
    }
}
