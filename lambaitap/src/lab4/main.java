/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;


public class main {
    public static void main(String[] args){
        Circle k=new Circle(10, "blue");
        k.getArea();
        k.getColor();
        k.toString();
        System.out.println(k.getArea());
        Cylinder a=new  Cylinder(10, "blue", 20);
        System.out.println(Math.round(a.getVolume()));
    }
}
