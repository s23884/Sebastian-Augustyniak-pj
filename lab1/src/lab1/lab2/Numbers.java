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
public class Numbers {
    
    final int iloscLiczb = 3;

    public int liczba1;
    public int liczba2;
    public int liczba3;

    public Numbers(int liczba1, int liczba2, int liczba3) {
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
        this.liczba3 = liczba3;
    }

    
    public double suma(){
        return liczba1 + liczba2 + liczba3;
    }


   
    public double srednia(){
        return suma() / iloscLiczb;
    }

    
    public int min(){
        if( liczba1 < liczba2 && liczba1 < liczba3) {
            return liczba1;
        }
        else if(liczba2 < liczba1 && liczba2 < liczba3){
                return liczba2;
        }
        else{
            return liczba3;
        }
    }

    
    public int max(){
        if( liczba1 > liczba2 && liczba1 > liczba3) {
            return liczba1;
        }
        else if(liczba2 > liczba1 && liczba2 > liczba3){
            return liczba2;
        }
        else{
            return liczba3;
        }
    }

   
    public double geometric(){
        double mnozenie = liczba1 * liczba2 * liczba3;
        return Math.pow(mnozenie, 1.0/3);
 }
}