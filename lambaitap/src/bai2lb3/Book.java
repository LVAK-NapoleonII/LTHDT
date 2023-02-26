/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2lb3;

public class Book {
    private String boCode;
    private String boTitle;
    private String boAuthor;
public Book(){
    this.boAuthor=null;
    this.boCode=null;
    this.boTitle=null;
}
public Book(String boCode, String boTitle, String boAuthor){
    this.boAuthor=boAuthor;
    this.boCode=boCode;
    this.boTitle=boTitle;
}
public Book(Book bo){
    this.boAuthor=bo.boAuthor;
    this.boCode =bo.boCode;
    this.boTitle=bo.boTitle;
}   
public String getBoCode(){
   return boCode; 
}
public String getBoTitle(){
   return boTitle; 
}
public String getBoAuthor(){
   return boAuthor; 
}
}
