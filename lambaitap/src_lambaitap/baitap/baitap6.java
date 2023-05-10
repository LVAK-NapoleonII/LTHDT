/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author kle47
 */
public class baitap6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       float a;
       do{
            System.out.println("so diem cua sinh vien la: ");
             a=input.nextFloat();
             if(a<0){
                 System.out.println("loi!!! vui long nhap lai!!!");
             }
       }while(a<0);
        if(0 < a && a <= 5.0){
           System.out.println("hoc sinh loai kem");
       }
        else if(a > 5.0 && a <= 7.0){
               System.out.println("hoc sinh loai tb");
           }
        else if(a > 7.0 && a <= 8.0){
            System.out.println("hoc sinh loai kha");
        }
        else {
            System.out.println("hoc sinh loai gioi");
        }
        
    }
    
}
