/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author sanjam
 */
public class CircuitDriver {
    
    public static void main(String[] args) {
        Node nodes[] = new Node[10];
        
        for(int c = 0; c < nodes.length; c++)
            nodes[c] = new Node();
        
        Resistor r1 = new Resistor(10, nodes[6], nodes[9]);
        Resistor r2 = new Resistor(15, nodes[7], nodes[4]);
        //Resistor r3 = new Resistor(-35, nodes[5], nodes[1]);
        
        
        System.out.println("\n Resistor Information ");
        System.out.println(r1);
        System.out.println(r2);
        //System.out.println(r3);
        
        Circuit cir = Circuit.getInstance();
        
        cir.add(r1);
        cir.add(r2);
       // cir.add(r3);
        
        System.out.println("\n Circuit Information ");
        System.out.println(cir);
    }
    
}
