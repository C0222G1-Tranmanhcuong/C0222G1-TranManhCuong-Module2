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

        //Nhập phần tử vào mảng hai chiều vừa tạo.
        int arr[][] = new int[m][n];
        System.out.println(" Nhap gia tri cho tung phan tu: ");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                System.out.print(" a [" + i + "][" + j + "]=  ");
                arr[i][j] = input.nextInt();
            }

        // Xuất ra mảng hai chiều vừa tạo
        System.out.println("Mang 2 chieu vua tao la: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //tính tổng ở cột.
        int sum = 0;
        System.out.print(" Nhap cot can tinh tong: ");
        int inputCot = input.nextInt();
        for (int i =0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (j == inputCot){
                    sum +=arr[i][j];
                }
            }
        }
        System.out.print("Tong cac gia tri o cot: "+ inputCot + " la: "+ sum);
    }
}
