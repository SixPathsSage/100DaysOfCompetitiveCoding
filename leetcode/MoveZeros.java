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
public class MoveZeros {
    public static void main(String[] args) {
        new MoveZeros().moveZeroes(new int[] {0,1,0,3,12});
    }
    
    public void moveZeroes(int[] nums) {
        for(int i = 0; i < nums.length; i ++)
        {
            if(nums[i] == 0)
            {
               for(int j = i; j < nums.length; j ++)
                {
                    if(nums[j] != 0)
                    {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                } 
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
    }
    
    
}
