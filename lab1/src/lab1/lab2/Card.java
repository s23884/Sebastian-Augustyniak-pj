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
public class Card {
    
    public Wartosc wartosc;
    public Kolor kolor;


    public Card(Wartosc wartosc, Kolor kolor) {
        this.wartosc = wartosc;
        this.kolor = kolor;
    }

   
    public enum Kolor{
        KIER, KARO, PIK, TREFL;
    }

   
    public enum Wartosc{
        DWOJKA, TROJKA, CZWORKA, PIATKA, SZOSTKA, SIODEMKA, OSEMKA, DZIEWIATKA, DZIESIATKA,
        WALET, DAMA, KROL, AS;
    }

    
    @Override
    public String toString() {
        return "Karta to: " + wartosc + " " + kolor;
 }
}