/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh3.bai2;

/**
 *
 * @author kle47
 */
public class Hangdienmay extends Hanghoa {

    private int thoigianbaohanh;
    private float congsuat;

    public Hangdienmay(int thoigianbaohanh, float congsuat, String mahang, String tenhang, int soluongton, double dongia) {
        super(mahang, tenhang, soluongton, dongia);
        this.thoigianbaohanh = thoigianbaohanh;
        this.congsuat = congsuat;
    }

    public int getThoigianbaohanh() {
        return thoigianbaohanh;
    }

    public void setThoigianbaohanh(int thoigianbaohanh) {
        if (this.thoigianbaohanh > 0) {
            this.thoigianbaohanh = thoigianbaohanh;
        }System.out.println("loi");
    }

    public float getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(float congsuat) {
        if(this.congsuat>0){
             this.congsuat = congsuat;
        }System.out.println("loi");       
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    @Override
    public double phiVAT() {
        return dongia * 0.1;
    }

    @Override
    public String toString() {
        return "Hangdienmay{" + "thoigianbaohanh=" + thoigianbaohanh + ", congsuat=" + congsuat + '}';
    }

    
}
