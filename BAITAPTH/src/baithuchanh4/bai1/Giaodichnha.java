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
public class Giaodichnha extends Giaodichnhadat {
    private String loainha, diachi;

    public Giaodichnha() {
    }

    public Giaodichnha(String loainha, String diachi) {
        this.loainha = loainha;
        this.diachi = diachi;
    }

    public Giaodichnha(String loainha, String diachi, String maGiaoDich, LocalDate ngayGiaoDich, long donGia, float dienTich) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loainha = loainha;
        this.diachi = diachi;
    }

    public String getLoainha() {
        return loainha;
    }

    public void setLoainha(String loainha) {
        this.loainha = loainha;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    @Override
    public double thanhTien(){
        if(loainha.equals("nha cao cap")){
            return getDienTich()*getDonGia();
        }else{
            return getDienTich()*getDonGia()*0.9;
        }
    }
    
    @Override
    public void Nhap(){
        super.Nhap();
        System.out.println("nhap dia chi");
        sc.nextLine();
        diachi= sc.nextLine();
        System.out.println("nhap loai nha: 0:nha cao cap/1: nha thuong");
        int luachon = sc.nextInt();
        switch(luachon){
            case 0:
                loainha = " nha cao cap";
                break;
            case 1:
                loainha = "nha thuong";
                break;
            default :
                System.out.println("sai cu phap");
                break;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "loainha=" + loainha + ", diachi=" + diachi + '}';
    }
       
}
