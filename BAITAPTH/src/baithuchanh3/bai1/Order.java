/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh3.bai1;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author kle47
 */
public class Order {

    private int orderID, count;
    private LocalDate orderDate;
    ArrayList<OrderDetail> lineItems;

    public Order() {
        lineItems = new ArrayList<OrderDetail>();
    }

    public LocalDate date() {
        return LocalDate.now();
    }

    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate=orderDate;
    }

    public void addLineItem(int x, Product p) {
        lineItems.add(new OrderDetail(x, p));
    }

    public double caloTatalCharge() {
        double tongthanhtien = 0;
        for (OrderDetail x : lineItems) {
            tongthanhtien += x.caloTotalPrice();
        }
        return tongthanhtien;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public ArrayList<OrderDetail> getLineItems() {
        return lineItems;
    }

    @Override
    public String toString() {
        return "Order{" + "orderID=" + orderID + ", count=" + count + ", lineItems=" + lineItems + '}';
    }

    public void xuat() {
        System.out.format("%-10s %-10s %-15s %-15s %-15s %-15s\n",
                "STT",
                "|Ma SP",
                "|Mo ta",
                "|Don gia",
                "|So luong",
                "|Thanh tien");
        for (OrderDetail o : lineItems) {
            System.out.format("%-10s %-10s %-15s %-15s %-15s %-15s\n",
                    lineItems.indexOf(o) + 1,
                    "|" + o.product.getProductID(),
                    "|" + o.product.getDescription(),
                    "|" + o.product.getPrice(),
                    "|" + o.getQuantity(),
                    "|" + o.caloTotalPrice() + "VND");
        }
    }
}
