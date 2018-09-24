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
public class RotateImage {
    
    public static void main(String[] args) {
        int[][] matrix = {
            {5,1,9,11},
            {2,4,8,10},
            {13,3,6,7},
            {15,14,12,16}
        };
        new RotateImage().rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        int n = length-1; //3
        for(int i = 0; i < length/2; i ++)
        {
            for(int j = i; j < n-i; j ++)
            {
                int t = matrix[i][j];
                int s = matrix[j][n-i];
                matrix[j][n-i] = t;
                t = s;
                
                s = matrix[n-i][n-j];
                matrix[n-i][n-j] = t;
                t = s;
                
                s = matrix[n-j][i];
                matrix[n-j][i] = t;
                t = s;
                
                matrix[i][j] = t;
            }
        }
    }
}
