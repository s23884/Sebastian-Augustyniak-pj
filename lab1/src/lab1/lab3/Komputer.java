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
public class Komputer {
    protected String modelProcka;
    protected int ileRam;
    protected int ileDysku;
    
    Komputer(String modelProcka, int ileRam, int ileDysku)
    {
        this.modelProcka = modelProcka;
        this.ileRam = ileRam;
        this.ileDysku = ileDysku;
    }
   public void wyswietl()
   {
        System.out.println(modelProcka + "\n" + ileRam + "\n" + ileDysku);
   }
}
