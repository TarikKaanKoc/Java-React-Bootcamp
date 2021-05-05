package nLayeredDemo.entites.concretes;

import nLayeredDemo.entites.abstracts.Entity;

public class Product implements Entity {

    private int id;
    private int categoryId;
    private String productName;
    private double unitPrice;
    private int unitsInstock;

    public Product(){

    }

    public Product(int id, int categoryId, String productName, double unitPrice, int unitsInstock) {
        this.setId(id);
        this.setCategoryId(categoryId);
        this.setProductName(productName);
        this.setUnitPrice(unitPrice);
        this.setUnitsInstock(unitsInstock);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getUnitsInstock() {
        return unitsInstock;
    }

    public void setUnitsInstock(int unitsInstock) {
        this.unitsInstock = unitsInstock;
    }
}
