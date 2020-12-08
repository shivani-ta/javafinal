/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q011_employee;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author shivani tangellapally
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            ArrayList<Employee> employees = new ArrayList<>();
        
        Employee employee1 = new Employee(12, "shivani", 12000);
        Employee employee2 = new Employee(10, "varsha", 20000);
        Employee employee3 = new Employee(15, "vasavi", 50000);
        Employee employee4 = new Employee(05, "nitya", 5000);
        Employee employee5 = new Employee(02, "prashansa", 2000);
        
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        
        System.out.println("Original List");
        for(Employee e : employees){
        
            System.out.println(e.toString());
        }
        
        
        Collections.sort(employees);
        
        System.out.println("sorted by id");
        for(Employee e : employees){
        
            System.out.println(e.toString());
        }
        
        
        System.out.println("Sorted  By  Name");
        
       Collections.sort(employees, (Employee e1, Employee e2) ->{
        return e1.getEmpName().compareToIgnoreCase(e2.getEmpName());
        });
       
        for(Employee e : employees){
        
            System.out.println(e.toString());
        }
    
            System.out.println("Sorted  By  Salary");
        
       Collections.sort(employees, (Employee e1, Employee e2) ->{
        return Integer.valueOf(e1.getEmpSalary()).compareTo(e2.getEmpSalary());
        });
       
        for(Employee e : employees){
        
            System.out.println(e.toString());
        }
    
        
    }
}
