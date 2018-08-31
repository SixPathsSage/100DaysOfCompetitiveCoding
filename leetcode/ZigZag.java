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
public class ZigZag {
    public static void main(String[] args) {
        String s = "ABC";
        int nR = 2;
        System.out.println(new ZigZag().convert(s, nR));
    }
    
    public String convert(String s, int numRows) {
        if(s.length() <= numRows)
        {
            return s;
        }
        int n = ceil(s.length(), 2);
        String[][] a = new String[numRows][n];
        
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < numRows; j++) {
                if(k >= s.length())
                {
                    break;
                }
                if(i % (numRows-1) == 0)
                {
                    a[j][i] = s.charAt(k++) + "";
                }
                else if((i+j)%(numRows-1) == 0)
                {
                    a[j][i] = s.charAt(k++) + "";
                }
            }
        }
        
        String result = "";
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < n; j++) {
                if(a[i][j] != null)
                {
                    result += a[i][j];
                }
            }
        }
        
        return result;
    }
    
    private int ceil(int x, int y)
    {
        return (x+y-1)/y;
    }
}
