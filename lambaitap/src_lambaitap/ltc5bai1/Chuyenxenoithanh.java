/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ltc5bai1;


public class Chuyenxenoithanh extends Chuyenxe{
    private int Sotuyen;
    private float Sokmdidc;
    public Chuyenxenoithanh(){       
    }

    public int getSotuyen() {
        return Sotuyen;
    }

    public float getSokmdidc() {
        return Sokmdidc;
    }

    public void setSotuyen(int Sotuyen) {
        this.Sotuyen = Sotuyen;
    }

    public void setSokmdidc(float Sokmdidc) {
        this.Sokmdidc = Sokmdidc;
    }
    @Override
   public void doanhthu(double Doanhthu){
         System.out.println(Doanhthu);     
    }
}
