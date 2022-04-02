package _02_loop_array_java.exercise_array;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[100];
        System.out.print("Nhap so luong phan tu: ");
        int n = input.nextInt();    // Nhập size mảng

        //Nhập phần tử vào mảng.
        for (int i = 0; i < n; i++) {
            System.out.printf(" Nhap Arr[%d]= ", i);
            arr[i] = input.nextInt();
        }

        //Xuất mảng vừa nhập.
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("Arr[%d]= %d\n", i, arr[i]);
        }
        //Chèn phần tử vào mảng.
        System.out.print("Nhap gia tri can chen: ");
        int x = input.nextInt();
        int index = -1;
        do {
            System.out.println("Nhap vi tri chen: ");
            index = input.nextInt();
            if (index <= -1 || index >= n - 1) {
                System.out.println("Khong chen duco phan tu vao mang");
            }
        } while (index <= -1 || index >= n - 1);
        for (int i = n - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = x;
        n++;
        //Xuất mảng sau khi chèn.
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("Arr[%d]= %d\n", i, arr[i]);
        }
    }
}
