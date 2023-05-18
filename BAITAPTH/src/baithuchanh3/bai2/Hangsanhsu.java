/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh3.bai2;

import java.time.LocalDate;

/**
 *
 * @author kle47
 */
public class Hangsanhsu extends Hanghoa{
    private String nhasanxuat;
    private LocalDate ngaynhapkho;

    public Hangsanhsu(String nhasanxuat, LocalDate ngaynhapkho, String mahang, String tenhang, int soluongton, double dongia) {
        super(mahang, tenhang, soluongton, dongia);
        this.nhasanxuat = nhasanxuat;
        this.ngaynhapkho = ngaynhapkho;
    }

    public String getNhasanxuat() {
        return nhasanxuat;
    }

    public void setNhasanxuat(String nhasanxuat) {
        this.nhasanxuat = nhasanxuat;
    }

    public LocalDate getNgaynhapkho() {
        return ngaynhapkho;
    }

    public void setNgaynhapkho(LocalDate ngaynhapkho) {
        this.ngaynhapkho = ngaynhapkho;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
    
    @Override
    public double phiVAT() {
        return dongia*0.1;
    }

    @Override
    public String toString() {
        return "Hangsanhsu{" + "nhasanxuat=" + nhasanxuat + ", ngaynhapkho=" + ngaynhapkho + '}';
    }
    
}
