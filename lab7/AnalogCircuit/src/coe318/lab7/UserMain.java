package coe318.lab7;

import java.util.Scanner;
public class UserMain {
private static int node1, node2;
private static double value;

public static void main (String [] args) {

Scanner input = new Scanner(System.in);

AnalogCircuit circuit = AnalogCircuit.getInstance();

String component = "";

while (input != null){
    
component = input.nextLine();   
String arr [] = component.split(" ");

if (arr.length > 4){
component = " ";
throw new IllegalArgumentException("Invalid entry, enter the type 'v' or 'r' followed by nodes and value, each separated by a space.");
}

if (component.equals("spice"))
System.out.println(circuit.toString());
if (component.startsWith("v")) {
node1 = Integer.parseInt(arr[1]);
node2 = Integer.parseInt(arr[2]);
value = Double.parseDouble(arr[3]);
Voltage v = new Voltage (node1, node2, value);
circuit.addVoltage(v);
}

if (component.startsWith("r")) {
node1 = Integer.parseInt(arr[1]);
node2 = Integer.parseInt(arr[2]);
value = Double.parseDouble(arr[3]);
Resistor r = new Resistor(node1, node2, value);
circuit.add(r);
}

if (component.equals("end"))
break;
}
System.out.println("All Done!");
}
}