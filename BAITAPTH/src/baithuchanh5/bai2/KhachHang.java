/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh5.bai2;

import java.util.Scanner;

/**
 *
 * @author kle47
 */
public class KhachHang {

    private String cmnd, tenkhachhang, gaden;
    private double giatien;

    public KhachHang() {
    }

    public KhachHang(String cmnd, String tenkhachhang, String gaden, double giatien) {
        this.cmnd = cmnd;
        this.tenkhachhang = tenkhachhang;
        this.gaden = gaden;
        this.giatien = giatien;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public String getGaden() {
        return gaden;
    }

    public void setGaden(String gaden) {
        this.gaden = gaden;
    }

    public double getGiatien() {
        return giatien;
    }

    public void setGiatien(double giatien) {
        this.giatien = giatien;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập CMND khách hàng: ");
        cmnd = sc.nextLine();
        System.out.print("Nhập tên khách hàng: ");
        tenkhachhang = sc.nextLine();
        System.out.print("Nhập ga đến: ");
        gaden = sc.nextLine();
        System.out.print("Nhập giá tiền: ");
        giatien = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "KhachHang{"
                + "cmnd=" + cmnd
                + ", ten='" + tenkhachhang + '\''
                + ", gaDen='" + gaden + '\''
                + ", giaTien=" + giatien
                + '}';
    }
}
