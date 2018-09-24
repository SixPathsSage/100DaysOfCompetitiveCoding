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
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(534236469));
    }
    
    public static int reverse(int x)
    {
        int res = 0;
        boolean isNegative = x < 0;
        if(isNegative)
        {
            x = x * -1;
        }
        
        while(x > 0)
        {
            int rem = x%10;
            long t = ((long)res*10);
            if(t < Integer.MAX_VALUE)
            {
                res =  (int) (t + rem);
                x = x/10;
            }
            else
            {
                return 0;
            }
        }
        
        if(isNegative)
        {
            res = res * -1;
        }
        
        return res;
    }
    
}
