/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2lb3;

/**
 *
 * @author kle47
 */
public class Student {
    private String stID;
    private String stName;
    private String stClass;
public Student(){
    this.stClass=null;
    this.stID=null;
    this.stName=null;
}
public Student(String stID, String stName, String stClass){
    this.stClass=stClass;
    this.stID=stID;
    this.stName=stName;
}
public Student(Student st){
    this.stClass=st.stClass;
    this.stID=st.stID;
    this.stName=st.stName;
}
public String getStID(){
    return stID;
}
public void setStID(String ID){
    this.stID=ID;
}
public String getStClass(){
    return stClass;
}
public void setStClass(String Class){
    this.stClass=Class;
}
public String getStName(){
    return stID;
}
public void setStName(String Name){
    this.stName=Name;
}
public String toString(){
    return "stClass"+stClass+"stName"+stName+"stId"+stID ;
}
}
