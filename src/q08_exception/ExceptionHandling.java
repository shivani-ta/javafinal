/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q08_exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author shivani tangellapally
 */
public class ExceptionHandling {
    static void MethodWithMultipleExc() throws IOException , ArrayIndexOutOfBoundsException{
            //buffered reader used for take input from user String that contains a sentence
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
            //Asking for user to input a sentence
            System.out.println("Enter a sentence");
            String sentence = reader.readLine();
            
            //print Orignal Sentence
            System.out.println("Orignal Sentence : "+sentence);
            
                //Spliting sentence by there space and stored into a string arr
                //String array storing single single words
                String arr[] = sentence.split(" ");
                  
                System.out.println("Result of the Sentence");
                // A loop that print each words into a array
                for(int i =0; i<arr.length; i++)
                {
                    if(arr[i].length()>2){
                    //getting word third index of letter 
                    //index start from 0 thats why we use 2 mean 0 1 2 = 3
                    
                System.out.print(arr[i].charAt(2)+"\n");
                    }
                }
                    }
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                 try {
             
             MethodWithMultipleExc();
         } catch (IOException ex) {
         
             ex.printStackTrace();
         } catch (ArrayIndexOutOfBoundsException ex) {
   
         ex.printStackTrace();
         }
        
       
    }

    
}
