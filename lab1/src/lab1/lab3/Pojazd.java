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

    public class Pojazd extends Maszyna
{​​​​​​​
    protected double moc;
    protected double momentObrotowy;
    int nrPojazdu;
    int maxliczbaPojazd;
    private static int nr;
   
    Pojazd(double moc, double momentObrotowy, int maxliczbaPojazd)
    {​​​​​​​
        this.moc = moc;
        this.momentObrotowy = momentObrotowy;
        this.nrPojazdu = ++nr;
        this.maxliczbaPojazd = maxliczbaPojazd;
    }​​​​​​​
   
     public void wyswietl()
    {​​​​​​​
        System.out.print(moc + "\n" + momentObrotowy  + "\n" + nrPojazdu + " z " + maxliczbaPojazd);
    }​​​​​​​
}​​​​​​​
