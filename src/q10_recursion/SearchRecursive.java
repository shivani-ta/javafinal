/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q10_recursion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shivani tangellapally
 */
public class SearchRecursive {
    static int searchRecursive(List<Integer> elements , int lenght , int element){
    
        if(lenght>0){
        if(element == elements.get(lenght)){
        
           System.out.println(element +" Found as index "+ lenght);
           
        }
       return searchRecursive(elements, lenght-1, element);
      
        }else{
        
            return 1;
        }
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> elements = new ArrayList<>();
       
       elements.add(1);
       elements.add(5);
       elements.add(3);
       elements.add(2);
       elements.add(10);
       elements.add(20);
       elements.add(13);
       
       searchRecursive(elements, elements.size()-1, 10);
       
   }

}
