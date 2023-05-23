/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh4.bai1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kle47
 */
public class Quanly {
    ArrayList<Giaodichnhadat> gd ;
    
    public Quanly(){
        gd = new ArrayList<>();
    }
    
    public void themGiaoDich(Giaodichnhadat g){
        Scanner sc =new Scanner(System.in);
        System.out.println("So luong ghiao dich");
        int n =sc.nextInt();
        for(int i=1; i<=n;i++){
            System.out.println("giao dich thu "+i);
            if(g instanceof Giaodichdat){
                g=new Giaodichdat();
                g.Nhap();
            }else if(g instanceof Giaodichnha){
                g=new Giaodichnha();
                g.Nhap();
            }
            gd.add(g);
        }
    }
     public void HienGd(){
        for(Giaodichnhadat g: gd){
            System.out.println(g.toString());
            System.out.println("Thanh tien: "+ g.thanhTien());
        }
     }
     
     public int Dem(String loai){
         int dem=0;
         for(Giaodichnhadat g:gd){
             if(g instanceof Giaodichdat && loai.equals("dat")){
                 dem++;
             }else if(g instanceof Giaodichnha && loai.equals("nha")){
                 dem++;
             }
         }
         return dem;     
     }
     
     public double TBthanhtien(){
         double tongThanhtien =0;
         int dem =0;
         for(Giaodichnhadat g: gd){
             if(g instanceof Giaodichdat){
                 tongThanhtien += g.thanhTien();
                 dem++;
             }
         }
         if(dem!=0){
             return tongThanhtien/dem;
         }else{
             return 0;
         }
     }
     
     public void xuatgiaodich(){
         for(Giaodichnhadat g: gd){
             if(g.getNgayGiaoDich().equals(LocalDate.now())){
                 System.out.println(g.toString());
                 System.out.println("Thanh tien"+g.thanhTien());
             }
         }
     }
             
     
}
