/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

public class zadanie5 {
    public static void main (String[] args) {
          Scanner input = new Scanner(System.in);
       System.out.print("Wpisz miesiąc: ");
       int miesiąc = input.nextInt(10);
       
       switch(miesiąc)
       {
           case 1 -> {
               System.out.println("Styczeń");
               System.out.println("31 dzień");
            }
           case 2 -> {
               System.out.println("Luty");
               System.out.println("28 dzień");
            }
           case 3 -> {
               System.out.println("Marzec");
               System.out.println("31 dzień");
            }
           case 4 -> {
               System.out.println("Kwicień");
               System.out.println("30 dzień");
            }
           case 5 -> {
               System.out.println("Maj");
               System.out.println("31 dzień");
            }
           case 6 -> {
               System.out.println("Czerwiec");
               System.out.println("30 dzień");
            }
           case 7 -> {
               System.out.println("Lipiec");
               System.out.println("31 dzień");
            }
           case 8 -> {
               System.out.println("Sierpień");
               System.out.println("31 dzień");
            }
           case 9 -> {
               System.out.println("Wrzeszeń");
               System.out.println("30 dzień");
            }
           case 10 -> {
               System.out.println("Październik");
               System.out.println("31 dzień");
            }
           case 11 -> {
               System.out.println("Listopad");
               System.out.println("30 dzień");
            }
           case 12 -> {
               System.out.println("Grudzień");
               System.out.println("31 dzień");
            }
           default -> System.out.println("Błąd");
        
       }
    }
}
