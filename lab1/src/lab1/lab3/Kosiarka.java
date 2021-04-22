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
    public class Kosiarka extends Maszyna
{​​​​​​​
    private boolean czyMelekser;
    private int liczbaOstrzy;
    private String czyNaped;
    String tak = "Tak";
   
    public void setczyNaped(String czyNaped)
{​​​​​​​      
    this.czyNaped = czyNaped;
}​​​​​​​  
    public void setliczbaOstrzy(int liczbaOstrzy)
{​​​​​​​      
    this.liczbaOstrzy = liczbaOstrzy;
}​​​​​​​  
    public void setczyMelekser(boolean czyMelekser)
{​​​​​​​      
    this.czyMelekser = czyMelekser;
}​​​​​​​
   
    Kosiarka(String nazwa, String marka,String rodzaj_silnika,double pojemnosc_silnika, boolean czyMelekser,
            int liczbaOstrzy, String czyNaped )
            {​​​​​​​
                this.nazwa = nazwa;
                this.marka = marka;
                this.rodzaj_silnika = rodzaj_silnika;
                this.pojemnosc_silnika = pojemnosc_silnika;
                this.czyMelekser=czyMelekser;
                this.liczbaOstrzy=liczbaOstrzy;
                this.czyNaped=czyNaped;
               
            }​​​​​​​
    public void wyswietl()
    {​​​​​​​
        System.out.print(nazwa + "\n" +  marka + "\n" + rodzaj_silnika + "\n" + pojemnosc_silnika + "L \n" + czyMelekser + "\n" + liczbaOstrzy +
                "\n" + czyNaped);
    }​​​​​​​
}​​​​​​​

