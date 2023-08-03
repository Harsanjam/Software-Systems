package coe318.lab7;

import java.util.ArrayList;
public class AnalogCircuit {
//sets ArrayList and instance variables
private ArrayList<Object> circuit = new ArrayList<Object> ();
private static String circuitString;
private static AnalogCircuit instance = null;
//public static String voltString;

//makes a new Circuit if there isn't one existing
public static AnalogCircuit getInstance() {
if (instance == null) {
instance = new AnalogCircuit();
}
return instance;
}
  
private AnalogCircuit(){
}

//adds a resistor to the ArrayList
public void add( Resistor r) {
circuit.add(r);
}
//adds a voltage source to the ArrayList
public void addVoltage (Voltage v) {
circuit.add(v);
}

//returns the Resistor(s) characteristics for the Circuit
@Override
public String toString(){
circuitString= "";
  
for (int i = 0; i < circuit.size(); i++)
{
circuitString += (circuit.get(i).toString() + "\n");
}

return (circuitString);
}

  
}
