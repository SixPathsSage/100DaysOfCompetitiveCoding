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
public class RotateArray {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,6};
        new RotateArray().rotate(array , 2);
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
    
    public void rotate(int[] nums, int k) {
        if(nums.length > 1 && k > 0)
        {
            k = k % nums.length;
            int count = 0;
            for (int startIndex = 0; count < nums.length; startIndex++) {
                int currentIndex = startIndex;
                int t1 = nums[startIndex];
                do
                {
                    int swapIndex = (currentIndex + k) % nums.length;
                    int t2 = nums[swapIndex];
                    nums[swapIndex] = t1;
                    t1 = t2;
                    currentIndex = swapIndex;
                    count++;
                }while(startIndex != currentIndex);
            }
        }
    }
}
