/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh4.bai1;

import java.util.Scanner;

/**
 *
 * @author kle47
 */
public class main {

    public static void main(String[] args) {
        Quanly a = new Quanly();
        Giaodichnhadat g;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Menu-----");
        System.out.println("1.them giao dich dat");
        System.out.println("2.them giao dich nha");
        System.out.println("3.hien giao dich");
        System.out.println("4.tong so luong");
        System.out.println("5. tinh trung binh");
        System.out.println("6.xuat giao dich hom nay");
        System.out.println("0.thoat");
        do {
            System.out.println("nhap lua chon");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    g = new Giaodichdat();
                    a.themGiaoDich(g);
                    break;
                case 2:
                    g = new Giaodichnha();
                    a.themGiaoDich(g);
                    break;
                case 3:
                    a.HienGd();
                    break;
                case 4:
                    System.out.println("nhap loai can dem:");
                    sc.nextLine();
                    String loai = sc.nextLine();
                    System.out.println(a.Dem(loai));
                case 5:
                    a.TBthanhtien();
                case 6:
                    a.HienGd();
            }
        }while(n!=0);
    }
}
