/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q01_abstarct;

/**
 *
 * @author S540965
 */
 class Hourlyemployee extends Employee{
  @Override
  void salary()
  {
      System.out.println("hourly salary of employee is 9.45$");
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee obj=new Hourlyemployee();
        obj.salary();
    }
    
}
