/**
 * This class represents a transaction
 * @author Rowell Herrera and Daniella Ughoc S11A
 */

public class Transaction {
     /**
      * This constructor initializes the name, quantity and the price of the transaction 
      * based on the given name, quantity and price parameters.
      * @param n name of the transaction
      * @param q quantity of the transaction
      * @param p totalprice of the transaction equal product of the price and the quantity
      */
    public Transaction(String n, int q, int p) {
        name = n;
        quantity = q;
        price = p*quantity;
    }
 
    /**
     * This method gets the name of the transaction
     * @return name of the transaction
     */
    public String getName() {
        return name;
    }

    /**
     * This method gets the quantity of the transaction
     * @return the quantity of the transaction
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * This method gets the price of the transaction
     * @return the price of the transaction
     */
    public int getPrice() {
        return price;
    }

    /**
     * This method sets the price of the transaction
     * @param n the name of the transaction
     */
    public void setName(String n) {
        name = n;
    }

    /**
     * This method sets the quantity of the transaction
     * @param q the quantity of the transation
     */
    public void setQuantity(int q) {
        quantity = q;
        price = price * quantity;
    }

    /** the name of the transaction */
    private String name;
    /** the quantity of the transaction */
    private int quantity;
    /** the price of the transaction */
    private int price;
}
