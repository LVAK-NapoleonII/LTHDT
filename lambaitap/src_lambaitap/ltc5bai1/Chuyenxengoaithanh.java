/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ltc5bai1;

public class Chuyenxengoaithanh extends Chuyenxe {
    private String Noiden,Songaydidc;
    public Chuyenxengoaithanh(){
        
    }

    public String getNoiden() {
        return Noiden;
    }

    public String getSongaydidc() {
        return Songaydidc;
    }

    public void setNoiden(String Noiden) {
        this.Noiden = Noiden;
    }

    public void setSongaydidc(String Songaydidc) {
        this.Songaydidc = Songaydidc;
    }
    @Override
   public void doanhthu(double Doanhthu){
         System.out.println(Doanhthu);     
    }
    
}
