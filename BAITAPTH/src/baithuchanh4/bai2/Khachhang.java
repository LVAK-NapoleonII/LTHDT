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
public class Khachhang {
    private String maKh, hoten;
    LocalDate ngayraHoaDon;

    public Khachhang() {
    }

    public Khachhang(String maKh, String hoten, LocalDate ngayraHoaDon) {
        this.maKh = maKh;
        this.hoten = hoten;
        this.ngayraHoaDon = ngayraHoaDon;
    }

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public LocalDate getNgayraHoaDon() {
        return ngayraHoaDon;
    }

    public void setNgayraHoaDon(LocalDate ngayraHoaDon) {
        this.ngayraHoaDon = ngayraHoaDon;
    }
     public double thanhTien(){
         return 0;
     }

    @Override
    public String toString() {
        return "Khachhang{" + "maKh=" + maKh + ", hoten=" + hoten + ", ngayraHoaDon=" + ngayraHoaDon + '}';
    }
    
    public void Nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap ma khach hang");
        maKh=sc.nextLine();
        System.out.println("nhap ten khach hang");
        hoten=sc.nextLine();
        System.out.println("Nhap ngay");
        int ngay =sc.nextInt();
        System.out.println("Nhap thang :");
        int thang =sc.nextInt();
        System.out.println("Nhap nam :");
        int nam =sc.nextInt();
        ngayraHoaDon = LocalDate.of(nam,thang, ngay);
    }
}
