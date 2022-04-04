package _02_loop_array_java.exercise_array;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.print("Nhap so luong phan tu: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf(" Nhap Arr[%d]= ", i);
            arr[i] = input.nextInt();
        }
        System.out.print("Nhap gia tri can chen: ");
        int x = input.nextInt();
        int index;
        do {
            System.out.println("Nhap vi tri chen: ");
            index = input.nextInt();
            if (index <= -1 || index >= n - 1) {
                System.out.println("Khong chen duoc phan tu vao mang");
            }
        } while (index <= -1 || index >= n - 1);

        System.out.print(Arrays.toString(insert(arr, x, index)));
    }

    public static int[] insert(int[] array, int numberinsert, int indexinsert) {
        for (int i = array.length - 1; i >= indexinsert; i--) {
            array[i] = array[i - 1];
        }
        array[indexinsert] = numberinsert;
        return array;
    }
}

