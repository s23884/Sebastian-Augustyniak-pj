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
public class zadanie7 {
    public static void main(String[] args) {
         
                Scanner input = new Scanner(System.in);
                int[] tablica = new int[6];
                int[] tablica1 = new int[6];
                int n = 0;
                int a = 0;
                int b = 0;
          
         for (int i = 1; i < 6; i++)
                {
             System.out.print("Tab1 = " + "[" + i + "] " + "= ");
                        tablica[i] = input.nextInt();
                }
                
                a = tablica[1] + tablica[2] + tablica[3] + tablica[4] + tablica[5];
                System.out.println(" ");
                for (int i = 1; i < 6; i++)
                {
             System.out.print("Tab2 = " + "[" + i + "] " + "= ");
                        tablica1[i] = input.nextInt();
                }
               
                b = tablica1[1] + tablica1[2] + tablica1[3] + tablica1[4] + tablica1[5];
                System.out.println(" ");
                    for (int i = 1; i < 6; i++) 
        {
          if (a < b || b < a)
          {
              n = a / b;
          }else {System.out.println("Błąd");}
        }
        System.out.println("Wej = " + n);
    }
                }

