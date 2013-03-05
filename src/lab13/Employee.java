/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

import java.util.Objects;

/**
 *
 * @author bspor
 */
public class Employee {
    private String name;
    private String job;
    
    public Employee (Object o) {
        name = getName();
        job = getJob();
    }
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.job);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        return true;
    }
}
