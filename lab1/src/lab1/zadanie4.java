/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author sebik
 */
public class zadanie4 {
    public static void main (String[] args) {
          Scanner input = new Scanner(System.in);
        System.out.print("Wprowadź pierwszy bok: ");
        int a = input.nextInt();
        System.out.print("Wprowadź drugi bok: ");
        int b = input.nextInt();
        System.out.print("Wprowadź trzecij bok: ");
        int c = input.nextInt();
       if ( a+b>c && a+c>b && b+c>a)
       {
        System.out.println("Trójkąt da się zbudowac");
       }else{System.out.println("Trójkąt nie da się zbudowacz");}
        
        
    }
}
