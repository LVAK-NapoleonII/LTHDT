/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;


public class HinhTru extends Hinhtron {
    public float chieucao;
    public HinhTru(){
        ten= "hinh tru";
    }
    public void nhapChieuCao(){
        chieucao=input.nextFloat();
    }
    public void tinhTheTich(){
        theTich=chieucao*dienTich;
    }
}
