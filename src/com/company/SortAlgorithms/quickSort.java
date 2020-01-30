package com.company.SortAlgorithms;

public class quickSort {
    public static void main(String arg[]){
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        quickSortMethod(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
    //implement the quick sort method using a recursion
    public static void quickSortMethod(int[] input, int start, int end){
        if(end - start < 2){
            return;
        }
        int pivotIndex = partition(input, start, end);
        quickSortMethod(input, start, pivotIndex);
        quickSortMethod(input, pivotIndex + 1, end);

    }

    public static int partition(int[] input, int start, int end){
        //This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while(i < j){
            //Note: Empty loop body
            while(i < j && input[--j] >= pivot);
            if( i<j){
                input[i] = input[j];
            }

            //Note: Empty loop body
            while(i < j && input[++i] <= pivot);
            if(i<j){
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }

}
