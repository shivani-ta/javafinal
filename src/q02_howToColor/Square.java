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
 class Square extends GeometricObject implements Colorable{

    @Override
    public String howToColor(String Color) {
   
        System.out.println("Color : "+ Color);
        return Color;
    }

    @Override
    public String Shape(String shape) {
      
      System.out.println("Shape : "+ shape);
       return shape;
    }
 }
