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
public class ValidSudoku {
    public static void main(String[] args) {
       char[][] board = new char[][]{
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
       };
       
        System.out.println(new ValidSudoku().isValidSudoku(board));
    }
    
    public boolean isValidSudoku(char[][] board)
    {
        for(int i = 0; i < board.length; i ++)
        {
            for(int j = 0; j < board.length; j ++)
            {
                if(board[i][j] != '.')
                {
                    // Checking 3 X 3
                    int x = (i+3)-(i%3);
                    int y = (j+3)-(j%3);
                    
                    int b = j+1;
                    for(int a = i; a < x; a ++)
                    {
                        for(; b < y; b ++)
                        {
                            if(board[i][j] == board[a][b])
                            {
                                return false;
                            }
                        }
                        b = j - (j%3);
                    }
                    
                    
                    // Horizontal
                    for (int k = j+1; k < board.length; k++) {
                        if(board[i][j] == board[i][k])
                        {
                            return false;
                        }
                    }
                    
                    // Vertical
                    for (int k = i+1; k < board.length; k++) {
                        if(board[i][j] == board[k][j])
                        {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
