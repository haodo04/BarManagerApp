package com.app.buchin.model;

public class History {
    private String id;
    private String drinkName;
    private int quantity;
    private double pricePerUnit;
    private long timestamp;

    public History() {

    }

    public History(String id, String drinkName, int quantity, double pricePerUnit, long timestamp) {
        this.id = id;
        this.drinkName = drinkName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.timestamp = timestamp;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getDrinkName() { return drinkName; }
    public void setDrinkName(String drinkName) { this.drinkName = drinkName; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPricePerUnit() { return pricePerUnit; }
    public void setPricePerUnit(double pricePerUnit) { this.pricePerUnit = pricePerUnit; }

    public long getTimestamp() { return timestamp; }
    public void setTimestamp(long timestamp) { this.timestamp = timestamp; }

    // Hàm tính tổng tiền
    public double getTotalPrice() {
        return quantity * pricePerUnit;
    }
}
