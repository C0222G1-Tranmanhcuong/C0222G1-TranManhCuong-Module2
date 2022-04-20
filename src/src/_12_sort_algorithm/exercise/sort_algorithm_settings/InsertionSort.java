package _12_sort_algorithm.exercise.sort_algorithm_settings;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] list ){
        int key;
        int j;
        for (int i = 0; i <list.length ; i++) {
            key = list[i];
            j = i;
            while (j > 0 && key < list[j-1]){
                list[j] = list[j-1];
                j--;
            }
            list[j] = key;
        }
        System.out.println(Arrays.toString(list));
    }
    }

