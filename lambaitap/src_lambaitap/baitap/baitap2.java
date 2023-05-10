/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

import java.util.Scanner;

/*******************
*phuong trinh bac 2*
*******************/
public class baitap2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("giai phuong trinh bac 2: y=ax^2+bx+c");
        System.out.print("nhap gia tri a: ");
        float a = input.nextFloat();
        System.out.print("nhap gia tri b: ");
        float b = input.nextFloat();
        System.out.print("nhap gia tri c: ");
        float c = input.nextFloat();
        if(a==0){
            System.out.println("phuong trinh tro thanh bac nhat!!");
            if(b==0){
            if(c==0){
                System.out.println("phuong trinh vo so nghiem!!");
            }
            else{
                System.out.println("phuong trinh vo nghiem!!");
            }   
        }
        else{
            System.out.println("nghiem cua phuong trinh la : " + (-c/b));
        }
        }
       float delta = b*b - 4*a*c;
        float x1,x2,x;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phuong trinh co 2 nghiem la:"+x1+" va "+x2 );
        } else if (delta == 0) {
            x=(-b / (2 * a));
            System.out.println("Phuong trinh có nghiem kep: " + x);
        } else {
            System.out.println("Phuong trinh vo nghiem!!");
        }
        
    }
            
    
}
