/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh1.bai1a;

import java.util.Scanner;

/**
 *
 * @author kle47
 */
public class Vehicle {

    public float trigia, thue;
    public String tenchu, loaixe;
    public int dungtich;

    public Vehicle(float trigia, float thue, String tenchu, String loaixe, int dungtich) {
        this.trigia = trigia;
        this.thue = thue;
        this.tenchu = tenchu;
        this.loaixe = loaixe;
        this.dungtich = dungtich;
    }

    Vehicle() {
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten chu xe");
        tenchu = sc.nextLine();
        System.out.println("nhap loai xe");
        loaixe = sc.nextLine();
        System.out.println("nhap dung tich");
        dungtich = sc.nextInt();
        System.out.println("nhap tri gia");
        trigia = sc.nextFloat();
        if (trigia < 100) {
            thue= trigia * 1 / 100;
        } else if (100 <= trigia && trigia <= 200) {
            thue= trigia * 3 / 100;
        } else {
            thue= trigia * 5 / 100;
        }
    }

    public void xuat() {
        System.out.format("%-26s %-26s %-26s %-26f %-26f\n", tenchu, loaixe, dungtich, trigia,thue);
    }
}
