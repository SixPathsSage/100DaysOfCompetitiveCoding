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
public class PlusOne {
    public static void main(String[] args) {
        int[] d = new int[] { 9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};
        int[] res = new PlusOne().plusOne(d);
        
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + ",");
        }
    }
    
    public int[] plusOne(int[] digits) {
        long number = getNumber(digits);
        long result = number+1;
        return getArray(result);
    }
    
    private long getNumber(int[] n)
    {
        long result = 0;
        for (int i = 0; i < n.length; i++) {
            result = (result * 10) + n[i];
        }
        return result;
    }
    
    private int[] getArray(long n)
    {
        int size = (int) Math.floor(Math.log10(n)) + 1;
        int[] resultArray = new int[size];
        for (int i = size-1; i >= 0; i--) {
            resultArray[i] = (int) (n%10);
            n /= 10;
        }
        return resultArray;
    }
}
