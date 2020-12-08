/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q05_circle;

/**
 *
 * @author shivani tangellapally
 */
public class TestCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ComparableCircle c1 = new ComparableCircle(10);
            ComparableCircle c2 = new ComparableCircle(20);
            ComparableCircle c3 = new ComparableCircle(30);
            ComparableCircle c5 = new ComparableCircle(40);
            ComparableCircle c6 = new ComparableCircle(15);
            
            int result = c2.compareTo(c6);
            if(result ==1){
         
                System.out.println(c2.getArea() +"is greater than "+c6.getArea());
            
            }
             if(result ==-1){
         
                System.out.println(c2.getArea() +"is less than "+c6.getArea());
            
            } if(result ==0){
         
                System.out.println(c2.getArea() +"is equal to "+c6.getArea());
            
            }
            
        }
    }

    
        