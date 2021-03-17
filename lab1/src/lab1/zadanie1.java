/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

public class zadanie1 {
  public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Wprowadź długość boku prostokąta: ");
        int dlugoscBoku = input.nextInt();
       System.out.print("Wprowadź szerokość boku prostokąta: ");
        int szerokoscBoku = input.nextInt();
        long wynik = dlugoscBoku * szerokoscBoku;
        System.out.printf("Pole prostokąta o dlugości = %d i szerokości = %d, wynosi = %d", dlugoscBoku, szerokoscBoku, wynik);
  }
}
