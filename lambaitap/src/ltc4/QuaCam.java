package ltc4;


import java.util.Scanner;
import ltc4.HoaQua;

public class QuaCam extends HoaQua {
    private String mau;

    public QuaCam() {
    }

    public QuaCam(String mau) {
        this.mau = mau;
    }

    public QuaCam(String mau, double giaBan, String nguonGoc, String ngayNhap, int soLuong) {
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
        mau = nhap.next();
    }
    
    public void Xuat(){
        
    }
}
