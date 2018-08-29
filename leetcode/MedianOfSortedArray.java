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
public class MedianOfSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of first array");
        int firstArraySize = scanner.nextInt();
        int[] firstArray = new int[firstArraySize];
        System.out.println("Enter the elements of first array");
        for (int i = 0; i < firstArraySize; i++) {
            firstArray[i] = scanner.nextInt();
        }
        
        System.out.println("Size of second array");
        int secondArraySize = scanner.nextInt();
        int[] secondArray = new int[secondArraySize];
        System.out.println("Enter the elements of second array");
        for (int i = 0; i < secondArraySize; i++) {
            secondArray[i] = scanner.nextInt();
        }
        System.out.println(new MedianOfSortedArray().findMedianSortedArrays(firstArray, secondArray));
    }
    
    public double findMedianSortedArrays(int[] fArray, int[] sArray) {
        int[] mergedArray = mergeArrays(fArray, sArray);
        if(mergedArray.length % 2 == 0)
        {
            return ((double) mergedArray[mergedArray.length/2] + (double)mergedArray[(mergedArray.length/2 - 1)])/2;
        }
        else
        {
            return (double)mergedArray[mergedArray.length/2]; 
        }
    }
    
    public int[] mergeArrays(int[] fArray, int[] sArray)
    {
        int[] mergedArray = new int[fArray.length + sArray.length];
        int i = 0, j = 0;
        int index = 0;
        while(i < fArray.length && j < sArray.length)
        {
            if(fArray[i] < sArray[j])
            {
                mergedArray[index++] = fArray[i++];
            }
            else if(fArray[i] > sArray[j])
            {
                mergedArray[index++] = sArray[j++];
            }
            else
            {
                mergedArray[index++] = fArray[i++];
                mergedArray[index++] = sArray[j++];
            }
        }
        
        while(i >= fArray.length && j < sArray.length)
        {
            mergedArray[index++] = sArray[j++];
        }
        
        while(j >= sArray.length && i < fArray.length)
        {
            mergedArray[index++] = fArray[i++];
        }
        return mergedArray;
    }
}
