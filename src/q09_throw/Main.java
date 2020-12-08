/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q09_throw;
/**
 *
 * @author shivani tangellapally
 */
public class Main {
 static void time(float submission) { 
    if (submission > 6) {
      throw new ArithmeticException ("submission not accepted"); 
    } else {
      System.out.println("your submission is accepted!"); 
    }
 } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         time(7); 
    }
    
}