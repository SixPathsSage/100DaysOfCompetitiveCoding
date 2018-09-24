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
public class AtoI {
    public static void main(String[] args) {
        System.out.println(new AtoI().myAtoi("  -43"));
    }
    
    public int myAtoi(String str) {
        long output = 0;
        boolean gotNumber = false;
        boolean isNegative = false;
        boolean gotSign = false;
        for(int i = 0; i < str.length(); i ++)
        {
            if(!gotSign && (str.charAt(i) == '-' || str.charAt(i) == '+')){
                gotSign = true;
                if(str.charAt(i) == '-')
                {
                    isNegative = true;
                }
            }
            else if(isValid(str.charAt(i)))
            {
                gotNumber = true;
                output = (output * 10) + Integer.parseInt(str.charAt(i) + "");
                if(output > Integer.MAX_VALUE)
                {
                    return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
            }
            else if(!gotNumber && str.charAt(i) != ' ' && !isValid(str.charAt(i)))
            {
                return 0;
            }
            else if(str.charAt(i) != ' ' && !isValid(str.charAt(i)))
            {
                return isNegative ? (int) output * -1 : (int) output;
            }
        }
        return isNegative ? (int) output * -1 : (int) output;
    }
    
    private boolean isValid(char c)
    {
        return c >= '0' && c <= '9';
    }
}
