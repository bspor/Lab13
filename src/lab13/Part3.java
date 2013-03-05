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
public class Part3 {
    public static void main(String[] args) {
        
    Employee emp1 = new Employee("Bob", "Accountant");
    Dog emp2 = new Dog("Sally", "A10110111011");
    Employee emp3 = new Employee("Burt", "Slacker");
    
    
    List employee = new ArrayList();  
    
    employee.add(emp1);
    employee.add(emp2);
    employee.add(emp3);
    
    for (Object e : employee) {
        //Works without casting
        if ( e instanceof Dog) {
            Dog d = (Dog) e;
            System.out.println("The dog is named " + d.getName());
        } else if (e instanceof Employee) {
            Employee emp;
            emp = (Employee) e;
            System.out.println("This person is a " + emp.getJob());
        }
       
    }
    }   
}
