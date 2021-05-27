/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.lab5;

import java.util.*;

public class zadanie5 {
   public static void main (String[] args) {
    
}
   class Hamster {
   String Kuba;
   private int hamsterNumber;
   Hamster(int i) { hamsterNumber = i; }
   public String hamsterNumber() {
   return "This is Hamster #" + hamsterNumber;
  }
}

          class Printer {
         public static void printAll(List<Hamster> hl) {

    }
}

        public class HamsterMaze {
        public static void main(String[] args) {
       List<Hamster> v = new ArrayList<>();

      for(int i = 0; i < 3; i++)
	    v.add(new Hamster(i));
      
      Printer.printAll(v);
  }
}
}
