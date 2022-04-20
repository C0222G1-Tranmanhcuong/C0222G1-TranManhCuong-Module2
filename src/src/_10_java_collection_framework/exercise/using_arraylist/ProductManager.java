package _10_java_collection_framework.exercise.using_arraylist;

import java.util.*;

public class ProductManager {
    public static void addProduct(List<Product> products) {

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
        displayProduct(products);

    }

    public static void removeProduct(List<Product> products) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập ID sản phẩm cần xoá: ");
        String productID = input.nextLine();
        boolean check = false;
        for (Product item : products) {
            if (item.getproductId().equals(productID)) {
                products.remove(item);
                displayProduct(products);
                check = true;
                break;

            }
        }
        if (!check) {
            System.out.println("Nhập Sai ID!");
        }
    }

    public static void displayProduct(List<Product> products) {

        for (Product item : products) {
            System.out.println(item.toString());

        }
    }


    public static void findProduct(List<Product> products) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Nhập tên sản phẩm cần tìm kiếm: ");
        String productName = input.nextLine();
        boolean check = false;
        for (Product item : products) {
            if (item.getProductName().contains(productName)) {
                System.out.println("Sản phẩm cần tìm là: " + item);
                check = true;
                break;
            }

        }
        if (!check) {
            System.out.println(" Không có sản phẩm");
        }
    }


    public static void fixProduct(List<Product> products) {
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
                displayProduct(products);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Nhập sai ID!");
        }
    }

    public static void sortIncrease(List<Product> products) {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getProductPrice() - o2.getProductPrice();
            }
        });
        displayProduct(products);
    }

    public static void sortDecrease(List<Product> products) {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getProductPrice() - o1.getProductPrice();
            }
        });
        displayProduct(products);
    }
}
