package _02_loop_array_java.exercise_array;

import java.util.Scanner;

public class FindMaximumValueForArray2Way {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = 0, n = 0;
        System.out.print("Nhap so hang m: ");
        m = input.nextInt();
        System.out.print("Nhap so cot n: ");
        n = input.nextInt();
        //int arr[][] = new int[m][n];
        System.out.print(" Gia tri lon nhat trong mang hai chieu la: " + maxArray(m, n));
    }

    public static int maxArray(int row, int col) {
        Scanner input = new Scanner(System.in);
        int[][] arrNew = new int[row][col];
        System.out.println(" Nhap gia tri cho tung phan tu: ");
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                System.out.print(" arrNew [" + i + "][" + j + "]=  ");
                arrNew[i][j] = input.nextInt();
            }
        System.out.println("Mang 2 chieu vua tao la: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arrNew[i][j] + " ");
            }
            System.out.println();
        }
        int max = arrNew[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max < arrNew[i][j]) {
                    max = arrNew[i][j];
                }
            }
        }
        return max;
    }
}
