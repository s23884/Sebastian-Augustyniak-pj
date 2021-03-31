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
public class zadanie5 {
    public static void main(String[] args) {

       
        Numbers numbers = new Numbers(2, 1, 4);

        
        System.out.println("Suma podanych liczb to: " + numbers.suma());
        System.out.println("Najwieksza liczba to: " + numbers.max());
        System.out.println("Najmniejsza liczba to: " + numbers.min());
        System.out.printf("Srednia z liczb to: %.2f " , numbers.srednia());
        System.out.println();
        System.out.println("Årednia geometryczna liczb wynosi: " + numbers.geometric());
  }
}