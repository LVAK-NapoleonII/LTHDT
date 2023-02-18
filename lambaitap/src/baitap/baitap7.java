/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

import java.util.Scanner;

public class baitap7 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int n;
       do{
            System.out.println("nhap 3 so lien tiep : ");
             n=input.nextInt();
             if(n<100 || n>999){
                 System.out.println("loi!!! vui long nhap lai!!!");
             }
       }while(n<100 || n>999);
      int a,b,c;
      a=n/100;
      c=n%10;
      b=n/10-a*10;
      switch(a){
          case 1 -> { 
              System.out.print("mot tram");
             }
          case 2 ->{
              System.out.print("hai tram");
          }
          case 3 ->{
               System.out.print("ba tram");
          }
           case 4 ->{
              System.out.print("bon tram");
           }
            case 5 ->{
              System.out.print("nam tram");
            }
             case 6 ->{
              System.out.print("sau tram");
             }
             case 7 ->{
              System.out.print("bay tram");
             }
             case 8 ->{
              System.out.print("tam tram");
             }
             case 9 ->{
              System.out.print("chin tram");
             }
      }
      switch(b){
          case 0 -> {
              if( b==0 && c!=0){
              System.out.print(" le ");
              }     
          }
          case 1 -> { 
              System.out.print(" muoi ");
             }
          case 2 ->{
              System.out.print(" hai muoi ");
          }
          case 3 ->{
               System.out.print(" ba muoi ");
          }
           case 4 ->{
              System.out.print(" bon muoi ");
           }
            case 5 ->{
              System.out.print(" nam muoi ");
            }
             case 6 ->{
              System.out.print(" sau muoi ");
             }
             case 7 ->{
              System.out.print(" bay muoi ");
             }
             case 8 ->{
              System.out.print(" tam muoi ");
             }
             case 9 ->{
              System.out.print(" chin muoi ");
             }
}
          switch(c){
          case 1 -> { 
              System.out.println("mot ");
             }
          case 2 ->{
              System.out.println("hai ");
          }
          case 3 ->{
               System.out.println("ba ");
          }
           case 4 ->{
              System.out.println("bon ");
           }
            case 5 ->{
              System.out.println("nam ");
            }
             case 6 ->{
              System.out.println("sau ");
             }
             case 7 ->{
              System.out.println("bay ");
             }
             case 8 ->{
              System.out.println("tam ");
             }
             case 9 ->{
              System.out.println("chin ");
             }
      }
          
     }
}
