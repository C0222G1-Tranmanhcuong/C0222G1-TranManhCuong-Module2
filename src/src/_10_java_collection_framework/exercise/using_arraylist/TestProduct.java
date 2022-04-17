package _10_java_collection_framework.exercise.using_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        Product product1 = new Product("AA", "Colgate", 12000);
        Product product2 = new Product("BB", "Sensodyne", 20000);
        Product product3 = new Product("CC", "P/S", 15000);
        products.add(product1);
        products.add(product2);
        products.add(product3);

        int choose = -1;
        while (choose < 8) {
            System.out.println(" 1. Thêm sản phẩm");
            System.out.println(" 2. Xoá sản phẩm");
            System.out.println(" 3. Tìm kiếm sản phẩm");
            System.out.println(" 4. Hiển thị sản phẩm");
            System.out.println(" 5. Sửa sản phẩm");
            System.out.println(" 6. Sắp xếp sản phẩm theo giá tăng dần");
            System.out.println(" 7. Sắp xếp sản phẩm theo giá giảm dần");
            System.out.println("Nhập lựa chọn: ");
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    ProductManager.addProduct(products);
                    break;
                case 2:
                    ProductManager.removeProduct(products);
                    break;
                case 3:

                    ProductManager.findProduct(products);
                    break;
                case 4:
                    ProductManager.displayProduct(products);
                    break;
                case 5:
                    ProductManager.fixProduct(products);
                    break;
                case 6:
                    ProductManager.sortIncrease(products);
                    break;
                case 7:
                    ProductManager.sortDecrease(products);
                    break;
                default:
                    System.out.println("Trở lại!");
                    break;
            }
        }
    }
}
