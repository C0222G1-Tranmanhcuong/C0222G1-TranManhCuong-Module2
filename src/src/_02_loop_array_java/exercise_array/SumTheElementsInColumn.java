package _02_loop_array_java.exercise_array;

import java.util.Scanner;

public class SumTheElementsInColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Tạo mảng hai chiều với ma trận là số hàng m và số cột n.
        int m = 0, n = 0;
        System.out.print("Nhap so hang m: ");
        m = input.nextInt();
        System.out.print("Nhap so cot n: ");
        n = input.nextInt();
        System.out.print(sumCol(m, n));
    }

    public static int sumCol(int row, int col) {
        Scanner input = new Scanner(System.in);
        int arr[][] = new int[row][col];
        System.out.println(" Nhap gia tri cho tung phan tu: ");
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                System.out.print(" arr [" + i + "][" + j + "]=  ");
                arr[i][j] = input.nextInt();
            }
        System.out.println("Mang 2 chieu vua tao la: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print(" Nhap cot can tinh tong: ");
        int inputCot = input.nextInt();
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j == inputCot) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}
