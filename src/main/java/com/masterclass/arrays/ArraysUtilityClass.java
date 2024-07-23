package com.masterclass.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ArraysUtilityClass {

    public static void main(String[] args) {
        int[] arr = getRandomArray(10);
        System.out.println("Unsorted array" + Arrays.toString(arr));
        int[] revArr = reverseSort(arr);
        System.out.println("Decreasing order sorted array" + Arrays.toString(revArr));
        Arrays.sort(arr);
        System.out.println("Increasing order sorted array" + Arrays.toString(arr));
    }

    public static int[] getRandomArray(int len){
        int[] retArr = new int[len];
        Random random = new Random();

        for(int i = 0; i<len; i++){
            retArr[i] = random.nextInt(100);
        }

        return retArr;
    }

    public static int[] reverseSort(int[] arr){
        int[] retArr = Arrays.copyOf(arr, arr.length);
        for(int i=0; i<retArr.length; i++){
            for(int j = 0; j<retArr.length-1; j++){
                if(retArr[j] < retArr[j + 1]){
                    int temp = retArr[j];
                    retArr[j] = retArr[j + 1];
                    retArr[j + 1] = temp;
                }
            }
        }
        return  retArr;
    }
}
