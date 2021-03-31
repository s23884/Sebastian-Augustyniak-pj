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
public class Clock {
    
     private int hours;
    private int minutes;
    private int seconds;

   
    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

  
    public Clock(int seconds) {
        this.seconds = seconds;
    }

    
    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    
    public void setSeconds(int seconds) {
        if(seconds <= 59){
            this.seconds = seconds;
        }
    }

    public int getMinutes() {
        return minutes;
    }

   
    public void setMinutes(int minutes) {
        if(minutes <= 59){
            this.minutes = minutes;
        }
    }

    public int getHours() {
        return hours;
    }

    
    public void setHours(int hours) {
        if(hours <= 23){
            this.hours = hours;
        }
    }

    
    
    public void tick(){
        if(getSeconds() != 59) {
            setSeconds(getSeconds() + 1);
        }
        else if(getMinutes() != 59 ){
            setMinutes(getMinutes() + 1);
            setSeconds(00);
        }
        else if(getHours() != 23 ){
            setHours(getHours() + 1);
            setSeconds(00);
            setMinutes(00);
        }
        else {
            setHours(00);
            setSeconds(00);
            setMinutes(00);
        }

    }

    public void tickDown(){
        if(getSeconds() != 0) {
            setSeconds(getSeconds() - 1);
        }
        else if(getSeconds() == 0){
            setSeconds(59);
            if(getMinutes() == 00){
                setMinutes(59);
                if(getHours() == 0)
                    setHours(23);
                else
                    setHours(getHours() - 1);
            }else
                setMinutes(getMinutes() - 1);
        }
    }

   
    @Override
    public String toString() {
        if(seconds < 10 && hours < 10 && minutes < 10){
            return "0" + hours + "-" + "0" + minutes + "-"  + "0" + seconds;
        }
        else if(minutes < 10 && seconds < 10){
            return hours + "-" + "0" + minutes + "-" + "0" + seconds;
        }
        else if(minutes < 10 && hours < 10){
            return "0" + hours + "-" + "0" + minutes + "-"  + seconds;
        }
        else if(seconds < 10 && hours < 10){
            return "0" + hours + "-" +  minutes + "-"  + "0" + seconds;
        }
        else if(minutes < 10){
            return hours + "-" + "0" + minutes + "-" + seconds;
        }
        else if(seconds < 10){
            return hours + "-" + minutes + "-" + "0" + seconds;
        }
        else if(hours < 10){
            return "0" + hours + "-" + minutes + "-" + seconds;
        }
        else{
            return hours + "-" + minutes + "-" + seconds;
}
    }
}