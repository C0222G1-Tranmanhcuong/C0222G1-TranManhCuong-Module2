package _10_java_collection_framework.exercise.using_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    public static void addProduct(ArrayList<Product> products) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ID sản phẩm muốn thêm: ");
        String productID = input.nextLine();
        System.out.println("Nhập tên sản phẩm muốn thêm: ");
        String productName = input.nextLine();
        System.out.println("Nhập giá sản phẩm muốn thêm: ");
        int productPrice = Integer.parseInt(input.nextLine());
        for (Product item : products) {
            if (item.getproductId().equals(productID)) {
                System.out.println("Sản phẩm này đã có !");
                addProduct(products);
            }
        }
        Product product = new Product(productID, productName, productPrice);
        products.add(product);
        System.out.println("Đã thêm sản phẩm thành công!");
        System.out.println(products);

    }

    public static void removeProduct(ArrayList<Product> products) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập ID sản phẩm cần xoá: ");
        String productID = input.nextLine();
        boolean check = false;
        for (Product item : products) {
            if (item.getproductId().equals(productID)) {
                products.remove(item);
                System.out.println(products.toString());
                check = true;
                break;

            } else {
                check = false;
            }
        }
        if (!check) {
            System.out.println("Nhập Sai ID!");
        }
    }

    public static void displayProduct(ArrayList<Product> products) {

        for (Product item : products) {
            System.out.println(item.toString());

        }
    }

    public static void findProduct(ArrayList<Product> products) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Nhập tên sản phẩm cần tìm kiếm: ");
        String productName = input.nextLine();
        boolean check = false;
        for (Product item : products) {
            if (item.getProductName().equals(productName)) {
                System.out.println("Sản phẩm cần tìm là: ");
                System.out.println(item.toString());
                check = true;
                break;
            } else {
                check = false;
            }

        }
        if (!check) {
            System.out.println(" Không có sản phẩm");
        }
    }

    public static void fixProduct(ArrayList<Product> products) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ID sản phẩm muốn sửa: ");
        String id = input.nextLine();
        boolean check = true;
        for (Product item : products) {
            if (item.getproductId().equals(id)) {
                System.out.println("Nhập ID sản phẩm mới: ");
                item.setproductId(input.nextLine());
                System.out.println("Nhập tên sản phẩm mới: ");
                item.setProductName(input.nextLine());
                System.out.println("Nhập giá sản phẩm mới: ");
                item.setProductPrice(Integer.parseInt(input.nextLine()));
                System.out.println(products);
                check = true;
                break;
            } else {
                check = false;
            }
        }
        if (!check) {
            System.out.println("Nhập sai ID!");
        }
    }

    public static void sortAscending(ArrayList<Product> products) {
        AscendingProduct ascendingProduct = new AscendingProduct();
        Collections.sort(products, ascendingProduct);

    }

    public static void sortDescending(ArrayList<Product> products) {
        DescendingProduct descendingProduct = new DescendingProduct();
        Collections.sort(products, descendingProduct);


    }
}
