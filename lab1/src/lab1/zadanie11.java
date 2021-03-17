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
public class zadanie11 {
     public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    Scanner scanner = new Scanner (System.in);
    double zi = 31557600;
    double merk = 31557600*0.2408467;
    double wen = 31557600*0.61519726;
    double mar = 31557600*1.8808158;
    double jow = 31557600*11.862615;
    double sat = 31557600*29.447498;
    double uran = 31557600*84.016846;
    double nept = 31557600*164.79132;
    System.out.print("Wpisz sekundy: ");
    double n = input.nextInt();
    System.out.println();
    System.out.println("1-Merkury");
    System.out.println("2-Wenus");
    System.out.println("3-Ziemia");
    System.out.println("4-Mars");
    System.out.println("5-Jowisz");
    System.out.println("6-Saturn");
    System.out.println("7-Uran");
    System.out.println("8-Neptun");
    System.out.print("Wybierz planetu: ");
    int p = input.nextInt();
    switch(p)
    {
        case 1 :
        {
             System.out.println("Merkury");
             System.out.print(n = n / merk);
             System.out.println(" lat ziemnych");
             break;
             
        }
        case 2 :
        {
             System.out.println("Wenus");
             System.out.print(n = n / wen);
             System.out.println(" lat ziemnych");
             break;
        }
        case 3 :
        {
             System.out.println("Ziemia");
             System.out.print(n = n / zi);
             System.out.println(" lat");
             break;
        }
        case 4 :
        {
             System.out.println("Mars");
             System.out.print(n = n / mar);
             System.out.println(" lat ziemnych");
             break;
        }
        case 5 :
        {
             System.out.println("Jowisz");
             System.out.print(n = n / jow);
             System.out.println(" lat ziemnych");
             break;
        }
        case 6 :
        {
             System.out.println("Saturn");
             System.out.print(n = n / sat);
             System.out.println(" lat ziemnych");
             break;
        }
        case 7 :
        {
             System.out.println("Uran");
             System.out.print(n = n / uran);
             System.out.println(" lat ziemnych");
             break;
        }
        case 8 :
        {
             System.out.println("Neptun");
             System.out.print(n = n / nept);
             System.out.println(" lat ziemnych");
             break;
        }
    }
    
    }
}

