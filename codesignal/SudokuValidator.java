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
public class SudokuValidator {
    
    public static void main(String[] args) {
        String[][] b = new String[][] {
            {".",".",".",   ".","5",".",    ".","1","."},
            {".","4",".",   "3",".",".",    ".",".","."},
            {".",".",".",   ".",".","7",    ".",".","2"},
            
            {"8",".",".",   ".",".",".",    ".","2","."},
            {".",".","2",   ".","7",".",    ".",".","."},
            {".","1","5",   ".",".",".",    ".",".","."},
            
            {".",".",".",   ".",".","2",    ".",".","."},
            {".","2",".",   "9",".",".",    ".",".","."},
            {".",".","4",   ".",".",".",    ".",".","."}
        };
        
        char[][] board = new char[b.length][b.length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                board[i][j] = b[i][j].charAt(0);
            }
        }
        
        System.out.println(new SudokuValidator().isValidSudoku(board));
    }
    
    public boolean isValidSudoku(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if(grid[i][j] != '.')
                {
                    // 3 X 3 check
                    int x = i+3-(i%3);
                    int y = j+3-(j%3);
                    int p = j+1;
                    
                    for(int a = i; a < x; a++)
                    {
                        for(int b = p; b < y; b ++)
                        {
                            if(grid[i][j] == grid[a][b])
                            {
                                return false;
                            }
                        }
                        p = y-3;
                    }
                    
                    // Horizontal
                    for(int a = j+1; a < grid.length; a ++)
                    {
                        if(grid[i][a] == grid[i][j])
                        {
                            return false;
                        }
                    }
                    
                    for(int a = i+1; a < grid.length; a ++)
                    {
                        if(grid[a][j] == grid[i][j])
                        {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    
    /*
        [00, 01, 02,     03, 04, 05,     06, 07, 08],
        [10, 11, 12,     13, 14, 15,     16, 17, 18],
        [20, 21, 22,     23, 24, 25,     26, 27, 28],
    
        [30, 31, 32,     33, 34, 35,     36, 37, 38],
        [40, 41, 42,     43, 44, 45,     46, 47, 48],
        [50, 51, 52,     53, 54, 55,     56, 57, 58],
    
        [60, 61, 62,     63, 64, 65,     66, 67, 68],
        [70, 71, 72,     73, 74, 75,     76, 77, 78],
        [80, 81, 82,     83, 84, 85,     86, 87, 88]
    */
}
