package _02_loop_array_java.exercise_array;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinimumValueForArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so luong phan tu vao mang: ");
        int n = input.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf(" Nhap Arr[%d]= ", i);
            arr[i] = input.nextInt();
        }

        System.out.print("Phan tu nho nhat trong mang co gia tri la: " + (minArray(arr)));

    }

    public static int minArray(int[] arrNew) {
        int min = arrNew[0];
        for (int i = 1; i < arrNew.length; i++) {
            if (min > arrNew[i]) {
                min = arrNew[i];
            }

        }
        return min;
    }
}
