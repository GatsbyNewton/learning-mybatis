package edu.wzm.domain;

/**
 * Created by gatsbynewton on 2017/8/15.
 */
public class Order {

    private int id;
    private String orderNo;
    private float price;

    public Order() {
    }

    public Order(String orderNo, float price) {
        this.orderNo = orderNo;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order: [id=" + id + ", orderNo=" + orderNo + ", price=" + price + "]";
    }
}
