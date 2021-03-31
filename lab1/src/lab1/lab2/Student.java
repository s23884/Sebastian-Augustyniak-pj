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
public class Student {
    
    private String imie;
    private String nazwisko;
    private int numerIndeksu;
    private double obecnosc;
    private double ocenaZPOJ;

    
    public Student(String imie, String nazwisko, int numerIndeksu, double obecnosc, double ocenaZPOJ) {
        setImie(imie);  
        setNazwisko(nazwisko);  
        this.numerIndeksu = numerIndeksu;
        this.obecnosc = obecnosc;
        setOcenaZPOJ(ocenaZPOJ); 
    }

    public String getImie() {
        return imie;
    }

    
    public void setImie(String imie) {
        if(imie == null){
            this.imie = "Unknown";
        }
        else{
            this.imie = imie;
        }
    }

    public String getNazwisko() {
        return nazwisko;
    }

    
    public void setNazwisko(String nazwisko) {
        if(nazwisko == null){
            this.nazwisko = "Unknown";
        }
        else {
            this.nazwisko = nazwisko;
        }
    }

    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    public void setNumerIndeksu(int numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    public double getObecnosc() {
        return obecnosc;
    }

    public void setObecnosc(double obecnosc) {
        this.obecnosc = obecnosc;
    }

    public double getOcenaZPOJ() {
        return ocenaZPOJ;
    }

    
    public void setOcenaZPOJ(double ocenaZPOJ) {
        if(obecnosc < 50)
            this.ocenaZPOJ = 2;
        else
            this.ocenaZPOJ = ocenaZPOJ;
    }

   
    @Override
    public String toString() {
        return imie + " " + nazwisko  + ", numer indeksu: " + numerIndeksu
                + ", obecnosc wynosi: " + obecnosc + "%, ocena: " + ocenaZPOJ;
   }
}