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
public class Part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List hi = new ArrayList();
        String practice;
        hi.add("Knife");
        hi.add("Saw");
        hi.add("Glue");
        hi.add("Balsa");
        
        for (int i = 0; i <hi.size(); i++) {
            practice = (String) hi.get(i);
            System.out.println(practice);
        }
    }
}
