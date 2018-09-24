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
public class DuplicateChecker {
    public static void main(String[] args) {
        int[] num = new int[] {0,0,1,1,1,2,2,3,3,4};
        int n = new DuplicateChecker().removeDuplicates(num);
        
        for (int i = 0; i < n; i++) {
                System.out.print(num[i] + " ");
            }
    }
    
    public int removeDuplicates(int[] nums) {
        int index = 0;
        if(nums.length == 0)
        {
            return index;
        }
        for (int j = 1; j < nums.length; j++) {
            if(nums[index] < nums[j])
            {
                nums[index+1] = nums[j];
                index ++;
            }
        }
        return index+1;
    }
}
