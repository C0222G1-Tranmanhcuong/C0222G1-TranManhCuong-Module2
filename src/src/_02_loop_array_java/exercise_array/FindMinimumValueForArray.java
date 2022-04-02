package _02_loop_array_java.exercise_array;

import java.util.Scanner;

public class FindMinimumValueForArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu vao mang: ");
        int size = input.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf(" Nhap Arr[%d]= ", i);
            arr[i] = input.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (min > arr[i]) {
                min = arr[i];
                System.out.print("Phan tu nho nhat trong mang la: " + min);
            }

        }
    }
}
