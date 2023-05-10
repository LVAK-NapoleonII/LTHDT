/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author kle47
 */
public class DanhSachHoTen_lab5_bai2 {

    private ArrayList<String> ds = new ArrayList<>();

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap danh sach ho ten");
        while (true) {
            System.out.println("Nhap ho ten");
            String ten = sc.nextLine();
            if (ten.isEmpty()) {
                System.out.println("nhap thanh cong");
                break;
            }
            ds.add(ten);
        }
    }

    public void Xuat() {
        System.out.println("_____________________");
        for (String item : ds) {
            System.out.println(item);
        }
    }
    public void Xuatngaunhien(){
        Collections.shuffle(ds);
        Xuat();
    }
    public void Sapxep(){
        Collections.sort(ds);
        Collections.reverse(ds);
        Xuat();
    }
    
    public void Xoa(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ten muon xoa: ");
        String hoten= sc.nextLine();
        for(String item: ds){
            if(item.equalsIgnoreCase(hoten)){
                ds.remove(item);
                System.out.println("xoa thanh cong");
            }
        }
    }
    public void menu() {
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("Menu chuong trinh");
            System.out.println("1. Nhap danh sach ho ten");
            System.out.println("2. Hien thi danh sach ho ten");
            System.out.println("3. Sap xep ngau nhien");
            System.out.println("4. Sap xep");
            System.out.println("5. Xoa");
            System.out.println("0. Thoat");
            chon = sc.nextInt();
            switch(chon){
                case 0:
                    break;
                case 1:
                    Nhap();
                    break;
                case 2:   
                    Xuat();
                    break;
                case 3:
                    Xuatngaunhien();
                    break;
                case 4:
                    Sapxep();
                    break;
                case 5:
                    Sapxep();
                    break;
            }
        } while (chon != 0);

    }
}
