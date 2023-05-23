/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh4.bai2;

import java.util.Scanner;

/**
 *
 * @author kle47
 */
public class main {

    public static void main(String[] args) {
        Quanly a = new Quanly();
        Khachhang kh;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("---nemu---");
        System.out.println("1.them khach VN");
        System.out.println("2.them khach NN");
        System.out.println("3.xuat");
        System.out.println("4.tong tung loai");
        System.out.println("4.tinh Tb");
        System.out.println("5.xuat hoa don");
        System.out.println("0.exit");
        do {
            System.out.println("nhap lua chon");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    kh = new KhachhangVN();
                    a.them(kh);
                    break;
                case 2:
                    kh = new KhachhangNN();
                    a.them(kh);
                    break;
                case 3:
                    a.xuatds();
                    break;
                case 4:
                    System.out.println("nhap loai can dem:");
                    sc.nextLine();
                    String loai = sc.nextLine();
                    System.out.println(a.dem(loai));
                case 5:
                    a.tinhTB();
            }
        } while (n != 0);
    }
}