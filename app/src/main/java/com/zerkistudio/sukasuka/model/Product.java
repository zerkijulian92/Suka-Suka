package com.zerkistudio.sukasuka.model;

public class Product {
    private int ProductId;
    private String ProductName;
    private int Quantity;
    private String SKU;

    //Constructor
    public Product(int productId, String productName, int quantity, String SKU) {
        ProductId = productId;
        ProductName = productName;
        Quantity = quantity;
        this.SKU = SKU;
    }

    //Constructor ProductId, ProductName
    public Product(int productId, String productName) {
        ProductId = productId;
        ProductName = productName;
    }

    //Getter and Setter
    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }
}
