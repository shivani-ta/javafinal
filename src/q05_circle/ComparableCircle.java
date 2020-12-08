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
public class ComparableCircle extends Circle implements Comparable<Circle>{

    /**
     *
     * @param area
     */
    public ComparableCircle(int area) {
        super(area);
    }

    void drawCircle() {
    
        System.out.println("Drawing Circle");
    }

    /**
     *
     * @param t
     * @return
     */
    public int compareTo(Circle t) {
   
       if(area == t.area)  
        return 0;  
        
        else if(area > t.area)  
        return 1;  
  
        else  
         return -1;  

       
    }
}
