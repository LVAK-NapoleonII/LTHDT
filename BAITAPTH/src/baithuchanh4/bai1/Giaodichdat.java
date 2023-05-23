/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh4.bai1;

import java.time.LocalDate;

/**
 *
 * @author kle47
 */
public class Giaodichdat extends Giaodichnhadat {
    private String loaiDat;

    public Giaodichdat() {
    }

    public Giaodichdat(String loaiDat, String maGiaoDich, LocalDate ngayGiaoDich, long donGia, float dienTich) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public Giaodichdat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
   
    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
    
    @Override
    public double thanhTien(){
        if(loaiDat.equals("A")){
            return getDienTich()* getDonGia()*1.5;
        }else{
            return getDonGia()*getDienTich();
        }
    }

    @Override
    public void Nhap(){
        super.Nhap();
        System.out.println("nhap loai dat (A,B,C): " );
        sc.nextLine();
        loaiDat= sc.nextLine();
    }
    
    
    @Override
    public String toString() {
        return super.toString() + "loaiDat=" + loaiDat + '}';
    }
    
    
}
