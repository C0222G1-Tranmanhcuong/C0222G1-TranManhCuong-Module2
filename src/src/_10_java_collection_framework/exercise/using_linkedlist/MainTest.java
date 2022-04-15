package _10_java_collection_framework.exercise.using_linkedlist;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListProductManager myLinkedList = new LinkedListProductManager();
        boolean check = true;
        while (check){
            System.out.println("1. Hiển thị danh sách sản phẩm");
            System.out.println("2.Thêm mới");
            System.out.println("3. Sửa sản phẩm");
            System.out.println("4. Xoá sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm");
            System.out.println("6. Sắp xếp sản phẩm");
            System.out.print("Menu: ");
            switch (Integer.parseInt(sc.nextLine())){
                case 1:
                    myLinkedList.displayProductList();
                    break;
                case 2:
                    myLinkedList.addNewProduct();
                    break;
                case 3:
                    myLinkedList.fixProduct();
                    break;
                case 4:
                    myLinkedList.deleteById();
                    break;
                case 5:
                    myLinkedList.findByName();
                    break;
                case 6:
                    break;

                default:
                    System.out.println("trở lại");
                    break;
            }
        }
    }
}
