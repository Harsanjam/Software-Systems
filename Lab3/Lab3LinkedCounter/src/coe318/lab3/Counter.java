/**
 *
 * @author Your Name
 */
package coe318.lab3;
public class Counter {
    
    private int digit;
    private Counter neighbour;
    private int count;
            
    //Instance variables here
    public Counter(int modulus, Counter left) {
        neighbour = left;
        digit = modulus;
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return digit;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        return neighbour;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return count;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        count = digit;
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        
        count += 1;
        if(count==getModulus()){
            if (neighbour != null){
                neighbour.increment();
            }
            
            count = 0;
        }
    
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if(neighbour!=null){
            return(count+getModulus()*neighbour.getCount());
        }
        else{
            return getDigit();
        }
        
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
