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
public class KhachhangNN extends Khachhang {
    private String quoctich;
    private int soluong;
    private double dongia;

    public KhachhangNN() {
     
    }

    public KhachhangNN(String quoctich, int soluong, double dongia, String maKh, String hoten, LocalDate ngayraHoaDon) {
        super(maKh, hoten, ngayraHoaDon);
        this.quoctich = quoctich;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
    
    @Override
    public double thanhTien(){
        return soluong*dongia;
    }
    
    @Override
    public void Nhap(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap quoc tich: ");
        quoctich= sc.nextLine();
        System.out.println("Nhap so luong: ");
        soluong = sc.nextInt();
        System.out.println("nhap don gia: ");
        dongia =sc.nextDouble();
    }

    @Override
    public String toString() {
        return "KhachhangNN{" + "quoctich=" + quoctich + ", soluong=" + soluong + ", dongia=" + dongia + '}';
    }
    
    
}
