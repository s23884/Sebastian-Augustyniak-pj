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
public class zadanie2 {
    public static void main(String[] args) {

        
        Student student1 = new Student(null,null, 1,
                12.5,5);
        Student student2 = new Student("Monika","Nowak", 2,
                95,5);
        Student student3 = new Student("Michal",null, 3,
                52,3);

       
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
  }
}