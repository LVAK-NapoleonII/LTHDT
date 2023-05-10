/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

import java.util.Scanner;

/**
 *
 * @author kle47
 */
public class SanPham_bai4 {
    private String ten;
    private double gia,giamgia;
    public SanPham_bai4(){
        
    }
    public double getThueNhapKhau(){
       
        return  gia*10/100;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public double getGiamgia() {
        return giamgia;
    }

    public void setGiamgia(double giamgia) {
        this.giamgia = giamgia;
    }
    
    public void nhap(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap ten san pham: ");
        ten=sc.nextLine();
        System.out.println("Nhap don gia: ");
        gia=sc.nextDouble();
        System.out.println("nhap giam gia");
        giamgia=sc.nextDouble();
    }
    public void xuat(){
         System.out.println("ten san pham"+ten+"don gia"+gia+"giam gia"+giamgia+"Thue nhap khau"+getThueNhapKhau());
    }
}
