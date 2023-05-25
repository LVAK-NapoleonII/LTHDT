package baithuchanh5.bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Phonghoc {

    private String maPhong;
    private String dayNha;
    double dienTich;
    private int soBongDen;
    Scanner sc = new Scanner(System.in);

    public Phonghoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    public Phonghoc() {
    }

    public String getMaPhong() {
        return maPhong;
    }

    public String getDayNha() {
        return dayNha;
    }

    public double getDienTich() {
        return dienTich;
    }

    public int getSoBongDen() {
        return soBongDen;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public void setSoBongDen(int soBongDen) {
        this.soBongDen = soBongDen;
    }

    public boolean datChuan() {
        return true;
    }

    public void Nhap() {
        System.out.println("Nhap ma phong: ");
        maPhong = sc.nextLine();
        System.out.println("Nhap day nha: ");
        dayNha = sc.nextLine();
        System.out.println("Nhap dien tich: ");
        dienTich = sc.nextDouble();
        System.out.println("nhap so bong den: ");
        soBongDen = sc.nextInt();
    }

    public void Xuat() {
        System.out.print("PhongHoc: | maPhong: " + maPhong + "|" + " dayNha :" + dayNha + "|" + " dienTich :" + dienTich + "|" + " soBongDen :"
                + soBongDen + "|");
    }
}
