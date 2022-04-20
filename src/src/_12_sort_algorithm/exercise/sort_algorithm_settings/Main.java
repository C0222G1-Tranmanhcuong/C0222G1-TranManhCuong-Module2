package _12_sort_algorithm.exercise.sort_algorithm_settings;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int size = Integer.parseInt(input.nextLine());
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập list[%d]=", i);
            list[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println(Arrays.toString(list));
        InsertionSort.insertionSort(list);

    }

}
