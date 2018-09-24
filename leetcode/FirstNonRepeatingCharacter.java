/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Siddharth
 */
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        char c = new FirstNonRepeatingCharacter().firstNotRepeatingCharacter("abaaaa");
        System.out.println(c);
    }
    char firstNotRepeatingCharacter(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i ++)
        {
            if(!map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i), i);
            }
            else
            {
                map.put(s.charAt(i), Integer.MAX_VALUE);
            }
        }

        int least = Integer.MAX_VALUE;
        char c = '_';
        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            int value = entry.getValue();
            if(value < least)
            {
                least = value;
                c = entry.getKey();
            }
        }
        return c;
    }
}
