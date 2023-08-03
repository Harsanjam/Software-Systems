package coe318.lab7;

public class Voltage {
//instance variables
private double voltage;
private int [] nodes = new int[2];
private int VoltageNum = 0; 


//sets the instance variables
public Voltage(int node1, int node2, double voltage) {
this.voltage = voltage;

VoltageNum++;

nodes [0] = node1;
nodes [1] = node2;

if (nodes[0] == nodes[1]) {  
    
    throw new IllegalArgumentException ("Nodes must be unique") ;
}
}

public int [] getNodes() {
return nodes;
}

@Override
//returns the Voltage's characteristics
public String toString(){
    
return " V" + VoltageNum + " " + nodes[0] + " " + nodes[1] + " DC " + voltage + "\n";
}
}
