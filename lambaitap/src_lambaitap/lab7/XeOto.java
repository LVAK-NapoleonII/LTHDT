/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

public class XeOto extends Phuongtiendichuyen{
    String loaiNhienLieu;

    public XeOto(String loaiNhienLieu, String loaiPhuongTien, HangSanXuat hangSanXuat) {
        super(loaiPhuongTien, hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }
   @Override
    public double layVanToc(){
        return 0;
    }
    
}
