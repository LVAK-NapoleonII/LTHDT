/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

import java.util.Scanner;

public class baitap3 {

    public static void main(String[] args){
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
    
}
