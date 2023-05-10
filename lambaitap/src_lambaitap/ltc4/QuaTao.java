package ltc4;

import java.util.Scanner;


public class QuaTao extends HoaQua {
    private String mau;

    public QuaTao() {
    }

    public QuaTao(String mau, double giaBan, String nguonGoc, String ngayNhap, int soLuong) {
        super(giaBan, nguonGoc, ngayNhap, soLuong);
        this.mau = mau;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
    
    public void Nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap gia ban: ");
        mau = nhap.nextLine();
    }
}
