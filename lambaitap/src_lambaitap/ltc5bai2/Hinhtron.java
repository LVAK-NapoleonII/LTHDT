/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ltc5bai2;

public class Hinhtron extends Hinh {
    private float r;
    public Hinhtron(float r){
        this.r=r;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
    public double dientich(){
        return Math.PI*r;
    }
}
