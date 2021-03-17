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
public class zadanie8 {
    public static void main(String[] args) 
    {
        Scanner console = new Scanner (System.in);
        System.out.println("Podaj wyraz do sprawdzenia:");
        String str = console.next(); 
        palindrom(console, str);
    }
     public static void palindrom(Scanner console, String str) 
     {
      String reverse = "";

 

      int length = str.length();

 

      for ( int i = length - 1; i >= 0; i-- ) {
        reverse = reverse + str.charAt(i);
      }

 

      if (str.equals(reverse))
      {
        System.out.println("Wyraz jest palindromem");  
        }else{System.out.println("Wyraz nie jest palindromem");}
   }
}

