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
public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(new SingleNumber().singleNumber(new int[] {2,2,-1}));
    }
    
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }
        
        return res;
    }
}
