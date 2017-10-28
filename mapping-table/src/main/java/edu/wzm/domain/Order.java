package edu.wzm.domain;

/**
 * Created by gatsbynewton on 2017/8/15.
 */
public class Order {

    private int id;
    private String orderNo;
    private float price;
    private String address;
    private String phone;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Orders[")
                .append("id=" + id)
                .append(", orderNo=" + orderNo)
                .append(", price=" + price)
                .append(", address=" + address)
                .append(", phone=" + phone)
                .append("]");

        return sb.toString();
    }
}
