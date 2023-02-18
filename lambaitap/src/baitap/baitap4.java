/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

import java.util.Scanner;

public class baitap4 {
     public static void bt1() {
        Scanner input = new Scanner(System.in);
        System.out.println("giai phuong trinh bac nhat y=ax+b");
        System.out.println("nhap gia tri a: ");
        float a= input.nextFloat();
        System.out.println("nhap gia tri b: ");
        float b= input.nextFloat();
        if(a==0){
            if(b==0){
                System.out.println("phuong trinh vo so nghiem!!");
            }
            else{
                System.out.println("phuong trinh vo nghiem!!");
            }   
        }
        else{
            System.out.println("nghiem cua phuong trinh la : " + (-b/a));
        }
    }
     public static void bt2(){
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
    public static void bt3(){
        Scanner input= new Scanner(System.in);
        float sodien;
        do{
           System.out.print("nhap so dien dung trong thang: ");
           sodien = input.nextFloat();    
       }while(sodien<0); 
        if(sodien > 0 && sodien < 50){
            float tien=sodien*1000;
            System.out.println("so tien dien trong thang la: "+ tien);
        }
        else if(sodien>50) {
            float tien=50*1000+(sodien-50)*1200;
            System.out.println("so tien dien trong thang la: "+ tien);

        }
            }
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("****************************************************");
        System.out.println("*   1:ham bac nhat                                 * ");
        System.out.println("*   2:ham bac hai                                  *");
        System.out.println("*   3:tinh tien dien                               *");
        System.out.println
        ("****************************************************");
        System.out.print("nhap so chon phuong phap: ");
        int a=input.nextInt();
        switch(a){
            case 1 -> bt1();
            case 2 -> bt2();
            case 3 -> bt3();
            default -> System.out.println("loi!! nhap lai!!!");
        }
    }
}