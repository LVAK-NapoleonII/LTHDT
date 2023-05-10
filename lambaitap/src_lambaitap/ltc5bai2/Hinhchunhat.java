/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ltc5bai2;

/**
 *
 * @author kle47
 */
public class Hinhchunhat extends Hinh {
    private float cd;
    private float cr;
    public Hinhchunhat(float cd, float cr){
        this.cd=cd;
        this.cr=cr;
    }
    public String toString(){
        
        return cd+","+cr;
        
    }
    @Override
    public double dientich(){
        return cd*cr;
    }
}
