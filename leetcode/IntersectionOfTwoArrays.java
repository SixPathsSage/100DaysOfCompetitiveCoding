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
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] n1 = {1,2,2,1};
        int[] n2 = {2};
        
        int[] r = new IntersectionOfTwoArrays().intersect(n1, n2);
        
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i] + ",");
        }
    }
    
    public int[] intersect(int[] nums1, int[] nums2) {
        int size = Integer.min(nums1.length, nums2.length);
        int[] result = new int[size];
        int index = 0;
        
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j])
                {
                    result[index++] = nums1[i];
                    nums1[i] = nums2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        
        if(size > index)
        {
            int[] newResult = new int[index];
            for (int i = 0; i < index; i++) {
                newResult[i] = result[i];
            }
            return newResult;
        }
        return result;
    }
}
