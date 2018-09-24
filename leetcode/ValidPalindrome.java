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
public class ValidPalindrome
 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(new ValidPalindrome().isPalindrome(s));
    }
    
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        s = s.toLowerCase();
        while(i < j)
        {
            if(!isValid(s.charAt(i)))
            {
                i ++;
            }
            else if(!isValid(s.charAt(j)))
            {
                j --;
            }
            else if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            else
            {
                i ++;
                j --;
            }
        }
        return true;
    }
    
    public boolean isValid(char c)
    {
        if((c >= 48 && c <= 57) ||  (c >= 97 && c <= 122 ))
        {
            return true;
        }
        return false;
    }
}
