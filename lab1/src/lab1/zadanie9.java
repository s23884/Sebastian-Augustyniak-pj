/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sebik
 */
public class zadanie9 {
      public static void main(String arg[])
    {
    Scanner input = new Scanner(System.in);
    Random random = new Random(); 
    System.out.print("Wpisz ilość wierszy: ");
    int a = input.nextInt();
    System.out.print("Wpisz ilość kolumn: ");
    int b = input.nextInt();
    int[][] tablica = new int[a][b];
    
    for(int i = 0; i < a; i++)
    {
        for(int j = 0; j < b; j++)
        {
            
            tablica[i][j] = random.nextInt(100 - 1) + 1;
        }
    }
    for (int i = 0; i < b; i++)
    {
        System.out.print(tablica[0][i] + ",");
        
    }
    System.out.print(" ");
    for (int i = 0; i < a; i++)
    {
        System.out.print(tablica[i][0] + ",");
        
    }
    }
}