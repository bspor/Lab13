/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

/**
 *
 * @author bspor
 */
public class Employee {
    private String name;
    private String job;

    public Employee(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
