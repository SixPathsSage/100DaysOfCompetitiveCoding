/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Scanner;

/**
 *
 * @author Siddharth
 * https://leetcode.com/problems/two-sum/description/
 */
public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < nums.length; i ++)
        {
            nums[i] = scanner.nextInt();
        }
        
        System.out.println("Enter the target");
        int target = scanner.nextInt();
        
        int[] sum = new TwoSum().twoSum(nums, target);
        
        for(int i = 0; i < sum.length; i ++)
        {
            System.out.print(sum[i] + ", ");
        }
    }
    
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i ++)
        {
            for(int j = i+1; j < nums.length; j ++)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}
