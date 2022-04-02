package _02_loop_array_java.exercise_array;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr1[] = new int[100];
        System.out.println("Nhap so luong phan tu mang 1: ");
        int n1 = input.nextInt();
        for (int i = 0; i < n1; i++) {
            System.out.printf(" Nhap Arr[%d]= ", i);
            arr1[i] = input.nextInt();
        }

        int arr2[] = new int[100];
        System.out.print("Nhap so luong phan tu mang 2: ");
        int n2 = input.nextInt();
        for (int j = 0; j < n2; j++) {
            System.out.printf(" Nhap Arr[%d]= ", j);
            arr2[j] = input.nextInt();

        }
        int n3 = n1 + n2;
        int arr3[] = new int[n3];

        for (int i = 0; i < n1; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = 0; j < n2; j++) {
            arr3[j + n1] = arr2[j];

        }
        System.out.printf("Mang vua gop la: ");
        for (int k : arr3) {
            System.out.print(k + "\t");
        }
    }
}
