/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.lab5;

import java.util.*;

public class Zadanie1 {
    public static void main (String[] args) {
       Set<String> liczba = new HashSet<String>();
       liczba.add("1"); 
       liczba.add("1"); 
       liczba.add("2"); 
       liczba.add("2");
       liczba.add("3");
       liczba.add("3");
       for (String ciagZnakow : liczba) 
       { System.out.println(ciagZnakow); }
        }
    }
