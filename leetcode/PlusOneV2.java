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
public class PlusOneV2 {
    public static void main(String[] args) {
        int[] digits = new int[] {1,0,0,0,0};
        PlusOneV2 pv2 = new PlusOneV2();
        pv2.print(digits);
        int[] result = pv2.plusOne(digits);
        pv2.print(result);
    }
    
    public int[] plusOne(int[] digits) {
        int[] resultArray = new int[calculateSize(digits)];
        int d = digits.length - 1;
        int r = resultArray.length - 1;
        int rem = 1;
        
        for(int i = d; i >= 0; i --)
        {
            int sum = digits[i] + rem;
            if(sum > 0)
            {
                if(sum % 10 != 0)
                {
                    resultArray[r] = sum;
                    rem = 0;
                }
                else
                {
                    resultArray[r] = 0;
                    rem = 1;
                }
            }
            r--;
        }
        
        if(rem == 1 && r >= 0)
        {
            resultArray[r--] = 1;
        }
        
        return resultArray;
    }
    
    int calculateSize(int[] digits)
    {
        boolean isLargestDigit = true;
        
        for(int i = digits.length-1; i >= 0; i --)
        {
            if(digits[i] != 9)
            {
                isLargestDigit = false;
                break;
            }
        }
        
        return isLargestDigit ? digits.length+1 : digits.length;
    }
    
    public void print(int[] digits)
    {
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + ", ");
        }
        System.out.println("");
    }
    
    
    
    //    9, 9, 9
    // 0, 0, 0, 0
}
