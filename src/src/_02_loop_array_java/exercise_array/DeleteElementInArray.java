package _02_loop_array_java.exercise_array;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.print("Nhap so luong phan tu: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf(" Nhap Arr[%d]= ", i);
            arr[i] = input.nextInt();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("Arr[%d]= %d\n", i, arr[i]);
        }
        System.out.print("Nhap gia tri can xoa: ");
        int x = input.nextInt();
        System.out.print(Arrays.toString(deleteArray(arr, x)));
    }

    public static int[] deleteArray(int[] arr1, int num) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == num) {
                for (int j = i + 1; j < arr1.length; j++, i++) {
                    arr1[i] = arr1[j];
                }
            }
        }
        arr1[arr1.length - 1] = 0;
        return arr1;
    }
}