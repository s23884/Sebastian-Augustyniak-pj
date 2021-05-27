/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.lab5;

import java.util.HashMap;

/**
 *
 * @author sebik
 */
public class zadanie3 {
     public static void main (String[] args) {
          HashMap<String, String> map =
                new HashMap<>();
        map.put("ala", "1");
        map.put("ma", "1");
        map.put("kota", "1");
        map.put("i", "1");
        map.put("ala", "2");
        map.put("ma", "2");
        map.put("psa", "1");
        map.put("i", "2");
        map.put("fajnie", "1");
        map.put("że", "1");
        map.put("wszystko", "1");
        map.put("ma", "3");
        System.out.println(map);;
}
}
