/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author kle47
 */
public class Sanpham_lab5_bai3 {
    private String tensp;
    private double gia;
    public Sanpham_lab5_bai3(){
        this.gia=0;
        this.tensp=null;
    }
    public Sanpham_lab5_bai3(String tensp,double gia){
        this.gia=gia;
        this.tensp=tensp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    
}
