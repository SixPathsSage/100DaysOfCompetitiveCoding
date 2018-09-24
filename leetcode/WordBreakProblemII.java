/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Siddharth
 */
public class WordBreakProblemII {
    static List<String> dict = new ArrayList<>();
    
    public static void populateDictionary()
    {
        dict.add("on");
        dict.add("pin");
        dict.add("sand");
        dict.add("and");
        dict.add("pins");
    }
    
    public static void main(String[] args) {
        populateDictionary();
        List<String> s = breakWord("onpins", dict);
    }
    
//    public List<String> wordBreak(String s, List<String> wordDict) {
//        
//    }
    
    public static List<String> breakWord(String s, List<String> result)
    {
        if(s.length() == 0 || s.length() == 1)
        {
            return result;
        }
        
        for(int i = 0; i <= s.length(); i ++)
        {
            String prefix = s.substring(0, i);
            
            if(inDictionary(prefix))
            {
                if(i == s.length())
                {
                    result.add(prefix);
                    return result;
                }
                else
                {
                    result.add(prefix);
                    breakWord(s.substring(i, s.length()), result);
                }
            }
        }
        return result;
    }
    
    public static boolean inDictionary(String s)
    {
        for (String string : dict) {
            if(string.equals(s))
            {
                return true;
            }
        }
        return false;
    }
}
