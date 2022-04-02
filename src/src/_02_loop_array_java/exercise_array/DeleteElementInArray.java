package _02_loop_array_java.exercise_array;

import java.util.Scanner;

public class DeleteElementInArray {
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

        //Nhập giá trị cần xoá.
        System.out.print("Nhap gia tri can xoa: ");
        int x = input.nextInt();
        int index;
        int count = 0;
        //Duyệt mảng xem x có trong mảng hay không.
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
                index = i;
                System.out.print("Vi tri phan tu can xoa la: " + index);// nếu có thì xuất ra vị trị x trong mảng.

                //Thực hiện xoá bằng cách dịch chuyển từ vị trí xoá+1 cho đến phần tử cuối sang trái 1 dvi.
                for (i = index; i < n; i++) {
                    arr[i] = arr[i + 1];

                }
                n--;
                break;

            }
        }
        // Xuất ra mảng mới.
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("Arr[%d]= %d\n", i, arr[i]);
        }
        if (count == 0) {
            System.out.print("Khong co");
        }

    }
}


