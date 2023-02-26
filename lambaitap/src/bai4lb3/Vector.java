/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4lb3;

/**
 *
 * @author kle47
 */
public class Vector {
    private float x;
    private float y;
    private float z;
    public Vector(){
        this.x=0;
        this.y=0;
        this.z=0;
    }
    public Vector(float x,float y,float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }
    public float getZ(){
        return this.z;
    }
    public void setX(float x){
        this.x=x;
    }
    public void setY(float Y){
        this.y=y;
    }
    public void setZ(float z){
        this.z=z;
    }
    public Vector cong(Vector a) {
       float newx = this.x + a.x;
       float newy = this.y + a.y;
       float newz = this.z + a.z;
       return new Vector(newx, newy, newz);
    }

    public Vector tru(Vector a) {
        float newx = this.x - a.x;
        float newy = this.y - a.y;
        float newz = this.z - a.z;
        return new Vector(newx, newy, newz);
    }

    public Vector nhanHangSo(float a) {
        float newx = this.x * a;
        float newy = this.y * a;
        float newz = this.z * a;
        return new Vector(newx, newy, newz);
    }

    public double nhanVoHuong(Vector a) {
        return this.x * a.x + this.y * a.y + this.z * a.z;
    }
    
}
