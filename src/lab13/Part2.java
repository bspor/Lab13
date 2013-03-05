/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bspor
 */
public class Part2 {
    public static void main(String[] args) {
        
    Employee emp1 = new Employee("Bob", "Accountant");
    Employee emp2 = new Employee("Sally", "Receptionist");
    Employee emp3 = new Employee("Burt", "Slacker");
    
    
    List<Employee> employee = new ArrayList<>();  
    
    employee.add(emp1);
    employee.add(emp2);
    employee.add(emp3);
    
    for (Employee e : employee) {
        System.out.println(e.getName() + " is a " + e.getJob());
    }
    }   
}
