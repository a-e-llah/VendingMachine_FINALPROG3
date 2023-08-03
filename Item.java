/**
 * This class represents an Item
 * @author Rowell Herrera and Daniella Ughoc S11A
 */
public class Item {
    /**
     * This constructor initializes the name, the price, and the calories
     * of the item based on the given parameters. The category is set to 0 as well.
     * @param n the name of the item
     * @param p the price of the item
     * @param c the calories of the item
     */
    public Item(String n, int p, double c) {
        name = n;
        price = p;
        calories = c;
        category = 0;
    }
    /**
     * This constructor initializes the name, the price, the calories, and the 
     * category of the item based on the given parameters.
     * @param n the name of the item
     * @param p the price of the item
     * @param c the calories of the item
     * @param cat the category of the item
     */
    public Item(String n, int p, double c, int cat) {
        name = n;
        price = p;
        calories = c;
        category = cat;
    }
    /**
     * This method gets the name of the item.
     * @return the name of item
     */
    public String getName() {
        return name;
    }
    /**
     * This method gets the price of the item.
     * @return the price of the item
     */
    public int getPrice() {
        return price;
    }
    /**
     * This method gets the calories of the item.
     * @return the calories of the item
     */
    public double getCalories() {
        return calories;
    }
    /**
     * This method returns the category of the item.
     * @return category category of the item
     */
    public int getCategory() { return category;}
    /**
     * This method sets the price of the item.
     * @param p the new price of the item
     */
    public void setPrice(int p) {
        price = p;
    }
    /**
     * This method sets the calories of the item.
     * @param c the new calories of the item
     */
    public void setCalories(double c) {
        calories = c;
    }
    /**
     * This method sets the name of the item.
     * @param n the new name of the item
     */
    public void setName(String n) {
        name = n;
    }
    /**
     * This method sets the category of the item
     * @param c category of the item
     */
    public void setCategory(int c) { category = c;}

    /** the name of the item */
    private String name;
    /** the price of the item */
    private int price;
    /** the calories of the item */
    private double calories;
    /** the category of the item  */
    private int category;
}