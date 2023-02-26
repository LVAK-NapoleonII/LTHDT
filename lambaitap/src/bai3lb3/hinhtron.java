/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3lb3;

/**
 *
 * @author kle47
 */
public class hinhtron {
    private float r;
    public hinhtron(){
        this.r=1;
    }
    public hinhtron(float r){
        this.r=r;
    }
    public float getR(){
        return r;
    }
    public void setR(){
        this.r=r;
    }
    public float s(){
        return (float) (this.r*this.r*Math.PI);
    }
    public float vc(){
        return (float) (2*this.r*Math.PI); 
    }
}
