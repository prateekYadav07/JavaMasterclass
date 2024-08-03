package com.masterclass.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysUtilityClass {

    public static void main(String[] args) {
//        int[] arr = getRandomArray(10);
//        System.out.println("Unsorted array" + Arrays.toString(arr));
//        int[] revArr = reverseSort(arr);
//        System.out.println("Decreasing order sorted array" + Arrays.toString(revArr));
//        Arrays.sort(arr);
//        System.out.println("Increasing order sorted array" + Arrays.toString(arr));

        // Arrays.equals and deepEquals
        String[] intro = new String[]{"once", "upon", "a", "time" };
        System.out.println("single level of equality with equals "+ Arrays.equals(intro, new String[]{"once", "upon", "a", "time" }));
        Object[] copy = new Object[]{intro, new String[] {"One", "Two"}};
        System.out.println("Deep comparison " + Arrays.deepEquals(copy, new Object[]{intro, new String[] {"One", "Two"}}));

        System.out.println(intro.hashCode()+ " " + Arrays.hashCode(intro));

        String[] outro = Arrays.copyOf(intro, intro.length);
        System.out.println("intro: " + Arrays.toString(intro) + " outro: " + Arrays.toString(outro));
        System.out.println("intro hashcode: "+ Arrays.hashCode(intro) + " outros hashcode: "+ Arrays.hashCode(outro));
        System.out.println("intro hashcode directly: "+ intro.hashCode() + " outros hashcode directly: "+ outro.hashCode());

        // sort and parallelSort
        System.out.println("++++++ Sort Comparison ++++++++");
        int[] arr1 = getRandomArray(10000000);
        long startTime = System.nanoTime();
        Arrays.sort(Arrays.copyOf(arr1, arr1.length));
        System.out.println("sort took: "+ (System.nanoTime() - startTime));

        long parallelStart = System.nanoTime();
        Arrays.parallelSort(Arrays.copyOf(arr1, arr1.length));
        System.out.println("parallel sort took: "+ (System.nanoTime() - parallelStart));



    }

    public static int[] getRandomArray(int len){
        int[] retArr = new int[len];
        Random random = new Random();

        for(int i = 0; i<len; i++){
            retArr[i] = random.nextInt(1000);
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
