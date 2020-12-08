/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q07_array;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author shivani tangellapally
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
   

    int arr[] = new int[100];

    for(int i =0; i<arr.length; i++){
    
        Random r = new Random();
        arr[i] = r.nextInt(1000);
        
    }
            
    System.out.println("Please enter index of the array that you want to display");
    Scanner input = new Scanner(System.in);
    System.out.println(arr.length);
    
    int value = input.nextInt();
   
    try{
    
        System.out.println(arr[value]);
        
    }catch(ArrayIndexOutOfBoundsException e){
    
        System.out.println("Index Out of bound "+e.getMessage());
    }
    
            }

}
