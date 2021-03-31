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
public class Mydate {
    
    public int day;
    public int month;
    public int year;

    
    public Mydate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getMonth() {
        return month;
    }

   
    public void setMonth(int month) {
        if(month > 0 && month <= 12) {
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    
    public void setDay(int day) {
        if(day > 0 && day <= 31) {
            this.day = day;
        }
    }

    public int getYear() {
        return year;
    }

    
    public void setYear(int year) {
        if(year >= 1990 && year <= 2050) {
            this.year = year;
        }
    }

    
    public String displayDate(){
        if(day < 10 && month < 10){
            return "0" + day + "/" + "0" + month + "/" + year;
        }
        else if(day < 10){
            return "0" + day + "/" + month + "/" + year;
        }
        else if(month < 10){
            return day + "/" + "0" + month + "/" + year;
        }
        return day + "/" + month + "/" + year;
 }
}