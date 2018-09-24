/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Siddharth
 */
public class Anagram {
    public static void main(String[] args) {
        String s = "a", t = "ab";
        System.out.println(new Anagram().isAnagram(s, t));
    }
    
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for(int i = 0; i < s.length(); i ++)
        {
            int count = 0;
            if(sMap.containsKey(s.charAt(i)))
            {
                count = sMap.get(s.charAt(i)) + 1;
            }
            sMap.put(s.charAt(i), count);
        }
        
        for(int i = 0; i < t.length(); i ++)
        {
            int count = 0;
            if(tMap.containsKey(t.charAt(i)))
            {
                count = tMap.get(t.charAt(i)) + 1;
            }
            tMap.put(t.charAt(i), count);
        }
        
        Iterator it = sMap.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<Character, Integer> m = (Map.Entry) it.next();
            char ch = m.getKey();
            int count = m.getValue();
            
            if(!tMap.containsKey(ch) || tMap.get(ch) != count)
            {
                return false;
            }
        }
        return true;
    }
}
