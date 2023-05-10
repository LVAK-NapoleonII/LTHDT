/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap;

import java.util.Scanner;

/***************************
 *  phuong trinh bac nhat  *
 ***************************/

public class baitap1 {
    public static void main(String[] args) {
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
}
