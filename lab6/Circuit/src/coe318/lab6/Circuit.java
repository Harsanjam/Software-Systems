/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

import java.util.ArrayList;

/**
 *
 * @author sanjam
 */
public class Circuit {
    
    ArrayList<Resistor> resistors = new ArrayList<>();
    private static Circuit instance = null;

    public static Circuit getInstance() {
        
        if (instance == null) 
            instance = new Circuit();
        
        return instance;
    }

    private Circuit() {

    }

    void add(Resistor r) {
        
        resistors.add(r);
        

    }

    @Override
    public String toString() {
        String result = "";
        for (int c=0; c <resistors.size(); c++) {
            result += resistors.get(c) + "\n"; }
        return result;
    }
    
}
