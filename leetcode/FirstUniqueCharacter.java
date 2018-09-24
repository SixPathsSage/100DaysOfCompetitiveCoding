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
public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "loveleetcode";        
        System.out.println(new FirstUniqueCharacter().getOccurence(s));
    }
    
    public int firstUniqChar(String s) {
        for(int i = 0; i < s.length(); i ++)
        {
            boolean isDuplicate = false;
            for (int j = 0; j < s.length(); j++) {
                if(i != j)
                {
                    if(s.charAt(i) == s.charAt(i))
                    {
                        isDuplicate = true;
                    }
                }
            }
            if(!isDuplicate)
            {
                return i;
            }
        }
        return -1;
    }
    
    
    public int getOccurence(String s)
    {
        int[][] mem = new int[256][2];
        for(int i = 0; i < s.length(); i ++)
        {
            mem[s.charAt(i)][0] ++;
            mem[s.charAt(i)][1] = i;
        }
        
        int minIndex = s.length();
        for(int i = 0; i < mem.length; i ++)
        {
            if(mem[i][1] < minIndex && mem[i][0] == 1)
            {
                minIndex = mem[i][1];
            }
        }
        
        return minIndex == s.length() ? -1 : minIndex;
    }
}
