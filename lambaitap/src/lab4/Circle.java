/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;
import java.util.Scanner;


public class Circle {
    private double radius;
    private String color;
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }

    public String getColor() {
        return color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    @Override
    public String toString(){
        return "{ radius: " +radius+ ", color: "+color+"}";
    }
   
}