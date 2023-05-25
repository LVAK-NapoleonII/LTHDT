/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh5.bai1;

/**
 *
 * @author kle47
 */
public class Phongthinghiem extends Phonghoc {

    private String chuyenNganh;
    private int sucChua;
    private boolean coBonRua;

    public Phongthinghiem() {
    }

    
    public Phongthinghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh,
            int sucChua, boolean coBonRua) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.chuyenNganh = chuyenNganh;
        this.sucChua = sucChua;
        this.coBonRua = coBonRua;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public boolean coBonRua() {
        if (coBonRua == true) {
            return coBonRua;
        }return false;

    }

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.println("Nhap chuyen nganh");
        chuyenNganh=sc.nextLine();
        System.out.println("Bon rua(true/false)");
        coBonRua=sc.nextBoolean();
    }

    @Override
    public boolean datChuan() {
        return super.datChuan() && coBonRua;
    }
    
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("Chuyen nganh|"+chuyenNganh+"| Suc chua "+sucChua+"| Bon rua(true|false)"+coBonRua);
    }
}
