package _15_io_binary_file_and_serialization.exercise.product_manager_saves_to_binary_files;

import _14_io_text_file.exercise.read_file_csv.ReadAndWrite;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String PRODUCT = "src\\_15_io_binary_file_and_serialization\\exercise\\product_manager_saves_to_binary_files\\productManager.txt";
    private static List<Product> productList = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    private static ReadAndWriteFileProduct readAndWrite = new ReadAndWriteFileProduct();

    public static void main(String[] args) throws IOException {


        productList.add(new Product(1, "Hyundai Accent", "Hyundai", 5000));
        productList.add(new Product(2, "Toyota Vios", "Toyota", 6000));
        productList.add(new Product(3, "Mazda CX-5", "Mazda", 7000));


        int choose = -1;
        while (choose < 4) {
            System.out.println("--------Menu-------");
            System.out.println(" 1. Hiển thị sản phẩm");
            System.out.println(" 2. Thêm sản phẩm");
            System.out.println(" 3. Tìm kiếm thông tin sản phẩm");
            System.out.println(" 4. Exit!");
            System.out.println("Nhập lựa chọn: ");
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    displayProduct();

                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    findByName();
                    break;
                case 4:
                    System.out.println("Exit!");
                    break;
            }
        }
    }

    public static void displayProduct() {

        try {
            productList = readAndWrite.readFileBinary(PRODUCT
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Product item : productList) {
            System.out.println(item);

        }
    }

    public static void addProduct() throws IOException {
        productList = readAndWrite.readFileBinary(PRODUCT);
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm muốn thêm: ");
        int productCode = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên sản phẩm muốn thêm: ");
        String productName = input.nextLine();
        System.out.println("Nhập hãng sản xuất của sản phẩm muốn thêm: ");
        String manufacturer = input.nextLine();
        System.out.println("Nhập giá sản phẩm muốn thêm: ");
        int productPrice = Integer.parseInt(input.nextLine());
        Product product = new Product(productCode, productName, manufacturer, productPrice);
        productList.add(product);
        try {
            readAndWrite.writerFileBinary(PRODUCT, productList);

        } catch (IOException e) {
            e.printStackTrace();
        }
        displayProduct();


    }

    public static void findByName() throws IOException {
        productList = readAndWrite.readFileBinary(PRODUCT);
        System.out.println(" Nhập tên sản phẩm cần tìm kiếm: ");
        String productName = input.nextLine();
        boolean check = false;
        for (Product item : productList) {
            if (item.getProductName().toLowerCase().contains(productName.toLowerCase())) {
                System.out.println("Sản phẩm cần tìm là: " + item);
                check = true;
                break;
            }

        }
        if (!check) {
            System.out.println(" Không có sản phẩm");
        }
    }
}
