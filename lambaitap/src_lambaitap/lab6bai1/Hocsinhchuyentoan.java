/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6bai1;

public class Hocsinhchuyentoan extends Hocsinh {
    public Hocsinhchuyentoan(){
    }
    @Override
    public float Dtb(float toan,float ly,float hoa){
        return (toan*2+ly+hoa)/4;
    }
}
