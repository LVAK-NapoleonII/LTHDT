/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

 
    public class Cylinder extends Circle{
        private double height;
        public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height=height;
        }
        
        public double getHeight(){
            return height;
        }
        public void setheight(double height){
            this.height= height;
        }
        public double getVolume(){
            return height*getArea();
        }
    }
