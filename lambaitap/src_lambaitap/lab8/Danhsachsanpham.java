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
public class Danhsachsanpham {
    private ArrayList<Sanpham_lab5_bai3> list =new ArrayList<>();
    public void nhap(){
        int i=1;
        System.out.println("nhap danh sach sam pham");
        do{
            Scanner sc= new Scanner(System.in);
            System.out.println("nhap san phan thu : "+i);
            String ten =sc.nextLine();
            if(ten==null||ten.equals("")){
                break;
            }
            i++;
            System.out.println("Gia san pham: ");
            double gia= sc.nextDouble();
            list.add(new Sanpham_lab5_bai3(ten,gia));
        }while(true);
    }
    public void Xuat(){
        System.out.println("Danh sach san pham");
        System.out.println("ten\t\t|Gia\t\t");
        for(Sanpham_lab5_bai3 sp:list){
            System.out.println("%s| %2f \n"+sp.getTensp()+sp.getGia());
        }
    }
}
