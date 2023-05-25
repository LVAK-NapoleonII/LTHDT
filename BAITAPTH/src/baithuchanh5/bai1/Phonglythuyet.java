/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh5.bai1;

/**
 *
 * @author kle47
 */
public class Phonglythuyet extends Phonghoc {
    private boolean coMayChieu;

    public Phonglythuyet() {
        
    }
 
    public Phonglythuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.coMayChieu = coMayChieu;
    }

    public boolean coMayChieu() {
        return coMayChieu;
    }

    @Override
    public void Nhap(){
        super.Nhap();
        System.out.println("May chieu(true/flase)");
        coMayChieu=sc.nextBoolean();
    }
    @Override
    public boolean datChuan() {
        return super.datChuan() && coMayChieu;
    }
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println(" may chieu(true/false)|"+coMayChieu);
    }
}

