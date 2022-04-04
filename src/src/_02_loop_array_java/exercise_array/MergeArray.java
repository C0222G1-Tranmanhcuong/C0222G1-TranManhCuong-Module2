package _02_loop_array_java.exercise_array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so luong phan tu mang 1: ");
        int n1 = input.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.printf(" Nhap Arr[%d]= ", i);
            arr1[i] = input.nextInt();
        }


        System.out.print("Nhap so luong phan tu mang 2: ");
        int n2 = input.nextInt();
        int arr2[] = new int[n2];
        for (int j = 0; j < n2; j++) {
            System.out.printf(" Nhap Arr[%d]= ", j);
            arr2[j] = input.nextInt();

        }
        int n3 = n1 + n2;
        int arr3[] = new int[n3];
        System.out.print(Arrays.toString(mergaArray(arr1, arr2, arr3)));
        
    }

    public static int[] mergaArray(int[] arrNew1, int[] arrNew2, int[] arrNew3) {
        for (int i = 0; i < arrNew1.length; i++) {
            arrNew3[i] = arrNew1[i];
        }
        for (int j = 0; j < arrNew2.length; j++) {
            arrNew3[j + arrNew1.length] = arrNew2[j];
        }
        return arrNew3;
    }
}
