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
public class zadanie6 {
    public static void main (String[] args) {
           Scanner input = new Scanner(System.in);
       System.out.print("Wpisz liczbe 1: ");
       float a = input.nextInt();
      System.out.print("Wpisz liczbe 2: ");
       float b = input.nextInt();
       System.out.print("Wpisz liczbe 3: ");
       float c = input.nextInt();
if ((a > b) && (a > c) && (b > c)) {
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
}
else if ((b > a) && (b > c) && (a > c)) {
    System.out.println(b);
    System.out.println(a);
    System.out.println(c);
}
else if ((c > b) && (c > a) && (b > a)) {
    System.out.println(c);
    System.out.println(b);
    System.out.println(a);
}
else if ((c > b) && (c > a) && (a > b)) {
    System.out.println(c);
    System.out.println(a);
    System.out.println(b);
}
 if ((a < b) && (a < c) && (b < c)) {
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
}
else if ((b < a) && (b < c) && (a < c)) {
    System.out.println(b);
    System.out.println(a);
    System.out.println(c);
}
else if ((c < b) && (c < a) && (b < a)) {
    System.out.println(c);
    System.out.println(b);
    System.out.println(a);
}
else if ((c < b) && (c < a) && (a < b)) {
    System.out.println(c);
    System.out.println(a);
    System.out.println(b);
}
        
    }
}
