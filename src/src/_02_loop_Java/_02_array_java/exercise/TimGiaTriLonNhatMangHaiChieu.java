package _02_loop_Java._02_array_java.exercise;

import java.util.Scanner;

public class TimGiaTriLonNhatMangHaiChieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Tạo mảng hai chiều với ma trận là số hàng m và số cột n.
        int m = 0, n = 0;
        System.out.print("Nhap so hang m: ");
        m = input.nextInt();
        System.out.print("Nhap so cot n: ");
        n = input.nextInt();

        //Nhập phần tử vào mảng hai chiều vừa tạo.
        int a[][] = new int[m][n];
        System.out.println(" Nhap gia tri cho tung phan tu: ");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                System.out.print(" a [" + i + "][" + j + "]=  ");
                a[i][j] = input.nextInt();
            }

        // Xuất ra mảng hai chiều vừa tạo
        System.out.println("Mang 2 chieu vua tao la: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // Tìm giá trị phần tử lớn nhất.
        int max = a[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                    System.out.print("Phan tu lon nhat trong mang hai chieu la: " + max);
                }
            }
        }
    }
}
