/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q10_recursion;
/**
 *
 * @author shivani tangellapally
 */
class Factorial {
    static int fact( int a ) {
        if (a!= 0)  // termination condition
            return a * fact(a-1); // recursive call
        else
            return 1;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 4, output;
        output = fact(num);
        System.out.println(" factorial of 4  = " + output);
    
    }
    
}
