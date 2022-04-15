package _10_java_collection_framework.exercise.using_arraylist;

public class Product {
    private String productId;
    private String productName;
    private int productPrice;

    public Product() {
    }

    public Product(String productId, String productName, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getproductId() {
        return productId;
    }

    public void  setproductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void  setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void  setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "productId: " + productId + '\t' +
                ", productName: " + productName + '\t' +
                ", productPrice: " + productPrice+"." ;
    }
}
