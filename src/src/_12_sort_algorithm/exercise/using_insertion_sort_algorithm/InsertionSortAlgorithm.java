package _12_sort_algorithm.exercise.using_insertion_sort_algorithm;

import java.util.Scanner;

public class InsertionSortAlgorithm {
    public static void insertionSort(int[] array) {
        System.out.println("Khai báo hai biến x và pos. trong đó x là giá trị cần xét còn pos là vị trí để chèn x");
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            System.out.println("Gán x = array [" + i + "] ( x= " + array[i] + ")");
            x = array[i];
            System.out.println("Gán pos = i (pos= "+i+")");
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                System.out.println("Vì " + x + " nhỏ hơn " + array[pos - 1] + " nên hoán đổi vị trí giữa " + x +
                        " và " + array[pos - 1]);
                System.out.println(" Chèn " + array[pos - 1] + " vào vị trí của " + x + " (vị trí " + (pos) + ")");
                array[pos] = array[pos - 1];
                pos--;
                System.out.println(" >> chèn " + x + " vào vị trí của " + array[pos] + "lúc nãy, (vị trí " + pos + ")");
            }
            array[pos] = x;
            System.out.println("Mảng lúc này: ");
            for (int item :array) {
                System.out.println(item + " ");

            }
            if (x > array[i - 1]) {
                System.out.println(x + " lớn hơn " + array[i - 1] +
                        " nên giữ nguyên vị trí, mảng không thay đổi, tăng i lên " + (i + 1));
            }

        }


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập Array[%d]=", i);
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng trước khi sắp xếp: ");
        for (int item: arr) {
            System.out.println(item + " ");

        }

        insertionSort(arr);

    }
}
