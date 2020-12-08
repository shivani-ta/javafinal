/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q011_employee;

/**
 *
 * @author shivani tangellapally
 */
public class Employee implements Comparable<Employee>{
    
    private int empId;
    private String empName;
    private int empSalary;

    /**
     *
     * @param empId
     * @param empName
     * @param empSalary
     */
    public Employee(int empId, String empName, int empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    /**
     *
     * @return
     */
    public int getEmpId() {
        return empId;
    }

    /**
     *
     * @return
     */
    public String getEmpName() {
        return empName;
    }

    /**
     *
     * @return
     */
    public int getEmpSalary() {
        return empSalary;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Employee{" + "empId = " + empId + ", empName = " + empName + ", empSalary = " + empSalary + '}';
    }

    /**
     *
     * @param emp
     * @return
     */
    @Override
    public int compareTo(Employee emp) {
    
        if(empId == emp.empId)  
        return 0;  
        
        else if(empId > emp.empId)  
        return 1;  
  
        else  
         return -1;  
    
    }
}

