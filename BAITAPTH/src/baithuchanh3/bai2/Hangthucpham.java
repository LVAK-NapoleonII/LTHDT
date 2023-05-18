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
public class Hangthucpham extends Hanghoa {
    private LocalDate ngaysanxuat,ngayhethan;
    private String nhacungcap;

    public Hangthucpham(LocalDate ngaysanxuat, LocalDate ngayhethan, String nhacungcap, String mahang, String tenhang, int soluongton, double dongia) {
        super(mahang, tenhang, soluongton, dongia);
        this.ngaysanxuat = ngaysanxuat;
        this.ngayhethan = ngayhethan;
        this.nhacungcap = nhacungcap;
    }

    public LocalDate getNgaysanxuat() {
        return ngaysanxuat;
    }

    public void setNgaysanxuat(LocalDate ngaysanxuat) {
        this.ngaysanxuat = ngaysanxuat;
    }

    public LocalDate getNgayhethan() {
        return ngayhethan;
    }

    public void setNgayhethan(LocalDate ngayhethan) {
        this.ngayhethan = ngayhethan;
    }

    public String getNhacungcap() {
        return nhacungcap;
    }

    public void setNhacungcap(String nhacungcap) {
        this.nhacungcap = nhacungcap;
    }
    
    @Override
    public double phiVAT() {
        return 0.05*dongia;
    }

    @Override
    public String toString() {
        return "Hangthucpham{" + "ngaysanxuat=" + ngaysanxuat + ", ngayhethan=" + ngayhethan + ", nhacungcap=" + nhacungcap + '}';
    }
    
}
