/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh3.bai1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Product p1 = new Product("Nuoc tuong", "sp4", 8000);
        Product p2 = new Product("Gao", "sp1", 18000);
        Product p3 = new Product("Duong", "sp3", 10000);
        Product p4 = new Product("Gao", "sp1", 18000);
        Product p5 = new Product("Muoi", "sp5", 20000);
        Product p6 = new Product("Sua", "sp6", 25000);
        Product p7 = new Product("Gao", "sp1", 18000);
        OrderDetail o1 = new OrderDetail(10, p1);
        OrderDetail o2 = new OrderDetail(5, p2);
        OrderDetail o3 = new OrderDetail(1, p3);
        OrderDetail o4 = new OrderDetail(1, p4);
        OrderDetail o5 = new OrderDetail(1, p5);
        OrderDetail o6 = new OrderDetail(1, p6);
        OrderDetail o7 = new OrderDetail(1, p7);
        Order o = new Order();
        o.addLineItem(10, p1);
        o.addLineItem(5, p2);
        o.addLineItem(1, p3);
        o.addLineItem(1, p4);
        o.addLineItem(1, p5);
        o.addLineItem(1, p6);
        o.addLineItem(1, p7);
        System.out.println("Ngay lap hoa don: "+LocalDate.now());
        o.xuat();  
        System.out.println("Tong tien thanh toan: "+ o.caloTatalCharge());
    }
}
