/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author sebik
 */
public class zadanie10 {
   
  
    // Zwraca wartość true
    // Jest penagram else false
    public static boolean checkPangram(String str) 
    { 
        // Utwórz tablicę skrótów, aby oznaczyć znaki obecne w ciągu. Domyślnie wszystkie elementy mark byłyby fałszywe.
        boolean[] mark = new boolean[26]; 
  
         
        int index = 0; 
  
        for (int i = 0; i < str.length(); i++) { 
            
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') 
                index = str.charAt(i) - 'A'; 
  
           
            else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') 
  
                index = str.charAt(i) - 'a'; 
  
          
            else
                continue; 
            mark[index] = true; 
        } 
  
        
        for (int i = 0; i <= 25; i++) 
            if (mark[i] == false) 
                return (false); 
  
       
        return (true); 
    } 
  
    
    public static void main(String[] args) 
    { 
        String str = "The quick brown fox jumps over the lazy dog"; 
  
        if (checkPangram(str) == true) 
            System.out.print(str + " to jest pangram."); 
        else
            System.out.print(str + " nie jest pangram."); 
    } 
} 

