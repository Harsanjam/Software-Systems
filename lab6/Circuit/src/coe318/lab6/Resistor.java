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
public class Resistor {
    static int counter;
    int resistorNumber;
    Node [] nodes = new Node[2];
    double resistance;

    Resistor(double resistance, Node nodeOne, Node nodeTwo) {
        resistorNumber = ++counter;
        
        {
            
        if (resistance < 0) 
            throw new IllegalArgumentException("The resistance value cannot be negative!");
        
        else {
            this.resistance = resistance;
                }
        }
            nodes[0] = nodeOne;
            nodes[1] = nodeTwo;
            
            if (nodes[0] == nodes[1]){
                throw new IllegalArgumentException("Node must be Unique");
        }
            if ((nodes[0] == null) || (nodes[1] == null)){
                throw new IllegalArgumentException("Specify the node");
        }
    }

    public Node[] getNodes() {
        return nodes;
    }

    @Override

    public String toString() {
        return "R" +resistorNumber + " " + nodes[0] + " " + nodes[1] + " " + resistance + "\n";
    }

}
