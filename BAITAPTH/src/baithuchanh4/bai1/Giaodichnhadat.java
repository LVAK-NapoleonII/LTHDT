/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh4.bai1;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author kle47
 */
public class Giaodichnhadat {

    private String maGiaoDich;
    private LocalDate ngayGiaoDich;
    private long donGia;
    private float dienTich;
    Scanner sc = new Scanner(System.in);

    public Giaodichnhadat() {
    }

    public Giaodichnhadat(String maGiaoDich, LocalDate ngayGiaoDich, long donGia, float dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public LocalDate getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public LocalDate date() {
        return LocalDate.now();
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public double thanhTien(){
        return 0;
    }
    
    public void Nhap() {
        System.out.println("nhap ma giao dich :");
        maGiaoDich = sc.nextLine();
        System.out.println("Nhap ngay :");
        int ngay =sc.nextInt();
        System.out.println("Nhap thang :");
        int thang =sc.nextInt();
        System.out.println("Nhap nam :");
        int nam =sc.nextInt();
        ngayGiaoDich = LocalDate.of(nam,thang, ngay);
        System.out.println("nhap don gia");
        donGia = sc.nextLong();
        System.out.println("nhap dien tich");
        dienTich = sc.nextFloat();
    }

    @Override
    public String toString() {
        return "Giaodichnhadat{" + "maGiaoDich=" + maGiaoDich + ", ngayGiaoDich=" + ngayGiaoDich + ", donGia=" + donGia + ", dienTich=" + dienTich + '}';
    }

}
