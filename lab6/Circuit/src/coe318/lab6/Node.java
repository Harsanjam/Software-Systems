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
public class Node {
    int nodeNumber;
    static int counter;

    Node() {
        nodeNumber = counter++;
    }

    @Override
    public String toString() {
        return nodeNumber+" ";
    }
    
}