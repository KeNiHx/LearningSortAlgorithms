package com.company.SortAlgorithms;


//Counting sort is good when the range is not significantly greater than the number items you want to sort
public class countingSort {
    public static void main(String arg[]){
        int[] intArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };

        countingSortMethod(intArray, 1, 10);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
    public static void countingSortMethod(int[] input, int min, int max){
        int[] countArray = new int[max - min + 1];

        for(int i =0; i < input.length; i++){
            countArray[input[i] - min]++;
        }

        int j = 0;
        for(int i = min; i <=max; i++){
            while(countArray[i - min]>0){
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
