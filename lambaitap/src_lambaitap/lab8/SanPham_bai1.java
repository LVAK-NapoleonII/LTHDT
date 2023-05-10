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
public class SanPham_bai1 {
    public String ten;
    public double gia,giamgia;
    public SanPham_bai1(){
        
    }
    public double getThueNhapKhau(){
       
        return gia*10/100;
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
