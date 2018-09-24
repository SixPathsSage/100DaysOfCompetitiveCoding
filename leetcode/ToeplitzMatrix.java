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
public class ToeplitzMatrix {
    public static void main(String[] args) {
        int[][] a = new int[][] { 
            {18}, {66}
        };
        
        System.out.println(new ToeplitzMatrix().isToeplitzMatrix(a));
    }
    
    public boolean isToeplitzMatrix(int[][] matrix) {
        int l = matrix.length;
        for(int i = 0; i < matrix.length; i ++)
        {
            int x = 0, y = i;
            while(x < l-1 && y < l-1)
            {
                if(matrix[x][y] != matrix[x+1][y+1])
                {
                    return false;
                }
                x++;
                y++;
            }
        }
        
        for(int i = 1; i < matrix.length; i ++)
        {
            int x = i, y = 0;
            while(x < l-1 && y < l-1)
            {
                if(matrix[x][y] != matrix[x+1][y+1])
                {
                    return false;
                }
                x++;
                y++;
            }
        }
        
        return true;
    }
}
