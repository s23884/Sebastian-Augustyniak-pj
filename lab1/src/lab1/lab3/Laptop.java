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
public class Laptop extends Komputer {
    public double waga;
    public int rX;
    public int rY;
    public int nr;
    public static int max;
    
    Laptop(String modelProcka, int ileRam, int ileDysku, double waga, int rX, int rY)
    {
       super(modelProcka,ileRam,ileDysku );
        this.waga = waga;
        this.rX = rX;
        this.rY = rY;
       this.nr=++max;
        
    }
    @Override
    public void wyswietl()
    {
            System.out.println(modelProcka + "\n" + ileRam + "\n" + ileDysku + "\n" 
            + waga + "\n" + rX + "\n" + rY);
            }

   
    }


