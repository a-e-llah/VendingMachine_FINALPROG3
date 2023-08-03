/**
 * This class represents a money
 * @author Rowell Herrera and Daniella Ughoc S11A
 */

public class Money {
    /**
     * This constructor initializes the value of the money
     * based on the given value parameter below.
     * @param val the value of the money
     */
    public Money(int val) {
        value = val;
    }

    /**
     * This method gets the value of the money
     * @return value the value of the money
     */
    public int getValue() {
        return value;
    }

    /**
     * This method sets the value of the money
     * @param val the value of the money
     */
    public void setValue(int val) {
        value = val;
    }

    /** the value of the money */
    private int value;
}
