import java.util.ArrayList;
/**
 * This class represents a special vending machine that extends the normal vending machine.
 * 
 * @author Rowell Herrera and Daniella Ughoc S11A
 */



public class SpecialVending extends VendingMachine {
    /**
     * This constructor initializes the number of slots of the machine and the number
     * of items of the special vending machine based on the given parameters below. It initially stocks
     * the ice cream, frozen yogurt, fruits(banana and blueberry), toppings(sprinkles and marshmallow), 
     * and sauces(chocolate and caramel) with ten items of each type.
     * @param numSlots the number of slots
     * @param numItems the number of items
     */
    public SpecialVending(int numSlots, int numItems){
        
        super(numSlots,numItems);

        Item icecream = new Item("Ice Cream", 50, 200, 1);
        Item froyo = new Item("Frozen Yogurt", 50, 200, 1);
        Item banana = new Item("Banana", 20, 90, 2);
        Item blueberry = new Item("Blueberry", 20, 90, 2);
        Item sprinkles = new Item("Sprinkles", 30, 50, 3);
        Item marshmallow = new Item("Marshmallow", 30, 50, 3);
        Item chocolate = new Item("Chocolate", 10, 20, 4);
        Item caramel = new Item("Caramel", 10, 20, 4);
        ArrayList<Item> slot1 = new ArrayList<Item>();
        ArrayList<Item> slot2 = new ArrayList<Item>();
        ArrayList<Item> slot3 = new ArrayList<Item>();
        ArrayList<Item> slot4 = new ArrayList<Item>();
        ArrayList<Item> slot5 = new ArrayList<Item>();
        ArrayList<Item> slot6 = new ArrayList<Item>();
        ArrayList<Item> slot7 = new ArrayList<Item>();
        ArrayList<Item> slot8 = new ArrayList<Item>();
        for (int x=0; x<10; x++) {
            slot1.add(icecream);
            slot2.add(froyo);
            slot3.add(banana);
            slot4.add(blueberry);
            slot5.add(sprinkles);
            slot6.add(marshmallow);
            slot7.add(chocolate);
            slot8.add(caramel);
        }
        slots.add(slot1);
        slots.add(slot2);
        slots.add(slot3);
        slots.add(slot4);
        slots.add(slot5);
        slots.add(slot6);
        slots.add(slot7);
        slots.add(slot8);

        startInventory.clear();
        startQuantity.clear();
        for (ArrayList<Item> i : slots) {
            startInventory.add(i.get(0).getName());
            startQuantity.add(i.size());
        }
        transactions.clear();
    }

}

