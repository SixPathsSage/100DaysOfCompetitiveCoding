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
 */
public class OccurenceSort {
    public static int[][] mem;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 10;// sc.nextInt();
        int[] a = new int[] {6,5,4,3,2,1,6};// new int[size];
//        for(int i = 0; i < size; i ++)
//        {
//            a[i] = sc.nextInt();
//        }
        OccurenceSort ocs = new OccurenceSort();
        mem = ocs.calculateOccurence(a);
        ocs.sortInAsceding(a);
        int[] sortedArray = new OccurenceSort().sort(a);
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }

    private int[] sort(int[] a) {
        int v = Integer.MIN_VALUE;
        int index = 0;
        do
        {
           v = getValue();
           int i = index;
           for(; i < a.length; i ++)
           {
               if(a[i] == v)
               {
                   continue;
               }
               for(int j = i+1; j < a.length; j ++)
               {
                   if(a[i] != v && a[j] == v )
                   {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                        index = i+1;
                        break;
                   }
                }
            } 
        }while(v != Integer.MIN_VALUE);
        
        return a;
    }
    
    private void sortInAsceding(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    
    private int[][] calculateOccurence(int[] a)
    {
        prepopulateMemory(a.length);
        for(int i = 0; i < a.length; i ++)
        {
            if(!isInMemory(a[i]))
            {
                int count = 1;
                int occurence = i;
                for (int j = i+1; j < a.length; j++) {
                    if(a[i] == a[j])
                    {
                        count ++;
                        occurence = j;
                    }
                }
                mem[i][0] = a[i];
                mem[i][1] = count;
                mem[i][2] = occurence;
            }
        }
        return mem;
    }
    
    private int[][] prepopulateMemory(int length)
    {
        mem = new int[length][3];
        for(int i = 0; i < mem.length; i ++)
        {
            mem[i][0] = Integer.MIN_VALUE;
        }
        return mem;
    }
    
    private boolean isInMemory(int value)
    {
        for(int i = 0; i < mem.length; i ++)
        {
            if(mem[i][0] == value)
            {
                return true;
            }
        }
        return false;
    }
    
    private int getValue()
    {
        int[][] value = new int[][] { {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE} };
        for (int i = 0; i < mem.length; i++) {
            if(mem[i][0] != Integer.MIN_VALUE)
            {
                for (int j = i+1; j < mem.length; j++) {
                    if(mem[j][0] != Integer.MIN_VALUE)
                    {
                        int[][] a = new int[][] { 
                            {mem[i][0], mem[i][1], mem[i][2]}
                        };
                        int[][] b = new int[][]
                        {
                            {mem[j][0], mem[j][1], mem[j][2]}
                        };
                        int[][] localMax = getMax(a, b);
                        int[][] gMax = getMax(localMax, value);
                        value = gMax;
                    }
                }
            }
        }
        mem = resetMem(value);
        if(value[0][1] == 1)
        {
            return Integer.MIN_VALUE;
        }
        return value[0][0];
    }
    
    private int[][] resetMem(int[][] value)
    {
        for (int i = 0; i < mem.length; i++) {
            if(mem[i][0] == value[0][0])
            {
                mem[i][0] = Integer.MIN_VALUE;
            }
        }
        return mem;
    }
    
    private int[][] getMax(int[][] a, int[][] b)
    {
        if(a[0][1] > b[0][1])
        {
            return a;
        }
        else if(a[0][1] == b[0][1])
        {
            if(a[0][2] > b[0][2])
            {
                return a;
            }
            else
            {
                return b;
            }
        }
        else
        {
            return b;
        }
    }
}
