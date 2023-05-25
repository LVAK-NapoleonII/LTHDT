/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh5.bai1;

import java.util.Scanner;

/**
 *
 * @author kle47
 */
public class Main {

    public static void main(String[] args) {
        Quanly a = new Quanly();
        Phonghoc ph;
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("--MENU--");
            System.out.println("1.them phong hoc");
            System.out.println("2.Tim phong hoc");
            System.out.println("3.xuat danh sach phong");
            System.out.println("4.xuat danh sach phong dat chuan");
            System.out.println("5.cap nhat phong may tinh");
            System.out.println("6.Xap xep theo day nha");
            System.out.println("7.Xap xep theo dien tich");
            System.out.println("8.xuat phong co 60 may");
            System.out.println("9.tinh tong so phong hoc");
            System.out.println("10.xoa phong hoc");
            System.out.println("0.exit");
            System.out.println("nhap lua chon");
            n = sc.nextInt();
            if (n == 1) {
                System.out.println("[1]Them phong");
                System.out.printf("1.Them phong ly thuyet\n"
                        + "2.Them phong may tinh\n"
                        + "3.Them phong thi nghiem\n"
                        + "Nhap lua chon: ");
                int i = sc.nextInt();
                if (i == 1) {
                    ph = new Phonglythuyet();
                    a.themPhongHoc(ph);
                } else if (i == 2) {
                    ph = new Phongmaytinh();
                    a.themPhongHoc(ph);
                } else if (i == 3) {
                    ph = new Phongthinghiem();
                    a.themPhongHoc(ph);
                }
            } else if (n == 2) {
                String maphong;
                sc.nextLine();
                maphong = sc.nextLine();
                a.tim(maphong);
            } else if (n == 3) {
                a.inDanhSach();
            } else if (n == 4) {
                a.inPhongHocDatChuan();
            } else if (n == 5) {
                String maPhong;
                int k;
                System.out.println("nhap ma phong");
                sc.nextLine();
                maPhong = sc.nextLine();
                System.out.println("nhap so luong may");
                k = sc.nextInt();
                a.capnhatMayTinh(maPhong, n);
            } else if (n == 6) {
                a.sapXepTheoDayNha();
                a.inDanhSach();
            } else if (n == 7) {
                a.sapXepTheoDienTich();
                a.inDanhSach();
            } else if (n == 8) {
                a.inPhongMay60May();
            } else if (n == 9) {
                a.tinhTongSoPhongHoc();
            }else if(n==10){
                String maphong;
                maphong=sc.nextLine();
                sc.nextLine();
                a.xoaPhongHoc(maphong);
            }

        } while (n != 0);
    }

}
