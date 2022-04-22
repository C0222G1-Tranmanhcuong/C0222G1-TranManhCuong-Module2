package _15_io_binary_file_and_serialization.exercise.product_manager_saves_to_binary_files;

import java.io.Serializable;

public class Product implements Serializable {
    private int productCode;
    private String productName;
    private String manufacturer;
    private int productPrice;

    public Product() {
    }

    public Product(int productCode, String productName, String manufacturer, int productPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.productPrice = productPrice;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product: " +
                "productCode: " + productCode +
                ", ProductName: " + productName +
                ", Manufacturer: " + manufacturer  +
                ", ProductPrice: " + productPrice + ".";
    }
}
