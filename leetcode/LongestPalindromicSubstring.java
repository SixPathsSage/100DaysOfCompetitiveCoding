/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Siddharth
 */
public class LongestPalindromicSubstring {
    static Map<String, Boolean> mem = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = "aaaa"; // scanner.nextLine();
        String res = new LongestPalindromicSubstring().longestPalindrome(s);
        System.out.println(res);
    }
    
    public String longestPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1)
        {
            return s;
        }
        boolean[][] memory = new boolean[s.length()][s.length()];
        int length = 1;
        String palindrome = s.charAt(0) + "";
        // length of 1
        for(int i = 0; i < s.length(); i ++)
        {
            memory[i][i] = true;
        }
        
        // length of 2
        for(int i = 0; i < s.length() - 1; i ++)
        {
            if(s.charAt(i) == s.charAt(i+1))
            {
                memory[i][i+1] = true;
                length = 2;
                palindrome = s.substring(i, i+2);
            }
        }
        
        // length >= 3
        for (int k = 2; k < s.length(); k++) {
            int i = 0;
            for(int j = k; j < s.length(); j ++)
            {
                if(s.charAt(i) == s.charAt(j) && memory[i+1][j-1])
                {
                    memory[i][j] = true;
                    if(j-i+1 > length)
                    {
                        length = j-i+1;
                        palindrome = s.substring(i, j+1);
                    }
                }
                i++;

            }
        }
        return palindrome;
    }
}
