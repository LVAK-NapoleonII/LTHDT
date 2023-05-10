/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3lb3;

public class hinhvuong {
    private float canh;
    public hinhvuong(){
        this.canh=1;
    }
    public hinhvuong(float canh){
        this.canh=canh;
    }
    public float getCanh(){
        return canh;
    }
    public void setCanh(float a){
        this.canh=a;
    }
    public float s(){
        return this.canh*this.canh;
    }
    public float cv(){
        return 4*this.canh;
    }
}
