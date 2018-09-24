/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashSet;

/**
 *
 * @author Siddharth
 */
public class FirstDuplicate {
    public static void main(String[] args) {
        System.out.println(new FirstDuplicate().firstDuplicate(new int[] {2, 1, 3, 5, 6, 9}));
    }
    
    int firstDuplicate(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if(!set.add(a[i]))
            {
                return a[i];
            }
        }
        return -1;
    }
}
