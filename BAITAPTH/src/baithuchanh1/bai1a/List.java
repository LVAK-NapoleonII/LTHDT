/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh1.bai1a;

import java.util.ArrayList;
import java.util.Scanner;

public class List {

    ArrayList<Vehicle> Vhc = new ArrayList();

    public List() {
        Vhc = new ArrayList();
    }

    public void DS(Vehicle a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong can them: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Lan nhap thu " + (i + 1) + ": ");
            if (a instanceof Vehicle) {
                a = new Vehicle();
                a.nhap();
            }
            Vhc.add(a);
        }
    }

    public void hien() {
        for (Vehicle x : Vhc) {
            if (x instanceof Vehicle) {
                x.xuat();
            }
        }
    }
}
  