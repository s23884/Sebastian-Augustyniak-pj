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
       
    public class Lokomotywa extends Maszyna
{​​​​​​​
   public int obciazenie;
   public int wymiar;
   protected static int max;
   
   Lokomotywa(String marka, String nazwa, String rodzaj_silnika, double pojemnosc_silnika,
           int obciazenie,int wymiar)
   {​​​​​​​
       this.marka = marka;
       this.nazwa = nazwa;
       this.rodzaj_silnika = rodzaj_silnika;
       this.pojemnosc_silnika = pojemnosc_silnika;
       this.obciazenie = obciazenie;
       this.wymiar = wymiar;
       this.enumeracja = ++max;
   }​​​​​​​
  
  
   public void wyswietl()
{​​​​​​​
    System.out.print( "(" + enumeracja + ")" + "\n" + marka + "\n" + nazwa + "\n"
            + rodzaj_silnika + "\n" + pojemnosc_silnika + "L" + "\n" +
            obciazenie + "\n" + wymiar);
}​​​​​​​
}​​​​​​​
    
  


