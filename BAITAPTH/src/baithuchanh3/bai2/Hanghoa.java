/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh3.bai2;

/**
 *
 * @author kle47
 */
public abstract class Hanghoa {

    private String mahang, tenhang;
    private int soluongton;
    double dongia;

    public Hanghoa(String mahang, String tenhang, int soluongton, double dongia) {
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.soluongton = soluongton;
        this.dongia = dongia;
    }

    public String getMahang() {
        return mahang;     
    }

    public void setMahang(String mahang) {
        if( this.mahang!=""){
            this.mahang = mahang;
        }this.mahang="chua xac dinh";
        
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        if(this.tenhang !=""){
             this.tenhang = tenhang;
        }this.tenhang="chua xac dinh";
       
    }

    public int getSoluongton() {
        return soluongton;
    }

    public void setSoluongton(int soluongton) {
        if(this.soluongton>=0){
            this.soluongton = soluongton;
        }System.out.println("loi!!");
        
    }


    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        if(this.dongia>0){
            this.dongia = dongia;
        }System.out.println("loi!!!");    
    }

    @Override
    public String toString() {
        return "Hanghoa{" + "mahang=" + mahang + ", tenhang=" + tenhang + ", soluongton=" + soluongton + ", dongia=" + dongia + '}';
    }
    
    public abstract double phiVAT();
    
}
