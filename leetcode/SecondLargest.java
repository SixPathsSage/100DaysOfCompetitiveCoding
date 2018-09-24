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
public class SecondLargest {
    public static void main(String[] args) {
        System.out.println(new SecondLargest().getSecondLargest(new int[] {6,5,2,8,9}));
    }
    
    public int getSecondLargest(int[] a)
    {
        int f = a[0], s = -1;
        
        for (int i = 1; i < a.length; i++) {
            if(a[i] > f)
            {
                s = f;
                f = a[i];
            }
            else if(a[i] < f && a[i] > s)
            {
                s = a[i];
            }
        }
        return s;
    }
}


/*
    3,6,1,2,7
*/