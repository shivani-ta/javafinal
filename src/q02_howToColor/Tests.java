/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q02_howToColor;

/**
 *
 * @author shivani tangellapally
 */
public class Tests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               Square GeometricObjects  = new Square();
            
            String Shapes[] = {"Square" , "Rectangle" , "Diagonal" , "Circle" , "Cube"};
            String Colors[] = {"Yellow" , "Red" , "Green" , "Blue" , "White"};
            
            for(int i = 1; i< Shapes.length; i++){
           
                System.out.println("GeometricObjects of : "+ i);
                GeometricObjects.Shape(Shapes[i]);
                GeometricObjects.howToColor(Colors[i]);
                System.out.println();
            }
           
            
            
           
        }
}