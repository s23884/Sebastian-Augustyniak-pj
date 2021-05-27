/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.lab5;

import java.util.*;

public class Zadanie2 {
    public static void main (String[] args) {
        Set<String> zbior = new HashSet<String>();
        zbior.add("1"); 
        zbior.add("3"); 
        zbior.add("4");
        zbior.add("6");         
        zbior.add("7"); 
        zbior.add("9"); 
        for (String ciagZnakow : zbior) 
        { System.out.println(ciagZnakow);
        
        }
        zbior.add("3"); 
        zbior.add("5"); 
        zbior.add("6"); 
        zbior.add("7"); 
        zbior.add("8");
        zbior.add("9");
        for (String ciagZnakow : zbior) 
        { System.out.println(ciagZnakow); }
    }
}
