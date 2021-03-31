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
public class zadanie1 {
    public static void main(String[] args) {
        
        Card karta1 = new Card(Card.Wartosc.DAMA, Card.Kolor.KARO);
        Card karta2 = new Card(Card.Wartosc.AS, Card.Kolor.TREFL);
        Card karta3 = new Card(Card.Wartosc.SZOSTKA, Card.Kolor.PIK);
     
          System.out.println("Karta pierwsza: " + karta1);
         System.out.println("Karta druga: " + karta2);
         System.out.println("Karta trzecia: " + karta3);
    }
}
