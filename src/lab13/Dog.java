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
public class Dog {
    private String name;
    private String rabiesID;

    public Dog(String name, String rabiesID) {
        this.name = name;
        this.rabiesID = rabiesID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRabiesID() {
        return rabiesID;
    }

    public void setRabiesID(String rabiesID) {
        this.rabiesID = rabiesID;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Dog other = (Dog) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.rabiesID, other.rabiesID)) {
            return false;
        }
        return true;
    }
    
    
    
}
