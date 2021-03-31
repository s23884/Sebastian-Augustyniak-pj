/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.lab2;

/**
 *
 * @author sebik
 */
public class zadanie3 {
     public static void main(String[] args) {

        
        Mydate myDate1 = new Mydate(03, 10, 2000);
        Mydate myDate2 = new Mydate(15, 11, 1990);
        Mydate myDate3 = new Mydate(10, 03, 2020);

       
        System.out.println(myDate1.displayDate());
        System.out.println(myDate2.displayDate());
        System.out.println(myDate3.displayDate());
   }
}
