/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ltc5bai1;

public class Chuyenxe {
    private String Masochuyen,Hovaten,soxe;
    private Double Doanhthu;
    public Chuyenxe(){
 
}

    public String getMasochuyen() {
        return Masochuyen;
    }

    public String getHovaten() {
        return Hovaten;
    }

    public String getSoxe() {
        return soxe;
    }

    public double getDoanhthu() {
        return Doanhthu;
    }

    public void setMasochuyen(String Masochuyen) {
        this.Masochuyen = Masochuyen;
    }

    public void setHovaten(String Hovaten) {
        this.Hovaten = Hovaten;
    }

    public void setSoxe(String soxe) {
        this.soxe = soxe;
    }

    public void setDoanhthu(double Doanhthu) {
        this.Doanhthu = Doanhthu;
    }
    
    public void doanhthu(double Doanhthu){
         System.out.println(Doanhthu);     
    }
}
