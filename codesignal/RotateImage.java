/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hiddenleafvillage;

/**
 *
 * @author Siddharth
 */
public class RotateImage {
    public static void main(String[] args) {
        int[][] image = new int[][] {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
            
//            {00, 01, 02, 03},
//            {10, 11, 12, 13},
//            {20, 21, 22, 23},
//            {30, 31, 32, 33}
        };
        
        /*
            [00, 01, 02],
            [10, 11, 12],
            [20, 21, 22]
        
            [20, 10, 00],
            [21, 11, 01],
            [22, 12, 02]
        
            {00, 01, 02, 03},
            {10, 11, 12, 13},
            {20, 21, 22, 23},
            {30, 31, 32, 33}
        */
        
        new RotateImage().rotate(image);
    }
    
    public void rotate(int[][] a)
    {
        int l = a.length;
        int n = l-1;
        
        for(int i = 0; i < l/2; i ++)
        {
            for(int j = i; j < l-1-i; j ++)
            {
                int t = a[i][j];
                int s = a[j][n-i];
                a[j][n-i] = t;
                t = s;
                
                s = a[n-i][n-j];
                a[n-i][n-j] = t;
                t = s;
                
                s = a[n-j][i];
                a[n-j][i] = t;
                t = s;
                
                a[i][j] = t;
            }
        }
        
        print(a);
    }
    
    public void print(int[][] r)
    {
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r.length; j++) {
                System.out.print(r[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
