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
public class main {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        List a = new List();
        Vehicle b;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("menu");
        System.out.println("1. nhap thong tin dang ky xe");
        System.out.println("2. xuat thong tin dang ky xe");
        System.out.println("0.thoat");
        do {
            System.out.print(
                    "Lua chon: ");
            n = input.nextInt();
            switch (n) {
                case 1 -> {
                    b = new Vehicle();
                    a.DS(b);
                }
                case 2 -> {
                    System.out.format("%-26s %-26s %-26s %-26s %-26s\n", "ten chu xe", "loai xe", "dung tich", "tri gia", "thue phai nop");
                    System.out.println("==============================================================================================================================================");
                    a.hien();
                }
                default -> {
                }
            }
        } while (n != 0);
    }

}
