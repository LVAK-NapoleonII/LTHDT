/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh5.bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author kle47
 */
public class Quanly {

    ArrayList<Phonghoc> ds;

    public Quanly() {
        ds = new ArrayList<>();
    }

    public void themPhongHoc(Phonghoc ph) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong can them: ");
        int n = sc.nextInt();
        if (!ds.contains(ph)) {
            for (int i = 1; i <= n; i++) {
                System.out.println("Lan nhap thu " + i + ": ");
                if (ph instanceof Phonglythuyet) {
                    ph = new Phonglythuyet();
                    ph.Nhap();
                } else if (ph instanceof Phongmaytinh) {
                    ph = new Phongmaytinh();
                    ph.Nhap();
                } else if (ph instanceof Phongthinghiem) {
                    ph = new Phongthinghiem();
                    ph.Nhap();
                }
                ds.add(ph);
                System.out.println("Them phong hoc thanh cong.");
            }
        } else {
            System.out.println("Phong hoc da ton tai.");
        }
    }

    public void tim(String maPhong) {
        for (Phonghoc ph : ds) {
            if (ph.getMaPhong().equals(maPhong)) {
                ph.Xuat();
            } else {
                System.out.println("khong tim thay");
            }
        }

    }

    public void inDanhSach() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach phong hoc rong.");
        } else {
            System.out.println("Danh sach phong hoc:");
            for (Phonghoc ph : ds) {
                ph.Xuat();
            }
        }
    }

    public void inPhongHocDatChuan() {
        boolean coPhongHocDatChuan = false;
        System.out.println("Danh sach phong hoc dat chuan:");
        for (Phonghoc ph : ds) {
            if (ph.datChuan()) {
                ph.Xuat();
                coPhongHocDatChuan = true;
            }
        }
        if (!coPhongHocDatChuan) {
            System.out.println("Khong co phong hoc dat chuan.");
        }
    }

    public void sapXepTheoDayNha() {
        Collections.sort(this.ds, new Comparator<Phonghoc>() {

            @Override
            public int compare(Phonghoc o1, Phonghoc o2) {
                int i = o1.getDayNha().compareTo(o2.getDayNha());
                if (i < 0) {
                    return -1;
                } else if (i == 0) {
                    return 0;
                }
                return 1;
            }
        });
    }

    public void sapXepTheoDienTich() {
        Collections.sort(this.ds, new Comparator<Phonghoc>() {
            @Override
            public int compare(Phonghoc o1, Phonghoc o2) {
                int i = (int) (o1.getDienTich() - o2.getDienTich());
                if (i < 0) {
                    return 1;
                } else if (i == 0) {
                    return 0;
                }
                return -1;
            }
        }
        );
    }

    public void capnhatMayTinh(String maPhong, int soMayTinh) {
        for (Phonghoc ph : ds) {
            if (ph != null && ph instanceof Phongmaytinh) {
                ((Phongmaytinh)ph).setSoMayTinh(soMayTinh);
                System.out.println("Cap nhat so may tinh thanh cong.");
            } else {
                System.out.println("Khong tim thay phong may tinh voi ma phong tuong ung.");
            }
        }

    }

    public void xoaPhongHoc(String maPhong) {
        for (Phonghoc ph : ds) {
            if (ph != null) {
                ds.remove(ph);
                System.out.println("Xoa phong hoc thanh cong.");
            } else {
                System.out.println("Khong tim thay phong hoc voi ma phong tuong ung.");
            }
        }

    }

    public int tinhTongSoPhongHoc() {
        return ds.size();
    }

    public void inPhongMay60May() {
        boolean coPhongMay60May = false;
        System.out.println("Danh sach phong may co 60 may:");
        for (Phonghoc ph : ds) {
            if (ph instanceof Phongmaytinh && ((Phongmaytinh) ph).getSoMayTinh() == 60) {
                ph.Xuat();
                coPhongMay60May = true;
            }
        }
        if (!coPhongMay60May) {
            System.out.println("Khong co phong may co 60 may.");
        }
    }
}
