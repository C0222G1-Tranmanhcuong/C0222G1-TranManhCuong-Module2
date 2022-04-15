package _10_java_collection_framework.exercise.using_linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListProductManager {
    static Scanner sc = new Scanner(System.in);
    static LinkedList<Product> myLinkedList = new LinkedList<>();

    static {
        Product product1 = new Product(1, "Colgate", 12000);
        Product product2 = new Product(2, "Sensodyne", 20000);
        Product product3 = new Product(3, "Closeup", 15000);
        myLinkedList.add(product1);
        myLinkedList.add(product2);
        myLinkedList.add(product3);
    }

    public void addNewProduct() {
        System.out.println("Nhập ID");
        int newId = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên");
        String newName = sc.nextLine();
        System.out.println("Nhập giá");
        double newPrice = Double.parseDouble(sc.nextLine());
        Product newProduct = new Product(newId, newName, newPrice);
        myLinkedList.add(newProduct);
        System.out.println("Thêm thành công");
    }

    public void fixProduct() {
        System.out.println("Nhập ID");
        int id = Integer.parseInt(sc.nextLine());
        boolean check = true;
        for (Product item : myLinkedList) {
            if (item.getId() == id) {
                System.out.println("Nhập ID muốn thêm: ");
                item.setId(Integer.parseInt(sc.nextLine()));
                System.out.println("Nhập tên muốn thêm: ");
                item.setName(sc.nextLine());
                System.out.println("Nhập giá sản phẩm: ");
                item.setPrice(Double.parseDouble(sc.nextLine()));
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

    public void displayProductList() {
        for (Product item : myLinkedList) {
            System.out.println(item.toString());
        }
    }

    public void findByName() {
        System.out.println("Nhập tên sản phẩm");
        String findName = sc.nextLine().toLowerCase();
        boolean check = false;
        for (Product item : myLinkedList) {
            if (item.getName().toLowerCase().equals(findName)) {
                System.out.println("Sản phẩm cần tìm:");
                System.out.println(item.toString());
                check = true;
                break;
            } else {
                check = false;
            }
        }
        if (!check) {
            System.out.println("Không có sản phẩm này");
        }
    }

    public void deleteById() {
        System.out.println("Nhập ID ");
        int id = Integer.parseInt(sc.nextLine());
        boolean check = true;
        for (Product item : myLinkedList) {
            if (item.getId() == id) {
                myLinkedList.remove(item);
                System.out.println("Xoá thành công");
                displayProductList();
                check = true;
                break;
            } else {
                check = false;
            }
        }
        if (!check) {
            System.out.println("Nhập sai");
        }
    }
}
