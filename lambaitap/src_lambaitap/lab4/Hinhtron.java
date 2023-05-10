/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.Scanner;


public class Hinhtron extends Hinhhoc {
    private float bankinh;
    public Hinhtron(){
        ten="hinh tron";
    }
    public void nhapBankinh(){
      bankinh= input.nextFloat();
    }
    public void tinhChuvi(){
       chuVi= 2*Pi*bankinh;
    }
    public void tinhDientihc(){
        dienTich= bankinh*bankinh*Pi;
    }
}
