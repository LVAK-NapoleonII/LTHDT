/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh5.bai1;

/**
 *
 * @author kle47
 */
class Phongmaytinh extends Phonghoc {

    private int soMayTinh;

    public Phongmaytinh() {
    }

    public Phongmaytinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMayTinh = soMayTinh;
    }

    public int getSoMayTinh() {
        return soMayTinh;
    }

    public void setSoMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.println("nhap so may tinh");
        soMayTinh = sc.nextInt();
    }

    @Override
    public boolean datChuan() {
        return super.datChuan() && (getDienTich() / soMayTinh*1.5 >= dienTich);
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("so may tinh |" + soMayTinh);
    }
}
