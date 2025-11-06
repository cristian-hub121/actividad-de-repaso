/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prac2;
import java.util.Scanner;
/**
 *
 * @author ALUMNO#
 */
public class Prac2 {
 Scanner sc = new Scanner(System.in);
 
 int Num1,Num2,r;
 public void setNum1(){
     System.out.println("ingrese su primer numero: ");
    Num1 = sc.nextInt();
 }

 public void setNum2(){
     System.out.println("ingrese su segundo numero");
    Num2 = sc.nextInt();
 }

   public int Getr(){
       r = Num1 + Num2;
       return r; 
   } 
 
    public static void main(String[] args) {
        Prac2 pr = new Prac2();
        pr.setNum1();
        pr.setNum2();
                
        System.out.println("el resultado es = "+ pr.Getr());
    }
}
