/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        do{
            System.out.println("nhap so nguyen a: ");
            a = input.nextInt();
            if(a<=0){
                System.out.println("loi!!! vui long nhap lai!!!!");
            }
        }while(a<=0);
        int i= (int) Math.sqrt(a);
        if(a==i*i){
           System.out.println(a+" la so chinh phuong");
        }
        else{
            System.out.println(a+"a khong la so chinh phuong");
        }
    }
}
