/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kle47
 */
public class Mangsothuc_lab5_bai1 {
    private ArrayList<Double> list=new ArrayList();
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap danh sach so thuc");
        while(true){
            System.out.println("Nhap so: ");
            Double x =sc.nextDouble();
            list.add(x);
            sc.nextLine();
            System.out.println("nhap tiep hay k (Y/N)");
            if(sc.nextLine().equals("N")){
                break;
            }
        }
    }
    public void Hienthi(){
        System.out.println("__________________________");
        for(Double item :list){
            System.out.print(item);
        }
    }
}
