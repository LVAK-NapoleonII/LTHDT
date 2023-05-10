/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5lb3;

/**
 *
 * @author kle47
 */
public class Nhanvien {
    private String tenNhanVien;
    private double luongcoban;
    private double hesoLuong;
    private double LUONG_MAX;
    public Nhanvien(){
        this.LUONG_MAX=0;
        this.hesoLuong=0;
        this.luongcoban=0;
        this.tenNhanVien=null;
    }
    public Nhanvien(String tenNhanvien,double luoncoban,double hesoLuong,double LUONG_MAX, double hesoluong){
        this.LUONG_MAX=LUONG_MAX;
        this.hesoLuong=hesoluong;
        this.luongcoban=luongcoban;
        this.tenNhanVien=tenNhanvien;
    }
    public String getTenNhanvien(){
        return this.tenNhanVien;
    }
    public double getLuongcoban(){
        return this.luongcoban;
    }
    public double getHesoluong(){
        return this.hesoLuong;
    }
    public double getLUONG_MAX(){
        return this.LUONG_MAX;
    }
    public void setTenNhanvien(String tenNhanvien){
        this.tenNhanVien=tenNhanvien;
    }
     public void setLuongcoban(double luongcoban){
        this.luongcoban=luongcoban;
    }
      public void setHesoluong(double hesoLuong){
        this.hesoLuong=hesoLuong;
    }
       public void setLUONG_MAX(double LUONG_MAX){
        this.LUONG_MAX=LUONG_MAX;
    }
        public double tinhluong(){
            double luong=luongcoban* hesoLuong;
        return luong;
        }
       public boolean tangluong (double a){
            setHesoluong(a);
        if (tinhluong() > this.LUONG_MAX){
            return false;
        } else {
            return true;
        }
    }
        public void inTTin() {
        System.out.println("ten nhan vien " + tenNhanVien + "luong co ban" + luongcoban + "he so luong" + hesoLuong
                + "luong toi da" + LUONG_MAX);
    }
}
