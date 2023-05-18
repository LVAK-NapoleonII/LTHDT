/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh3.bai1;

import java.util.ArrayList;

/**
 *
 * @author kle47
 */
public class OrderDetail {

    private int quantity;
    Product product;
    public double caloTotalPrice(){
        return quantity*product.getPrice();
    }

    public OrderDetail(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }
    

    @Override
    public String toString() {
        return "OrderDetail{" + "quantity=" + quantity + ", product=" + product + '}';
    }
    

    public void setProduct(Product product) {
        this.product = product;
    }
    
}
