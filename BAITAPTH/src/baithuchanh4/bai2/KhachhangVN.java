/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh4.bai2;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author kle47
 */
public class KhachhangVN extends Khachhang {

    private String loaiKhachhang;
    private double dongia, dinhMuc;
    private int soluong;

    public KhachhangVN() {

    }

    public KhachhangVN(String loaiKhachhang, double dongia, double dinhMuc, int soluong, String maKh, String hoten, LocalDate ngayraHoaDon) {
        super(maKh, hoten, ngayraHoaDon);
        this.loaiKhachhang = loaiKhachhang;
        this.dongia = dongia;
        this.dinhMuc = dinhMuc;
        this.soluong = soluong;
    }

    public String getLoaiKhachhang() {
        return loaiKhachhang;
    }

    public void setLoaiKhachhang(String loaiKhachhang) {
        this.loaiKhachhang = loaiKhachhang;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public double thanhTien() {
        if (soluong <= dinhMuc) {
            return soluong * dongia;
        } else {
            double soluongvuot = soluong - dinhMuc;
            return soluong * dongia * dinhMuc + soluongvuot * dongia * 2.5;
        }
    }

    @Override
    public String toString() {
        return "KhachhangVN{" + "loaiKhachhang=" + loaiKhachhang + ", dongia=" + dongia + ", dinhMuc=" + dinhMuc + ", soluong=" + soluong + '}';
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap loai khach hang<sinh hoat, kinh doanh, san xuat>");
        loaiKhachhang = sc.nextLine();
        System.out.println("Nhap so luong");
        soluong = sc.nextInt();
        System.out.println("Nhap don gia");
        dongia = sc.nextDouble();
         System.out.println("Nhap dinh muc");
         dinhMuc=sc.nextDouble();
    }
}
