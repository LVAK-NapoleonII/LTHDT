/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh4.bai2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kle47
 */
public class Quanly {
    private ArrayList<Khachhang> ds;
    public Quanly(){
        ds= new ArrayList<>();
    }
    public void them(Khachhang kh){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so luong them");
        int n= sc.nextInt();
        for(int i=1;i<n;i++){
            System.out.println("lan nhap thu"+i);
            if(kh instanceof KhachhangNN){
                kh = new KhachhangNN();
                kh.Nhap();
            }else if(kh instanceof KhachhangVN){
                kh =new KhachhangVN();
                kh.Nhap();
            }
            ds.add(kh);
        }
    }
    public void xuat(){
        for(Khachhang kh: ds){
             System.out.println(kh.toString());
             System.out.println("Thanh tien"+kh.thanhTien());
        }
    }
    
    public int dem(String loai){
        int dem=0;
        for(Khachhang kh:ds){
            if(kh instanceof KhachhangVN && loai.equals("VN")){
                dem++;
            }else if(kh instanceof KhachhangNN && loai.equals("NN")){
                dem++;
            }
        }
        return dem;
    }
    
    public double tinhTB(){
        double tong=0;
        int dem=0;
        for (Khachhang kh:ds){
            if(kh instanceof KhachhangNN){
                tong += kh.thanhTien();
                dem++;
            }
        }
        if(dem!=0){
            return tong/dem;
        }else{
            return 0;
        }
    }
    public void xuatds(){
        for(Khachhang kh:ds){
            if(kh.getNgayraHoaDon().equals(LocalDate.now())){
                System.out.println(kh.toString());
                 System.out.println("Thanh tien"+kh.thanhTien());
            }
        }
    }
}
