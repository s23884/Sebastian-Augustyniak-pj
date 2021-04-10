/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.lab3;

/**
 *
 * @author sebik
 */
public class Cos {
    public static void main(String args[])
    {
        Komputer k1 = new Komputer("i7", 16, 512);
        Laptop p1 = new Laptop("i5", 8, 256, 1200, 1920, 1080);
        Laptop p2 = new Laptop("i5", 8, 256, 1200, 1920, 1080);
        Laptop p3 = new Laptop("i5", 8, 256, 1200, 1920, 1080);
        
        k1.wyswietl();
        System.out.println();
        p1.wyswietl();
        System.out.println();
        p2.wyswietl();
        System.out.println();
        p3.wyswietl();
        
                
        
    }
}
