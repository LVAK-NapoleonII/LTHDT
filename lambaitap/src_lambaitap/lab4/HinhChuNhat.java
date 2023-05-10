/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.Scanner;


public class HinhChuNhat extends Hinhhoc {
    public float dai;
    public float rong;
    public HinhChuNhat(){
        ten="hinh chu nhat";
    }
    public void nhapChieuDai(){
        dai=input.nextFloat();
    }
     public void nhapChieuRong(){
        rong=input.nextFloat();
    }
     public void tinhChuVi(){
         chuVi= (dai+rong)*2;
     }
      public void tinhDienTich(){
         dienTich = dai*rong;
      }
}
