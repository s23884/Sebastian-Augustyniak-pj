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
public class zadanie12 {
   
  
    static int arr[] = { 5,1,2,4,7,3 }; 
  
  
    static int findSum(int A[], int N) 
    { 
        if (N <= 0) 
            return 0; 
        return (findSum(A, N - 1) + A[N - 1]); 
    } 
  
    public static void main(String[] args) 
    { 
        System.out.println(findSum(arr, arr.length)); 
    } 
} 

