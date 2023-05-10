package Quanlycaycanh;

import java.util.Scanner;
import java.io.Serializable;

public class CayCanh implements Serializable {

    String MaCC;
    String tencay;
    String phanloai;
    int soluong;
    int ngay, thang, nam;

    public CayCanh(String MaCC, String tencay, String phanloai, int soluong, int ngay, int thang, int nam) {
        this.tencay = tencay;
        this.phanloai = phanloai;
        this.MaCC = MaCC;
        this.soluong = soluong;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public CayCanh() {
    }

    public String gettencay() {
        return tencay;
    }

    public void settencay(String tencay) {
        this.tencay = tencay;
    }

    public String getPhanloai() {
        return phanloai;
    }

    public void setPhanloai(String phanloai) {
        this.phanloai = phanloai;
    }

    public String getMaCC() {
        return MaCC;
    }

    public void setMaCC(String MaCC) {
        this.MaCC = MaCC;
    }

    public void setsoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getsoluong() {
        return soluong;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void NhapThoiGian() {
        Scanner input = new Scanner(System.in);
        do {
            if (0 < ngay && ngay < 31) {
                System.out.println("nhap ngay:");
                ngay = input.nextInt();
            }
            if (0 < thang && thang <= 12) {
                System.out.println("nhap thang:");
                thang = input.nextInt();
            }
            if (0 < nam) {
                System.out.println("nhap nam:");
                nam = input.nextInt();
            }
        } while (ngay<0||ngay>31||thang>12||thang<0||nam<0);
    }

    public void Nhapcaycanh() {
        NhapThoiGian();
        Scanner input = new Scanner(System.in);
        System.out.println("nhap ten cay:");
        tencay = input.nextLine();
        System.out.println("nhap loai cay:");
        phanloai = input.nextLine();
        System.out.println("nhap ma cay:");
        MaCC = input.nextLine();
        System.out.println("Nhap so luong cay ");
        soluong = input.nextInt();
    }

    public void Xuatcaycanh() {
        System.out.println("----| Ma cay canh: " + getMaCC()+"|" + "| ten cay : " + gettencay()+"|" + "| Loai cay: " + getPhanloai() +"|"+"| So Luong " + getsoluong()+"|" + "thoi gian nhap: "+ngay+"/"+thang+"/"+nam+"-----");
    }
}
