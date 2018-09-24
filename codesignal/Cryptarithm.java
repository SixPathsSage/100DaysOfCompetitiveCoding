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
public class Cryptarithm {
    
    public static void main(String[] args) {
        char[][] solution = new char[][] {
            {'O', '0'},
            {'M', '1'},
            {'Y', '2'},
            {'E', '5'},
            {'N', '6'},
            {'D', '7'},
            {'R', '8'},
            {'S', '9'}
        };
        String[] crypt = new String[] {"SEND", "MORE", "MONEY"};
        System.out.println(new Cryptarithm().isCryptSolution(crypt, solution));
    }
    
    boolean isCryptSolution(String[] crypt, char[][] solution) {
        int[] result = new int[crypt.length];
        for (int i = 0; i < crypt.length; i++) {
            int res = 0;
            for (int j = 0; j < crypt[i].length(); j++) {
                int value = getValue(crypt[i].charAt(j), solution);
                if(j == 0 && value == 0)
                {
                    return false;
                }
                res = (res * 10) + value;
            }
            result[i] = res;
        }
        
        return result[0] + result[1] == result[2];
    }
    
    int getValue(char ch, char[][] solution)
    {
        for(int i = 0; i < solution.length; i ++)
        {
            if(ch == solution[i][0])
            {
                return Integer.parseInt(solution[i][1] + "");
            }
        }
        return 0;
    }
}
