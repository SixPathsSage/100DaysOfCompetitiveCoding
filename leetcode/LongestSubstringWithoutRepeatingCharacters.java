/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Scanner;

/**
 *
 * @author Siddharth
 */
public class LongestSubstringWithoutRepeatingCharacters {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(); //dvdf
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s));
    }
    
    public int lengthOfLongestSubstring(String s) {
        int[][] memory = new int[128][2];
        int count = 0;
        int globalCount = 0;
        for(int i = 0; i < s.length(); i ++)
        {
            if(memory[s.charAt(i)][0] == 0)
            {
                memory[s.charAt(i)][0] ++;
                memory[s.charAt(i)][1] = i;
                count ++;
                globalCount = globalCount < count ? count : globalCount;
            }
            else
            {
                i = memory[s.charAt(i)][1];
                memory = new int[128][2];
                globalCount = globalCount < count ? count : globalCount;
                count = 0;
            }
        }
        return globalCount;
    }
}


