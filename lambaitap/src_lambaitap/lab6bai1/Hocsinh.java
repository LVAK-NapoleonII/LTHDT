/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6bai1;

public class Hocsinh {
    private String Hovaten,lop;
    private float toan,ly,hoa;
    public Hocsinh(){
        this.Hovaten=null;
        this.hoa=0;
        this.lop=null;
        this.ly=0;
        this.toan=0;
    }
    public String getHovaten() {
        return Hovaten;
    }

    public String getLop() {
        return lop;
    }

    public float getToan() {
        return toan;
    }

    public float getLy() {
        return ly;
    }

    public float getHoa() {
        return hoa;
    }
    public void setHovaten(String Hovaten) {
        this.Hovaten = Hovaten;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public void setLy(float ly) {
        this.ly = ly;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }
    public float Dtb(float toan,float lu,float hoa){
        return (toan+ly+hoa)/2;
    }
}
