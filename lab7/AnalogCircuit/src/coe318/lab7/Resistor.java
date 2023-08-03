package coe318.lab7;
public class Resistor {
 
//instance variables
static int i;
int resistorNum;
int [] nodes = new int[2];
double resistance;


//sets the instance variables
Resistor(int node1, int node2, double resistance )

{
    resistorNum = ++i;
    {
        
    if (resistance < 0)
     throw new IllegalArgumentException("Registance can't be negative") ;
    else{
        this.resistance = resistance;
    }
  }
    
nodes [0] = node1;
nodes[1]= node2;

if (nodes [0] == nodes[1]){
    throw new IllegalArgumentException("Nodes must be unique") ;
}
}
public int[] getNodes ()
{
return nodes;
}

@Override
public String toString()
{
return " R" + resistorNum + " " + nodes [0] + " "  + nodes[1] + " " + resistance + "\n";

}

}