/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.lab2;

/**
 *
 * @author sebik
 */
public class zadanie4 {
     public static void main(String[] args) {

        
        Clock clock = new Clock(00, 59, 59);
       
        clock.tick();
        
        System.out.println(clock);

        
        Clock clock1 = new Clock(00, 00, 00);
       
        clock1.tickDown();
       
        System.out.println(clock1);

       
        Clock clock2 = new Clock();
       
        System.out.println(clock2);
 }
}