package io.redit.base.domains.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Order {
    private String orderId;
    private String name;
    private String status;
    private int quantity;
    private double price;

    public Order(String orderId, String name, String status, int quantity, double price) {
        this.orderId = orderId;
        this.name = name;
        this.status = status;
        this.quantity = quantity;
        this.price = price;
    }


    public Order(String orderId) {
        this.orderId = orderId;
    }

    public Order() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
