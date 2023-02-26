/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1lb3;


public class Striagle {
    private float width;
    private float height;
    public Striagle(){
        this.width=0.0f;
        this.height=0.0f;
    }
    public Striagle (float width, float height){
        this.width=width;
        this.height=height;
    }
    public float getWidth() {
        return this.width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public float getHeight() {
        return this.height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "{" +
            " width='" + getWidth() + "'" +
            ", height='" + getHeight() + "'" +
            "}";
    }

}   

